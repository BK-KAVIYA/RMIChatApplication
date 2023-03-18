/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icttec.chatapplication.server;

import com.icttec.chatapplication.service.Chat;
import com.icttec.chatapplication.service.ChatService;
import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author KA VI YA
 */
public class Server implements ServerDAO{
    Registry registry;
    Chat chat;
    
    @Override
    public void startServer(int groupID) {
        System.out.println("group id"+groupID);
        try {
            chat = new ChatService(groupID);
            registry = LocateRegistry.createRegistry(2123);
            
            
            registry.bind("ChatAdmin", chat);

            System.out.println("Chat server is running...");

        } catch (RemoteException | AlreadyBoundException e) {
            System.out.println("Exception ocured this server: " + e.getMessage());
        }
    }

    public Chat getChatService(){
        return chat;
    }
    @Override
    public void stopServer() {
        try {
            registry.unbind("ChatAdmin");
            UnicastRemoteObject.unexportObject(chat, true);   
        } catch (RemoteException | NotBoundException ex) {
            JOptionPane.showMessageDialog(null, "Can't Stop Server","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
