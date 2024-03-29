
package com.icttec.chatapplication.login;


import com.ictec.chatapplication.user.ClientDashboard;
import com.icttec.chataplication.admin.AdminDashboard;
import com.icttec.chataplication.main.ChatLogin;
import com.icttec.chatapplication.dao.HibernateUtil;
import com.icttec.chatapplication.entity.Users;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;

public class LoginImp implements LoginDAO{

   
    @Override
    public void userLogin(ChatLogin chatLogin,Login logins) {
        Session sess = HibernateUtil.getSessionFactory().openSession();
        //ChatLogin loginPage = new ChatLogin();
        String sql="FROM Users WHERE username='" + logins.getID() + "' AND password='" + logins.getPassword() + "'";

            Query qu = sess.createQuery(sql);
            List UserList = qu.list();
            if(!UserList.isEmpty()){
                 Iterator i = UserList.iterator();
                if (i.hasNext()) {
                    Users user = (Users) i.next();

                    String email = user.getEmail();
                    String username = user.getUsername();
                    String nickname = user.getNickname();
                    String password = user.getPassword();
                    byte[] profile_image = user.getProfileImage();
                    int id = user.getId();
                    
                    
                    user.setId(id);
                    user.setEmail(email);
                    user.setUsername(username);
                    user.setNickname(nickname);
                    user.setPassword(password);
                    user.setProfileImage(profile_image);
                    


      
//                edit_username.setText(username);
//                edit_nickname.setText(nickname);
//                edit_password.setText(password);
            

                    switch(user.getUserType()){
                        case "Admin":
                          
                            AdminDashboard admindashboard = new AdminDashboard();
//                          Users adUsers = new Users();
//                          adUsers.setNickname(nickname);
                            admindashboard.setAdmin(user);
                            
                            chatLogin.dispose(); //close the loging page
                            admindashboard.show();
                            
                            break;
                        case "User":
                            
                            ClientDashboard clientDashboard = new ClientDashboard();
                            clientDashboard.setClient(user);
                            //Users clUsers = new Users();
                            //clUsers.setNickname(nickname);
                           // clientDashboard.onLoad(clUsers);
                            
                            chatLogin.dispose();
                            clientDashboard.show();
                            
                            break;
                        default :
                            JOptionPane.showMessageDialog(chatLogin,"user cann't Identified!!");
                    
                    }
                }
                }else{

                     JOptionPane.showMessageDialog(chatLogin,"Please Enter the correct username and password!!");
            }

    }}
    

