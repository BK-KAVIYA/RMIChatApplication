
package com.icttec.chatapplication.login;

/**
 *
 * @author KA VI YA
 */
public class User {
    private String ID;
    private String fName;
    private String lName;
    private String Addressl1;
    private String Addressl2;
    private String City;
    private String Gender;
    private String Email;
    private String NIC;
    private String UserType;
    private String password;
    private int UserRolle;
    private int Contactno;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public int getContactno() {
        return Contactno;
    }

    public void setContactno(int Contactno) {
        this.Contactno = Contactno;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddressl1() {
        return Addressl1;
    }

    public void setAddressl1(String Addressl1) {
        this.Addressl1 = Addressl1;
    }

    public String getAddressl2() {
        return Addressl2;
    }

    public void setAddressl2(String Addressl2) {
        this.Addressl2 = Addressl2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }


    public int getUserRolle() {
        return UserRolle;
    }

    public void setUserRolle(int UserRolle) {
        this.UserRolle = UserRolle;
    }
     
    
}
