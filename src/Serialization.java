
import com.icttec.chatapplication.client.Message;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KA VI YA
 */
public class Serialization {
    public static void main(String[] args) {
        ArrayList<Message> msglist = new ArrayList<Message>();
        ArrayList<Message> msglist1 = new ArrayList<Message>();
        Message message1 = new Message();
        Message message2 = new Message();
        message1.setMsgid(5);
        message1.setMessage("test01");
        message2.setMsgid(6);
        message2.setMessage("test02");
        msglist.add(message1);
        msglist.add(message2);
        
        
        Message message3 = new Message();
        Message message4 = new Message();
        message3.setMsgid(7);
        message3.setMessage("test03");
        message4.setMsgid(8);
        message4.setMessage("test04");
        msglist1.add(message3);
        msglist1.add(message4);
        
//        
        msglist.add(message3);
        msglist.add(message4);
        try {
            FileOutputStream fileOut = new FileOutputStream(new File("chat_log/26_.txt"),true);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(msglist);
            out.writeObject(msglist1);
            out.flush();
            out.close();
            fileOut.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        
//        try {
//            FileOutputStream fileOut = new FileOutputStream(new File("chat_log/26_.txt"), true);
//           ObjectOutputStream out = new ObjectOutputStream(fileOut);
//
//            out.writeObject(msglist);
//             out.writeObject(msglist);
//            out.flush();
////            out.close();
////            fileOut.close();
//
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        } catch (IOException e) {
//            System.out.println(e);
//        }
        
        
    }
}
