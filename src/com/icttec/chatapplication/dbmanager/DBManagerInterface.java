/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icttec.chatapplication.dbmanager;

import com.icttec.chatapplication.entity.Users;
import java.util.List;

/**
 *
 * @author KA VI YA
 */
public interface DBManagerInterface {
    public boolean ceratChat(String name,String Description);
    public boolean update(Users udUser);
    public void initiateMessafeFile(String chat_name);
    public List<Users> list(String usertType);
    public List<Users> searchUser(String userType,String Email);
    public boolean deleteUser(int userID);
    public List getChats();
    public void putOffline(int Id);
    public boolean putOnline(int ChatId);
    public boolean isOnline(int chatId);
    public boolean checkAllOffline();
    public List getAvatart(int UserId);
    
}
