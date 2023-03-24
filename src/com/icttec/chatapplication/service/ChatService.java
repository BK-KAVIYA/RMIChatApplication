package com.icttec.chatapplication.service;

import com.icttec.chatapplication.client.ChatClient;
import com.icttec.chatapplication.client.Message;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ChatService extends UnicastRemoteObject implements Chat {

    Message newmsg = null;
    int group_id;
    ArrayList<ChatClient> subs = new ArrayList<ChatClient>();
    ArrayList<Message> msglist = new ArrayList<Message>();
    //= new ArrayList<ChatClient>();
    //ChatClient chatClient = new //ChatClient();

    
    public ChatService(int group_id) throws RemoteException {
        super();
        this.group_id = group_id;
        System.out.println("Constructor");
    }

    @Override
    public void send_message(Message msg) {
        System.out.println("inside send msg"+msg.getMessage());
        this.newmsg = msg;
        System.out.println("New save massage function invoke");
        this.save_msg();
    }

    @Override
    public Message broadcast() {
        return this.newmsg;
       
    }

    public void save_msg() {
        
        try {
            FileOutputStream fileOut = new FileOutputStream("chat_log/"+this.newmsg.getGroup_id()+"_.txt", true);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(this.newmsg);
            out.flush();
            out.close();
            fileOut.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
    
    
    
    @Override
    public ArrayList<Message> retriveMSG(){
       msglist = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("chat_log/"+this.newmsg.getGroup_id()+"_.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            msglist=(ArrayList<Message>)objectInputStream.readObject();
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("File Not fount"+ex.getMessage());
        } catch (IOException | ClassNotFoundException ex) {
             System.out.println("Class Not fount"+ex.getMessage());
        }
        return msglist;
    }

    public void retrive_subs() {
        subs = null;
        FileInputStream filein;
        
        try {
            filein = new FileInputStream("subscribers_log/"+group_id + "_subscribers.ser");
            ObjectInputStream inobj = new ObjectInputStream(filein);
            subs = (ArrayList<ChatClient>) inobj.readObject();
            
        } catch ( IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public boolean is_subscribed(int client_id) {
        //retrive_subs();
        
        boolean subscribed=false;
        
        for (ChatClient next : subs) {
            System.out.println("Inside the for");
            //ChatClient next = iterator.next();
            if (next.getId()==client_id) {
                subscribed=true;
                break;
            }
        }
        System.out.println("out the for");
        return subscribed;
    }

    @Override
    public void subscribre(int group_id, ChatClient c) throws RemoteException {
        System.out.println("inside the subcribe");
        subs.add(c);
        try {
            FileOutputStream fileOut = new FileOutputStream("subscribers_log/"+group_id + "_subscribers.ser", true);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(c);
            out.flush();
            out.close();
            fileOut.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    @Override
    public void unsubscribre(int group_id, ChatClient c ) throws RemoteException {
        
        System.out.println(subs.get(0).getId());
        subs.removeIf(n -> (n.getId()==c.getId()));
        

//        try {
//            FileInputStream filein = new FileInputStream(group_id + "_subscribers.ser");
//            ObjectInputStream inobj = new ObjectInputStream(filein);
//            ArrayList<ChatClient> subs_list = (ArrayList<ChatClient>) inobj.readObject();
//
//        } catch (Exception e) {
//
//        }

    }





}
