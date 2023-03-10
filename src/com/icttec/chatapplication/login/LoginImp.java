
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
    public void userLogin(Login logins) {
        Session sess = HibernateUtil.getSessionFactory().openSession();
        ChatLogin loginPage = new ChatLogin();
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
//                byte[] profile_image = user.getProfileImage();
                    int id = user.getId();

                System.out.println(email+username+nickname);
      
//                edit_username.setText(username);
//                edit_nickname.setText(nickname);
//                edit_password.setText(password);
            

                    switch(user.getUserType()){
                        case "admin":
                          
                            AdminDashboard admindashboard = new AdminDashboard();
                            Users adUsers = new Users();
                            adUsers.setNickname(nickname);
                            admindashboard.onLoad(adUsers);
                            
                            loginPage.hide();
                            admindashboard.show();
                            
                            break;
                        case "user":
                            
                            ClientDashboard driverdashboard = new ClientDashboard();
                            Users clUsers = new Users();
                            clUsers.setNickname(nickname);
                            driverdashboard.onLoad(clUsers);
                            
                            loginPage.hide();
                            driverdashboard.show();
                            
                            break;
                        default :
                            JOptionPane.showMessageDialog(loginPage,"user cann't Identified!!");
                    
                    }
                }
                }else{

                     JOptionPane.showMessageDialog(loginPage,"Please Enter the correct username and password!!");
            }

    }}
    

