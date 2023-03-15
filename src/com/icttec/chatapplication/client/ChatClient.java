
package com.icttec.chatapplication.client;

import com.icttec.chatapplication.service.Chat;
import java.io.Serializable;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ChatClient implements Serializable {
    
    Registry reg;
    Chat chat;
    
    private int id;
    private String username;
    private String nickname;
    private String email;
    //ImageIcon avatar;
    private static final long serialVersionUID = -2023185006551798134L;

    public ChatClient(int id, String username, String nickname, String email) {
        this.id = id;
        this.username = username;
        this.nickname = nickname;
        this.email = email;
        //this.avatar = avatar;
    }

//    public ChatClient(Integer id, String username, String nickname, String email) {
//        this.id = id;
//        this.username = username;
//        this.nickname = nickname;
//        this.email = email;
//    }

 public void startClient() {

        try {
            reg = LocateRegistry.getRegistry("localhost", 2123);
            chat = (Chat) reg.lookup("ChatAdmin");

        } catch (RemoteException | NotBoundException ex) {
            System.out.println(ex);
        }

    }
    
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

//    public ImageIcon getAvatar() {
//        return avatar;
//    }

 
    
    
}
