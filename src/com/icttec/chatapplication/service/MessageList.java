
package com.icttec.chatapplication.service;

import com.icttec.chatapplication.client.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


//This class is for saving the messages list as an array list thus also a observable
public class MessageList extends Observable{
    private int ChatID;
    //Creating ChatHistorySerialization type object for serializing the chat
    ChatHistorySerialization chatHistorySerialization = new ChatHistorySerialization();
    //Creating ChatHistoryDeserialization type object to deserialize the chat history
    ChatHistoryDeserialization chatHistoryDeserialization = new ChatHistoryDeserialization();
    //Getting and saving chat history to decMessageList variable
    ArrayList<Message> decMessageList=chatHistoryDeserialization.deSerializeMsg(ChatID);
    //An array list for saving message list
    public ArrayList<Message> messageList;
    
    //Class constructor
    public MessageList(int ChatID) {
        this.ChatID=ChatID;
        //Saving previously deserialized chat history to the current session's chat history
        this.messageList = decMessageList;
    }
    
    //Method for adding a message to the message list
    public void addMessage(Message message,int ChatID) {
        //Adding new message to list
        messageList.add(message);

        //Serialize message list
        chatHistorySerialization.serializeMsg(messageList,ChatID);
        //Set as changed an notifying observers
        setChanged();
        notifyObservers(messageList);
    }

    //Method for getting full message list
    public ArrayList<Message> getMessageList() {
        return messageList;
    }
}
