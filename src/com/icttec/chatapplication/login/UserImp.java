package com.icttec.chatapplication.login;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author KA VI YA
 */
public class UserImp implements UserDAO{
    
    PreparedStatement pst;
    PreparedStatement pst1;
    DBConnector obj=DBConnector.getObject();
    java.sql.Connection conn=obj.getConnection();



    @Override
    public void Update(User user,String UserTable) {
        
        try {
  
                String sql="Update "+UserTable+" set  ID=?,Fname=?,Lname=?,Line1=?,Line2=?,City=?,Gender=?,Telephone=?,Email=?,NIC=? where ID=?;";
                pst=conn.prepareStatement(sql);
                pst.setString(1,user.getID());
                pst.setString(2,user.getfName());
                pst.setString(3,user.getlName());
                pst.setString(4,user.getAddressl1());
                pst.setString(5,user.getAddressl2());
                pst.setString(6,user.getCity());
                pst.setString(7,user.getGender());
                pst.setInt(8,user.getContactno());
                pst.setString(9,user.getEmail());
                pst.setString(10,user.getNIC());
                pst.setString(11,user.getID());


                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data recode is Updated!!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Data Insertion Error!!");
                Logger.getLogger(UserImp.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    @Override
    public void Delete(User user,String UserTable) {
         try {
            String sql="Delete from "+UserTable+" where ID=?;";
            pst=conn.prepareStatement(sql);
            pst.setString(1,user.getID());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Recode Deleted!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Recode Deletion Error!!");
            Logger.getLogger(UserImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public User Serch(String userID) {
        String TableName=null;
        User user = new User();
        char UserType=userID.charAt(0);
        switch(UserType){
            case 'D':
               TableName="driver";
                break;
            case 'C':
               TableName="customer";
                break;
            case 'A':
               TableName="admin";
                break;
        }
        
        

            
        try {
            String sql="select * from "+TableName+" where ID=?;";
            pst=conn.prepareStatement(sql);
            pst.setString(1,userID);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                user.setUserType(TableName);
                user.setID(userID);
                user.setfName(rs.getString("Fname"));
                user.setlName(rs.getString("Lname"));
                user.setAddressl1(rs.getString("Line1"));
                user.setAddressl2(rs.getString("Line2"));
                user.setCity(rs.getString("City"));
                user.setGender(rs.getString("Gender"));
                user.setEmail(rs.getString("Email"));
                user.setNIC(rs.getString("NIC"));
                user.setContactno(rs.getInt("Telephone"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UserImp.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
        return user;
    }

    public List<User> list(String tableName) {
        List<User> list =new ArrayList<User>();
         try {
            
            String sql="Select * from "+tableName+";";
            pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
            while(rs.next()){
                User user = new User();
                user.setID(rs.getString("ID"));
                user.setfName(rs.getString("Fname"));
                user.setlName(rs.getString("Lname"));
                user.setAddressl1(rs.getString("Line1"));
                user.setAddressl2(rs.getString("Line2"));
                user.setCity(rs.getString("City"));
                user.setGender(rs.getString("Gender"));
                user.setEmail(rs.getString("Email"));
                user.setNIC(rs.getString("NIC"));
                user.setContactno(rs.getInt("Telephone"));
                
                list.add(user);
            
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(UserImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         return list;
    }

    public List<User> Userlist() {
        List<User> list =new ArrayList<User>();
            
            
        try {
            String sql="Select * from userrolle;";
            pst=conn.prepareStatement(sql);
            ResultSet rs;
            rs = pst.executeQuery();
            
            while(rs.next()){
                User users = new User();
                users.setUserRolle(rs.getInt("UserRolleID"));
                users.setUserType(rs.getString("UserType"));              
                list.add(users);
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UserImp.class.getName()).log(Level.SEVERE, null, ex);
        }
                  
         return list;
    }

    @Override
    public void Add(User user, String tableName) {
        try {

            String sql="Insert into "+tableName+" Values(?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,user.getID());
            pst.setString(2,user.getfName());
            pst.setString(3,user.getlName());
            pst.setString(4,user.getAddressl1());
            pst.setString(5,user.getAddressl2());
            pst.setString(6,user.getCity());
            pst.setString(7,user.getGender());
            pst.setInt(8,user.getContactno());
            pst.setString(9,user.getEmail());
            pst.setString(10,user.getNIC()); 
            
            pst.executeUpdate();
            
            
            
            String sql1="Insert into user Values(?,?,?,?)";
            pst1=conn.prepareStatement(sql1);
            
            pst1.setString(1, user.getID());
            pst1.setString(2, user.getPassword());
            pst1.setInt(3, user.getUserRolle());
            pst1.setString(4, user.getID());
            pst1.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"New User is added!!");
        } catch (SQLException ex) {
            Logger.getLogger(UserImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<User> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   




    
}
