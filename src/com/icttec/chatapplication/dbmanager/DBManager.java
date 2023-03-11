/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icttec.chatapplication.dbmanager;

import com.icttec.chatapplication.dao.HibernateUtil;
import com.icttec.chatapplication.entity.Files;
import com.icttec.chatapplication.entity.Groups;
import com.icttec.chatapplication.entity.Users;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author KA VI YA
 */
public class DBManager {
    
    
    public boolean ceratChat(String name,String Description){
        
        Session sess = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = sess.beginTransaction();
        Groups groups = new Groups();

        Time time = Time.valueOf(LocalTime.now());
        Date date = Date.valueOf(LocalDate.now());

        groups.setName(name);
        groups.setDescription(Description);
        groups.setCreatedDate(date);
        groups.setStatus(false);
        groups.setCreatedTime(time);
        groups.setStatus(false);

        try {
            sess.save(groups);
            transaction.commit();
            sess.close();
            
            System.out.println("create group ");
            this.initiateMessafeFile(name);
            
            return true;
        } catch (Exception e) {
            System.out.println("Exeption Occur "+e.getMessage());
            return false;
        }
    
    }
    
       public boolean update(Users udUser) {
        Session sess = HibernateUtil.getSessionFactory().openSession();
        Transaction tran = sess.beginTransaction();

//        Users user = (Users) sess.load(Users.class, id);
//        user.setProfileImage(img);
//        user.setUsername(username);
//        user.setNickname(nickname);
//        user.setPassword(password);
        
        try {
        sess.update(udUser);
        tran.commit();
        sess.close();
            
            return true;
        } catch (Exception e) {
            System.out.println("Exeption Occur "+e.getMessage());
            return false;
        }
        
    }
    
   public void initiateMessafeFile(String chat_name) {

        Session sess = HibernateUtil.getSessionFactory().openSession();
        String sql = "FROM Groups WHERE name='" + chat_name + "'";
        Query query = sess.createQuery(sql);
        List Group = query.list();

        Iterator iterator = Group.iterator();
        int chatID=0;
        if (iterator.hasNext()) {
            Groups g = (Groups) iterator.next();
            chatID = g.getId();
        }


        Transaction t = sess.beginTransaction();
        Files files = new Files();

        files.setChatId(chatID);
        files.setLink("chat_log/"+chatID + "_.ser");

        sess.save(files);
        t.commit();
        sess.close();
    }
   
   
}
