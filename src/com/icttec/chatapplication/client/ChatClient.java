
package com.icttec.chatapplication.client;

import java.io.Serializable;


public class ChatClient implements Serializable {
    private int id;
    private String username;
    private String nickname;
    private String email;
    //ImageIcon avatar;
    private static final long serialVersionUID = 6529685098267757690L;

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

    public ChatClient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
