/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icttec.chatapplication.service;

import com.icttec.chatapplication.client.Message;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


//This class is for serialize the Chat History (For saving it)
public class ChatHistorySerialization {
    //Serialization method
    public void serializeMsg(ArrayList<Message> msgList,int ChatId) {

        //Using Try catch for handling serialization errors (IO exception basically)
        try {
            //Let's open a file for serialize and save the objects
            FileOutputStream fos = new FileOutputStream("chat_log/"+ChatId+"_.ser");
            //Opening ObjectOutputStream
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Using ObjectOutputStream to write the object to the file
            oos.writeObject(msgList);
            oos.flush();
            //Closing ObjectOutputStream
            oos.close();
            //Closing File
            fos.close();
        } catch (IOException Ex) {
            //Run if IO eception occurs
            System.out.println("IO Exception" + Ex);
        }
    }
}
