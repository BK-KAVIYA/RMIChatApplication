
import com.icttec.chatapplication.client.Message;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


/**
 *
 * @author KA VI YA
 */
public class Deserialization {
    public static void main(String[] args) {
        ArrayList<Message> msglist = new ArrayList<Message>();
        Message message=null;
                try {
            FileInputStream fileInputStream = new FileInputStream("chat_log/26_.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            while(true){ 
               msglist=((ArrayList<Message>)objectInputStream.readObject());
//            }
            
//            Object object=null;
//            while ((object=objectInputStream.readObject()) ) {                
//                
//            }
            //message=(Message) objectInputStream.readObject();
           // while(true){
              // msglist=new ArrayList(Arrays.asList(objectInputStream.readObject()));
                //System.out.println("Check "+message.getMessage());
            //}
           // mList = new ArrayList<> (Arrays.asList((Message[])objectInputStream.readObject()));
            //msglist = Arrays.asList(((Message[])objectInputStream.readObject());
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("File Not fount"+ex.getMessage());
        } catch (IOException | ClassNotFoundException ex) {
             System.out.println("Class Not fount"+ex.getMessage());
        }
       //  System.out.println("Check "+message.getMessage());       
         for (Message msg : msglist) {
             System.out.println("Message "+msg.getMessage());
        }
    }
}
