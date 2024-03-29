
package com.icttec.chatapplication.service;

import com.icttec.chatapplication.client.Message;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


//This class is for decerialize the chat history
public class ChatHistoryDeserialization {
    
    //Deserializing method
    public ArrayList<Message> deSerializeMsg(int ChatId) {
        
        //Let's create an array list to store message list
      ArrayList<Message> decMessageList= new ArrayList<Message>();
        
        //Let's create error handling for IO exception and for class not found exception
        try {
            //Open file for Input stream
            FileInputStream fis = new FileInputStream("chat_log/"+ChatId+"_.ser");
            //Get the decerialized object
            ObjectInputStream ois = new ObjectInputStream(fis);
            //Save the deserialized object after casting into the class variable which we have previously created
           // msglist=new ArrayList(Arrays.asList(objectInputStream.readObject()));
            //decMessageList=new ArrayList(Arrays.asList(ois.readObject()));
            decMessageList=(ArrayList) ois.readObject();
              // decMessageList =  (ArrayList) ois.readObject();
           // System.out.println("de "+decMessageList.forEach(null));
            //Close input stream
            ois.close();
            
            //Close file
            fis.close();
        } catch (IOException Ex) {
            //Runs if IO Exception occurs
            //Basically those will handle Decerilization errors
            System.out.println("IO Exception" + Ex.getMessage());
        } catch (ClassNotFoundException Ex) {
            //Runs if class not found error occurs
            System.out.println("Class not found" + Ex);
        }
                for(Message obj:decMessageList.subList(2, decMessageList.size())){
                     System.out.println(decMessageList.size());
                    System.out.println("check"+obj.getMessage());
                     //chatHistory(obj);
                  }
        return decMessageList;
    }
}
