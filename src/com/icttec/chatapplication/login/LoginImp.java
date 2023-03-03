
package com.icttec.chatapplication.login;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginImp implements LoginDAO{

    PreparedStatement pst;
    DBConnector obj=DBConnector.getObject();
    Connection conn=obj.getConnection();
    
    @Override
    public void userLogin(Login logins) {
        LoginPageGetFarCars loginPage = new LoginPageGetFarCars();
        String sql="SELECT * FROM user WHERE user_id='"+logins.getID()+"';";
        try {
            pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
            if(rs.next()){
                if(rs.getString("Password").equals(logins.getPassword())){
                    switch(rs.getInt("Role")){
                        case 1:
                            Admindashboard admindashboard = new Admindashboard();
                            admindashboard.setUser(logins.getID());
                            admindashboard.admin_setting(logins.getID());
                            loginPage.dispose();
                            admindashboard.show();
                            break;
                        case 2:
                            DriverDashboard driverdashboard = new DriverDashboard();
                            //driverdashboard.Load(logins.getID());
                            driverdashboard.setUser(logins.getID());
                            loginPage.dispose();
                            driverdashboard.show();
                            
                            break;
                        default :
                            JOptionPane.showMessageDialog(loginPage,"user cann't Identified!!");
                    
                    }
                }
                }else{
                     JOptionPane.showMessageDialog(loginPage,"Please Enter the correct username and password!!");
            }

        }catch (SQLException ex) {
            Logger.getLogger(LoginImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
