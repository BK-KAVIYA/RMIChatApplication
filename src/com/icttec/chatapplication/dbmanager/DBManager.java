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
public class DBManager implements DBManagerInterface{

    @Override
    public boolean ceratChat(String name, String Description) {
        Session sess = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = sess.beginTransaction();
        Groups groups = new Groups();

        Time time = Time.valueOf(LocalTime.now());
        Date date = Date.valueOf(LocalDate.now());

        groups.setName(name);
        groups.setDescription(Description);
        groups.setCreatedDate(date);
        groups.setStatus(0);
        groups.setCreatedTime(time);
        groups.setStatus(0);

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

    @Override
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

    @Override
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

    @Override
    public List<Users> list(String usertType) {
         
        Session sess = HibernateUtil.getSessionFactory().openSession();
        String sql = "FROM Users WHERE is_deleted=0 AND user_type='" + usertType + "'";
        Query qu = sess.createQuery(sql);
        List User = qu.list();
        return User; 

    }

    @Override
    public List<Users> searchUser(String userType,String Email) {
        Session sess = HibernateUtil.getSessionFactory().openSession();
        String sql = "FROM Users WHERE is_deleted=0 AND email='"+Email+"' AND user_type='" + userType + "'";
        Query qu = sess.createQuery(sql);
        List User = qu.list();
        return User; 
    }

    @Override
    public boolean deleteUser(int userID) {
        Session sess = HibernateUtil.getSessionFactory().openSession();
        Transaction tran = sess.beginTransaction();
        
        Object object = sess.load(Users.class, userID);
        try{
            sess.delete(object);      
            tran.commit();
            sess.close();
            return true;
        }catch(Exception ex){
            System.out.println("Exception Occur "+ex.getMessage());
            return false;
        }
        
    }

    @Override
    public List getChats() {
        Session sess = HibernateUtil.getSessionFactory().openSession();
        String sql = "FROM Groups WHERE is_deleted=0";
        Query qu = sess.createQuery(sql);
        List Group = qu.list();
        return Group;
    }

    @Override
    public void putOffline(int Id) {
        Session sess = HibernateUtil.getSessionFactory().openSession();
        Transaction tran = sess.beginTransaction();

        Groups groups = (Groups) sess.load(Groups.class, Id);
        groups.setStatus(0);

        sess.update(groups);
        tran.commit();
        System.out.println(Id + "is offline...");
        sess.close();
    }

    @Override
    public boolean putOnline(int ChatId) {
        if (checkAllOffline()) {

            Session sess = HibernateUtil.getSessionFactory().openSession();
            Transaction tran = sess.beginTransaction();

            Groups group = (Groups) sess.load(Groups.class, ChatId);
            group.setStatus(1);

            sess.update(group);
            tran.commit();
            System.out.println(ChatId + "is online...");
            sess.close();

            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isOnline(int chatId) {
        Session sess = HibernateUtil.getSessionFactory().openSession();
        String sql = "FROM Groups WHERE status=1 AND id=" + chatId;
        Query qu = sess.createQuery(sql);
        List Group = qu.list();

        Iterator i = Group.iterator();
        if (i.hasNext()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkAllOffline() {
       Session sess = HibernateUtil.getSessionFactory().openSession();
        String sql = "FROM Groups WHERE status=1";
        Query qu = sess.createQuery(sql);
        List Group = qu.list();

        Iterator i = Group.iterator();
        if (i.hasNext()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public List getAvatart(int UserId) {
        Session sess = HibernateUtil.getSessionFactory().openSession();
        String sql = "FROM User WHERE id='" + UserId + "' AND is_deleted=0";
        Query qu = sess.createQuery(sql);
        List User = qu.list();
        return User;
    }
    
    
    
   
   
}
