
package com.icttec.chatapplication.service;

import com.icttec.chatapplication.client.Message;
import com.icttec.chatapplication.client.ChatClient;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;



public interface Chat extends Remote{
    
    public void send_message(Message msg) throws RemoteException;
    
        
    public Message broadcast() throws RemoteException;
    
    public void subscribre(int group_id,ChatClient c) throws RemoteException;
    
    public void unsubscribre(int group_id,ChatClient c) throws RemoteException;
    
    public boolean is_subscribed(int client_id) throws RemoteException;
}
