
package com.ictec.chatapplication.user;

import com.icttec.chataplication.main.ChatLogin;
import com.icttec.chatapplication.client.ChatClient;
import com.icttec.chatapplication.client.Message;
import com.icttec.chatapplication.dbmanager.DBManager;
import com.icttec.chatapplication.entity.Groups;
import com.icttec.chatapplication.entity.Users;
import com.icttec.chatapplication.service.Chat;
import com.icttec.chatapplication.service.ChatService;
import com.icttec.chatapplication.utility.Utility;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.AdjustmentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author KA VI YA
 */
public class ClientDashboard extends javax.swing.JFrame {


    ChatClient user;
    Chat chat;
    DBManager dBManager;
    CardLayout cardLayout1;
    static int EGroupId;
    Users client;
    
    
    public ClientDashboard() {
        
        initComponents();
        cardLayout1 =(CardLayout)(Usercard.getLayout());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        adName = new javax.swing.JLabel();
        menuReport = new rojerusan.RSMaterialButtonRectangle();
        menuuser = new rojerusan.RSMaterialButtonRectangle();
        menucourse = new rojerusan.RSMaterialButtonRectangle();
        menunotice = new rojerusan.RSMaterialButtonRectangle();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menutimetable1 = new rojerusan.RSMaterialButtonRectangle();
        CardjPannel = new javax.swing.JPanel();
        CardPri1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        stCount = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        DriCount = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        BookCount = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        CardPri2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtRegNo = new javax.swing.JTextField();
        adGender = new javax.swing.JComboBox<String>();
        jLabel20 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtaddress2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        adCPwd = new javax.swing.JPasswordField();
        adPwd = new javax.swing.JPasswordField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        ShowPassword = new javax.swing.JCheckBox();
        txtPhone = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        AdUpdate = new rojerusan.RSMaterialButtonRectangle();
        lblimage = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        txtid = new javax.swing.JLabel();
        txtCity1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtCity2 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        txtLName1 = new javax.swing.JTextField();
        CardPri3 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        ScarId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        cModel = new javax.swing.JComboBox<String>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartable = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        cName = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        cType = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        cStatus = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        cadd = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        cdelete = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        carId = new javax.swing.JTextField();
        cPrice = new javax.swing.JTextField();
        cSeats = new javax.swing.JTextField();
        cNoplate = new javax.swing.JTextField();
        cFueltype = new javax.swing.JComboBox();
        cadd1 = new javax.swing.JButton();
        csearch = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        CardPri4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        timesub = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        CarID = new javax.swing.JTextField();
        MaintanceID = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        midtxt = new javax.swing.JTextField();
        ivoicetxt = new javax.swing.JTextField();
        reasontxt = new javax.swing.JTextField();
        partstxt = new javax.swing.JTextField();
        costtxt = new javax.swing.JTextField();
        carid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        CardPri5 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        bookingidtxt = new javax.swing.JTextField();
        cusidtxt = new javax.swing.JTextField();
        cusidsearch = new rojerusan.RSMaterialButtonRectangle();
        booking_id_search = new rojerusan.RSMaterialButtonRectangle();
        jScrollPane9 = new javax.swing.JScrollPane();
        bookingtable = new rojeru_san.complementos.RSTableMetro();
        jPanel14 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        bidtxt = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        sdatetxt = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        edatetxt = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        customertxt = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        damounttxt = new javax.swing.JTextField();
        statustxt = new javax.swing.JComboBox();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        cartxt = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        drivertxt = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        admintxt = new javax.swing.JTextField();
        bookingadd = new rojerusan.RSMaterialButtonRectangle();
        bookingupdate = new rojerusan.RSMaterialButtonRectangle();
        bookingdelete = new rojerusan.RSMaterialButtonRectangle();
        manage_booking_search = new rojerusan.RSMaterialButtonRectangle();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        CardPri6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        BID1 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        CID1 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        AID = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        Amount = new javax.swing.JTextField();
        Invoice = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        cusname = new javax.swing.JLabel();
        cusad1 = new javax.swing.JLabel();
        cusad2 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        InvoiceTable = new rojeru_san.complementos.RSTableMetro();
        jLabel66 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        TAmountDisplay = new javax.swing.JLabel();
        Csearch4 = new rojerusan.RSMaterialButtonRectangle();
        Csearch5 = new rojerusan.RSMaterialButtonRectangle();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        DashPhoto = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        menuuser1 = new rojerusan.RSMaterialButtonRectangle();
        jLabel100 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        menutimetable2 = new rojerusan.RSMaterialButtonRectangle();
        Usercard = new javax.swing.JPanel();
        GroupList = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        chat_list_panel = new javax.swing.JPanel();
        chatlist_title = new javax.swing.JLabel();
        chatlist_setting = new javax.swing.JLabel();
        client_logout1 = new javax.swing.JLabel();
        chat_list_scrollPane1 = new javax.swing.JScrollPane();
        client_groups_panel = new javax.swing.JPanel();
        chat_body_panel = new javax.swing.JPanel();
        chatlist_title2 = new javax.swing.JLabel();
        chatlist_setting2 = new javax.swing.JLabel();
        client_logout2 = new javax.swing.JLabel();
        msgScrollPane = new javax.swing.JScrollPane();
        chat_background = new javax.swing.JPanel();
        msg_typer = new javax.swing.JTextField();
        send_btn = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        Setting = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        edite_profie_pic = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel118 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel128 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        usertype = new javax.swing.JComboBox<String>();
        email = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        cpwd = new javax.swing.JPasswordField();
        pwd = new javax.swing.JPasswordField();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        ShowPassword1 = new javax.swing.JCheckBox();
        AdUpdate1 = new rojerusan.RSMaterialButtonRectangle();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setTitle("Admin Dashboard");
        jFrame1.setUndecorated(true);
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Galle srilanka");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 130, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rent Car Systerm ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 190, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/user1.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 150, 140));

        adName.setBackground(new java.awt.Color(255, 255, 255));
        adName.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        adName.setForeground(new java.awt.Color(255, 255, 255));
        adName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adName.setText("B. Kavinda");
        jPanel1.add(adName, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 195, 240, -1));

        menuReport.setBackground(new java.awt.Color(102, 153, 255));
        menuReport.setForeground(new java.awt.Color(0, 0, 102));
        menuReport.setText("REPORTS");
        menuReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportActionPerformed(evt);
            }
        });
        jPanel1.add(menuReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, 54));

        menuuser.setBackground(new java.awt.Color(102, 153, 255));
        menuuser.setForeground(new java.awt.Color(0, 0, 102));
        menuuser.setText("Manage Users");
        menuuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuuserActionPerformed(evt);
            }
        });
        jPanel1.add(menuuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 231, -1, 54));

        menucourse.setBackground(new java.awt.Color(102, 153, 255));
        menucourse.setForeground(new java.awt.Color(0, 0, 102));
        menucourse.setText("MANAGE CARS");
        menucourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menucourseActionPerformed(evt);
            }
        });
        jPanel1.add(menucourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 54));

        menunotice.setBackground(new java.awt.Color(102, 153, 255));
        menunotice.setForeground(new java.awt.Color(0, 0, 102));
        menunotice.setText("CAR RESERVATION");
        menunotice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menunoticeActionPerformed(evt);
            }
        });
        jPanel1.add(menunotice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 54));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/exit.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 539, 34, -1));

        jPanel6.setBackground(new java.awt.Color(255, 153, 0));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/profileSetting.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 50, 30));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 103, 110));

        menutimetable1.setBackground(new java.awt.Color(102, 153, 255));
        menutimetable1.setForeground(new java.awt.Color(0, 0, 102));
        menutimetable1.setText("MAINTANACE");
        menutimetable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menutimetable1ActionPerformed(evt);
            }
        });
        jPanel1.add(menutimetable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 54));

        jFrame1.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 622));

        CardjPannel.setLayout(new java.awt.CardLayout());

        CardPri1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Admin Dashboard->");

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/carsDashbord5.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CARS");

        stCount.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        stCount.setForeground(new java.awt.Color(51, 153, 255));
        stCount.setText("50");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(stCount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stCount, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/driver.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DRIVERS");

        DriCount.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        DriCount.setForeground(new java.awt.Color(51, 153, 255));
        DriCount.setText("20");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(DriCount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(DriCount, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/booking2.png"))); // NOI18N
        jLabel13.setText("jLabel10");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 200, 113));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("BOOKING");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, 25));

        BookCount.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        BookCount.setForeground(new java.awt.Color(51, 153, 255));
        BookCount.setText("15");
        jPanel5.add(BookCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 60, 50));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/close.png"))); // NOI18N
        jLabel18.setText("jLabel18");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/minimize.png"))); // NOI18N
        jLabel29.setText("jLabel29");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CardPri1Layout = new javax.swing.GroupLayout(CardPri1);
        CardPri1.setLayout(CardPri1Layout);
        CardPri1Layout.setHorizontalGroup(
            CardPri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardPri1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(CardPri1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(CardPri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        CardPri1Layout.setVerticalGroup(
            CardPri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardPri1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CardPri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CardPri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );

        CardjPannel.add(CardPri1, "CardPri1");

        CardPri2.setBackground(new java.awt.Color(255, 255, 255));
        CardPri2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/back_red.png"))); // NOI18N
        jLabel16.setText("jLabel16");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        CardPri2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 32, -1));

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel15.setText("Admin Dashboard >Setting->");
        CardPri2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 255, 41));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/close.png"))); // NOI18N
        jLabel17.setText("jLabel17");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        CardPri2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 18, 20));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("Registration Number");
        CardPri2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 243, 143, 29));
        CardPri2.add(txtRegNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 241, 250, 32));

        adGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        CardPri2.add(adGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 111, 186, 28));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setText("Gender");
        CardPri2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 73, -1, 32));
        CardPri2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 180, 29));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setText("Email");
        CardPri2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, 32));

        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setText("First Name");
        CardPri2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 70, -1, 32));
        CardPri2.add(txtFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 106, 250, 29));
        CardPri2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 323, 398, 32));

        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setText("Adress Line 1");
        CardPri2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 284, -1, 32));
        CardPri2.add(txtaddress2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 400, 180, 32));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setText("Adress Line 2");
        CardPri2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 361, -1, 32));

        jLabel26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel26.setText("NIC");
        CardPri2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 430, -1, 32));

        jLabel27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel27.setText("Phone Number");
        CardPri2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 430, -1, 32));

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 0));
        jLabel28.setText("Once Set the password Cann't Modifiey");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, -1));

        adCPwd.setText("jPassw");
        jPanel3.add(adCPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 125, 181, 30));

        adPwd.setText("jPas1");
        jPanel3.add(adPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 181, 30));

        jLabel32.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Re-enter the Password");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 30));

        jLabel33.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Password");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 100, 30));

        ShowPassword.setBackground(new java.awt.Color(0, 0, 102));
        ShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        ShowPassword.setText(" Show Password");
        ShowPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowPasswordMouseClicked(evt);
            }
        });
        jPanel3.add(ShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        CardPri2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 310, -1, 190));
        CardPri2.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 470, 193, 29));
        CardPri2.add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 470, 176, 29));


        CardPri2.add(AdUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 107, 40));

        lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/user1.png"))); // NOI18N
        lblimage.setText("jLabel31");
        CardPri2.add(lblimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, 120));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/minimize.png"))); // NOI18N
        jLabel30.setText("jLabel29");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        CardPri2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 20, -1));

        CardPri2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        txtid.setText("Image name");
        CardPri2.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 120, 20));
        CardPri2.add(txtCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 400, 180, 32));

        jLabel31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel31.setText("City");
        CardPri2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, 32));
        CardPri2.add(txtCity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 180, 32));

        jLabel97.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel97.setText("Last Name");
        CardPri2.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, 32));
        CardPri2.add(txtLName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 250, 29));

        CardjPannel.add(CardPri2, "CardPri2");

        CardPri3.setBackground(new java.awt.Color(255, 255, 255));
        CardPri3.setForeground(new java.awt.Color(204, 0, 0));
        CardPri3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel34.setText("Admin Dashboard >Manage Cars->");
        CardPri3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 102));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));
        jPanel7.setForeground(new java.awt.Color(0, 0, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 102));
        jLabel35.setText("Search");
        jPanel7.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setText("Car ID");
        jPanel7.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 86, 22));

        ScarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScarIdActionPerformed(evt);
            }
        });
        jPanel7.add(ScarId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 206, 29));

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 80, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 80, 30));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Filter");
        jPanel7.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 33, -1, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setText("Car Model");
        jPanel7.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 86, 22));

        cModel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Waggon R", "Alto", "Premio", "Allion", "Grace" }));
        cModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cModelActionPerformed(evt);
            }
        });
        jPanel7.add(cModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 206, 30));

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));

        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 80, 30));

        jButton4.setBackground(new java.awt.Color(0, 0, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 80, 30));

        cartable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Car ID", "Car Name", "Car Type", "Status", "Price", "No_of_seats", "Number plate", "Fuel Type"
            }
        ));
        cartable.setGridColor(new java.awt.Color(0, 0, 0));
        cartable.setSelectionBackground(new java.awt.Color(0, 153, 153));
        cartable.setSelectionForeground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setViewportView(cartable);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 580, 130));

        jTabbedPane1.addTab("View Car Details", new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/viewCoursr.png")), jPanel7, "View Course Details"); // NOI18N

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));


        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel43)
                            .addComponent(jLabel42)
                            .addComponent(jLabel41)
                            .addComponent(jLabel40)
                            .addComponent(jLabel39)
                            .addComponent(jLabel54)
                            .addComponent(jLabel51))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(cStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(carId)
                                    .addComponent(cFueltype, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cNoplate)
                                    .addComponent(cSeats)
                                    .addComponent(cName)
                                    .addComponent(cType))))))
                .addGap(171, 171, 171))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(csearch, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(cadd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(cadd1)
                .addGap(54, 54, 54)
                .addComponent(cdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(cStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cNoplate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cFueltype, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addGap(47, 47, 47)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(csearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        jTabbedPane1.addTab("Add New Car", new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/addCoursrred.png")), jPanel8); // NOI18N

        CardPri3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 620, 550));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/minimize.png"))); // NOI18N
        jLabel78.setText("jLabel29");
        jLabel78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel78MouseClicked(evt);
            }
        });
        CardPri3.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 20, -1));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/close.png"))); // NOI18N
        jLabel79.setText("jLabel17");
        jLabel79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel79MouseClicked(evt);
            }
        });
        CardPri3.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 18, 20));

        CardjPannel.add(CardPri3, "CardPri3");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setForeground(new java.awt.Color(0, 51, 102));
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setText("Maintanance Id");
        jPanel10.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 90, 22));


        jPanel10.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 80, 30));


        jPanel10.add(timesub, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 80, 30));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel48.setText("Car Id");
        jPanel10.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 86, 22));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 102));
        jLabel50.setText("View Maintanance");
        jPanel10.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 11, -1, -1));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 102));
        jLabel52.setText("Vehicle Maintanance Details");
        jPanel10.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "M ID", "Reason", "Parts", "Cost", "Car ID", "Invoice no"
            }
        ));
        jTable3.setGridColor(new java.awt.Color(0, 0, 102));
        jTable3.setSelectionBackground(new java.awt.Color(0, 153, 153));
        jTable3.setSelectionForeground(new java.awt.Color(255, 255, 204));
        jScrollPane11.setViewportView(jTable3);

        jPanel10.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 570, 100));
        jPanel10.add(CarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 130, 30));


        jPanel10.add(MaintanceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 130, 30));

        jTabbedPane2.addTab("View Maintanance", new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/timetableListr.png")), jPanel10); // NOI18N

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));
        jPanel11.setForeground(new java.awt.Color(255, 255, 255));


        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel53)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(jLabel55)
                    .addComponent(jLabel5)
                    .addComponent(jLabel46)
                    .addComponent(jLabel58)
                    .addComponent(jLabel61))
                .addGap(47, 47, 47)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(carid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reasontxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(midtxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costtxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(partstxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ivoicetxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 280, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel53)
                .addGap(48, 48, 48)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(midtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(reasontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(partstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(costtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(ivoicetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Manage Maintanance", new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/addTimetabler.png")), jPanel11); // NOI18N

        jPanel9.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 620, 510));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/minimize.png"))); // NOI18N
        jLabel80.setText("jLabel29");

        jPanel9.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 20, -1));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/close.png"))); // NOI18N
        jLabel81.setText("jLabel17");

        jPanel9.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 18, 20));

        javax.swing.GroupLayout CardPri4Layout = new javax.swing.GroupLayout(CardPri4);
        CardPri4.setLayout(CardPri4Layout);
        CardPri4Layout.setHorizontalGroup(
            CardPri4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        CardPri4Layout.setVerticalGroup(
            CardPri4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        CardjPannel.add(CardPri4, "CardPri4");

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane3.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane3.setForeground(new java.awt.Color(0, 0, 102));
        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));
        jPanel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 0, 102));
        jLabel72.setText("Most Recent Bookings");

        jLabel84.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel84.setText("Booking ID :");

        jLabel85.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel85.setText("Customer ID :");



        bookingtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Booking ID", "Start Date", "End Date", "Status ", "Deposite", "Cus_ID", "Car ID", "Driver ID"
            }
        ));
        bookingtable.setColorBackgoundHead(new java.awt.Color(0, 0, 102));
        bookingtable.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        bookingtable.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        bookingtable.setFuenteFilas(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bookingtable.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bookingtable.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane9.setViewportView(bookingtable);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(jLabel72))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel85)
                                    .addComponent(jLabel84))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bookingidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cusidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cusidsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(booking_id_search, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 142, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(bookingidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(booking_id_search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(cusidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cusidsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jTabbedPane3.addTab("Bookings", new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/noticeList.png")), jPanel13); // NOI18N

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));


        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel73))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel74)
                        .addGap(18, 18, 18)
                        .addComponent(bidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel86)
                                            .addComponent(jLabel88))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(statustxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sdatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                                            .addComponent(jLabel92)
                                            .addGap(26, 26, 26)
                                            .addComponent(drivertxt))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                                            .addComponent(jLabel90)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(customertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bookingadd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(bookingupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bookingdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(manage_booking_search, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel91)
                                            .addComponent(jLabel93)
                                            .addComponent(jLabel89))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(edatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(damounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(admintxt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel87))))))
                .addGap(96, 96, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel74))
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel87)
                        .addComponent(edatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sdatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel86)
                    .addComponent(damounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89))
                .addGap(24, 24, 24)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(statustxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91)
                    .addComponent(cartxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel90)
                            .addComponent(customertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel93)
                            .addComponent(admintxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(drivertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookingadd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookingupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookingdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manage_booking_search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
        );

        jTabbedPane3.addTab("Manage Booking", new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/addNotice.png")), jPanel14); // NOI18N

        jPanel12.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 620, 530));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/minimize.png"))); // NOI18N
        jLabel82.setText("jLabel29");
        jLabel82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel82MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 20, -1));

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/close.png"))); // NOI18N
        jLabel83.setText("jLabel17");
        jLabel83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel83MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 18, 20));

        javax.swing.GroupLayout CardPri5Layout = new javax.swing.GroupLayout(CardPri5);
        CardPri5.setLayout(CardPri5Layout);
        CardPri5Layout.setHorizontalGroup(
            CardPri5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        CardPri5Layout.setVerticalGroup(
            CardPri5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        CardjPannel.add(CardPri5, "CardPri5");

        CardPri6.setBackground(new java.awt.Color(255, 255, 255));



        Invoice.setBackground(new java.awt.Color(255, 255, 255));
        Invoice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 1, true));



        InvoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Invoice No", "Vehicale Model", "Return Date ", "Amount"
            }
        ));
        InvoiceTable.setAltoHead(25);
        InvoiceTable.setColorBackgoundHead(new java.awt.Color(51, 204, 255));
        InvoiceTable.setColorFilasForeground1(new java.awt.Color(204, 51, 0));
        InvoiceTable.setColorFilasForeground2(new java.awt.Color(255, 0, 0));
        InvoiceTable.setFuenteFilas(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        InvoiceTable.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        InvoiceTable.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane5.setViewportView(InvoiceTable);



        javax.swing.GroupLayout InvoiceLayout = new javax.swing.GroupLayout(Invoice);
        Invoice.setLayout(InvoiceLayout);
        InvoiceLayout.setHorizontalGroup(
            InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InvoiceLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel56))
            .addGroup(InvoiceLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InvoiceLayout.createSequentialGroup()
                        .addGroup(InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cusad2)
                            .addComponent(cusad1)
                            .addGroup(InvoiceLayout.createSequentialGroup()
                                .addComponent(jLabel60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cusname))
                            .addComponent(jLabel59))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel69)
                            .addComponent(jLabel68)
                            .addComponent(jLabel65)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                    .addGroup(InvoiceLayout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(InvoiceLayout.createSequentialGroup()
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel96)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TAmountDisplay)))
                .addContainerGap())
            .addGroup(InvoiceLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel71)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InvoiceLayout.setVerticalGroup(
            InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InvoiceLayout.createSequentialGroup()
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InvoiceLayout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(cusname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cusad1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cusad2))
                    .addGroup(InvoiceLayout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel69)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(jLabel70)
                    .addComponent(jLabel96)
                    .addComponent(TAmountDisplay))
                .addGap(18, 18, 18)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );




        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/minimize.png"))); // NOI18N
        jLabel98.setText("jLabel29");
        jLabel98.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel98MouseClicked(evt);
            }
        });

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/close.png"))); // NOI18N
        jLabel99.setText("jLabel17");
        jLabel99.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel99MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CardPri6Layout = new javax.swing.GroupLayout(CardPri6);
        CardPri6.setLayout(CardPri6Layout);
        CardPri6Layout.setHorizontalGroup(
            CardPri6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardPri6Layout.createSequentialGroup()
                .addGroup(CardPri6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CardPri6Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(CardPri6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CardPri6Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(CardPri6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CardPri6Layout.createSequentialGroup()
                                        .addComponent(jLabel95)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CardPri6Layout.createSequentialGroup()
                                        .addGroup(CardPri6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(CardPri6Layout.createSequentialGroup()
                                                .addComponent(jLabel76)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardPri6Layout.createSequentialGroup()
                                                .addComponent(jLabel75)
                                                .addGap(26, 26, 26)))
                                        .addGroup(CardPri6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BID1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CID1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(CardPri6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel77)
                                    .addComponent(jLabel94))
                                .addGap(18, 18, 18)
                                .addGroup(CardPri6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AID, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(CardPri6Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(CardPri6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(CardPri6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Invoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CardPri6Layout.createSequentialGroup()
                                .addComponent(Csearch5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Csearch4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)))
                .addGap(27, 27, 27))
        );
        CardPri6Layout.setVerticalGroup(
            CardPri6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardPri6Layout.createSequentialGroup()
                .addGroup(CardPri6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CardPri6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CardPri6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(CardPri6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel98)
                            .addComponent(jLabel99))))
                .addGap(14, 14, 14)
                .addGroup(CardPri6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(BID1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77))
                .addGroup(CardPri6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CardPri6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel76))
                    .addGroup(CardPri6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(CardPri6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CID1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel94)
                            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CardPri6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CardPri6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Csearch4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel95)
                        .addComponent(Csearch5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Invoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        CardjPannel.add(CardPri6, "CardPri6");

        jFrame1.getContentPane().add(CardjPannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 670, 600));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(0, 0, 102));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Connect with others");
        jPanel15.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 130, -1));

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Chat Application");
        jPanel15.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 190, 30));

        DashPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/user1.png"))); // NOI18N
        DashPhoto.setText("jLabel6");
        jPanel15.add(DashPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 150, 140));

        userName.setBackground(new java.awt.Color(255, 255, 255));
        userName.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userName.setText("B. Kavinda");
        jPanel15.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 195, 240, -1));

        menuuser1.setBackground(new java.awt.Color(102, 153, 255));
        menuuser1.setForeground(new java.awt.Color(0, 0, 102));
        menuuser1.setText("GROUPS");
        menuuser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuuser1ActionPerformed(evt);
            }
        });
        jPanel15.add(menuuser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 54));

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/exit.png"))); // NOI18N
        jLabel100.setText("jLabel7");
        jLabel100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel100MouseClicked(evt);
            }
        });
        jPanel15.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 539, 34, -1));

        jPanel16.setBackground(new java.awt.Color(255, 153, 0));

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/profileSetting.png"))); // NOI18N
        jLabel101.setText("jLabel8");
        jLabel101.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel101MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel101))
        );

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 50, 30));

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/chat_app_icon-removebg-preview.png"))); // NOI18N
        jLabel102.setText("jLabel1");
        jPanel15.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 90));

        menutimetable2.setBackground(new java.awt.Color(102, 153, 255));
        menutimetable2.setForeground(new java.awt.Color(0, 0, 102));
        menutimetable2.setText("SETTING");
        menutimetable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menutimetable2MouseClicked(evt);
            }
        });
        jPanel15.add(menutimetable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 54));

        getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 622));

        Usercard.setLayout(new java.awt.CardLayout());

        GroupList.setBackground(new java.awt.Color(255, 255, 255));

        jLabel103.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel103.setText("Client Dashboard->");

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/close.png"))); // NOI18N
        jLabel110.setText("jLabel18");
        jLabel110.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel110MouseClicked(evt);
            }
        });

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/minimize.png"))); // NOI18N
        jLabel111.setText("jLabel29");
        jLabel111.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel111MouseClicked(evt);
            }
        });

        chat_list_panel.setBackground(new java.awt.Color(0, 0, 102));
        chat_list_panel.setPreferredSize(new java.awt.Dimension(375, 500));
        chat_list_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chatlist_title.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        chatlist_title.setForeground(new java.awt.Color(255, 255, 255));
        chatlist_title.setText("  Chats Groups");
        chat_list_panel.add(chatlist_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 300, 30));

        chatlist_setting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        chat_list_panel.add(chatlist_setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 30, 30));

        client_logout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        chat_list_panel.add(client_logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 30, 30));

        chat_list_scrollPane1.setBackground(new java.awt.Color(28, 36, 47));

        client_groups_panel.setBackground(new java.awt.Color(51, 153, 255));
        client_groups_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        chat_list_scrollPane1.setViewportView(client_groups_panel);

        chat_list_panel.add(chat_list_scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 390, 410));

        chat_body_panel.setBackground(new java.awt.Color(0, 0, 102));
        chat_body_panel.setPreferredSize(new java.awt.Dimension(375, 500));
        chat_body_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chatlist_title2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        chatlist_title2.setForeground(new java.awt.Color(255, 255, 255));
        chatlist_title2.setText("  Chats");
        chat_body_panel.add(chatlist_title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 30));

        chatlist_setting2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
  
        chat_body_panel.add(chatlist_setting2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 30, 30));

        client_logout2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        chat_body_panel.add(client_logout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 30, 30));

        chat_background.setBackground(new java.awt.Color(0, 0, 102));
        chat_background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        msgScrollPane.setViewportView(chat_background);

        chat_body_panel.add(msgScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 78, 370, 360));

        msg_typer.setBackground(new java.awt.Color(0, 0, 102));
        msg_typer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        msg_typer.setBorder(null);
        msg_typer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                msg_typerKeyPressed(evt);
            }
        });
        chat_body_panel.add(msg_typer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 300, 30));

        send_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/send.png"))); // NOI18N
        send_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        send_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                send_btnMouseClicked(evt);
            }

        });
        chat_body_panel.add(send_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 50, 40));
        chat_body_panel.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 250, 10));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/hrline.png"))); // NOI18N
        chat_body_panel.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 250, 10));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(chat_list_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(chat_body_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(chat_list_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGap(2, 2, 2)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(chat_body_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(chat_list_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(chat_body_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout GroupListLayout = new javax.swing.GroupLayout(GroupList);
        GroupList.setLayout(GroupListLayout);
        GroupListLayout.setHorizontalGroup(
            GroupListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GroupListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 417, Short.MAX_VALUE)
                .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(GroupListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(GroupListLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        GroupListLayout.setVerticalGroup(
            GroupListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GroupListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GroupListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(GroupListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel110)
                        .addComponent(jLabel111)))
                .addContainerGap(548, Short.MAX_VALUE))
            .addGroup(GroupListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(GroupListLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Usercard.add(GroupList, "GroupList");

        Setting.setBackground(new java.awt.Color(255, 255, 255));
        Setting.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/back_red.png"))); // NOI18N
        jLabel112.setText("jLabel16");

        Setting.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 32, -1));

        jLabel113.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel113.setText("Client Dashboard >Setting->");
        Setting.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 255, 41));

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/close.png"))); // NOI18N
        jLabel114.setText("jLabel17");
        jLabel114.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel114MouseClicked(evt);
            }
        });
        Setting.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 18, 20));


        Setting.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 20, -1));

        edite_profie_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/user1.png"))); // NOI18N
        edite_profie_pic.setText("jLabel31");
        Setting.add(edite_profie_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, 120));

        jButton10.setText("add image");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        Setting.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel118.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel118.setText("User Name");
        Setting.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, 32));
        Setting.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 260, 29));

        jLabel128.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel128.setText("Full Name");
        Setting.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 32));

        jLabel115.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel115.setText("Email");
        Setting.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 90, 29));

        jLabel116.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel116.setText("User Type");
        Setting.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, 32));

        usertype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "User", "Admin" }));
        usertype.setEnabled(false);

        Setting.add(usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 260, 28));

        email.setEditable(false);
        Setting.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 260, 32));
        Setting.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 260, 29));

        jPanel20.setBackground(new java.awt.Color(0, 0, 102));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel123.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(255, 0, 0));
        jLabel123.setText("Once Set the password Cann't Modifiey");
        jPanel20.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, -1));

        cpwd.setText("jPassw");
        jPanel20.add(cpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 125, 181, 30));

        pwd.setText("jPas1");
        jPanel20.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 181, 30));

        jLabel124.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(255, 255, 255));
        jLabel124.setText("Re-enter the Password");
        jPanel20.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 30));

        jLabel125.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(255, 255, 255));
        jLabel125.setText("Password");
        jPanel20.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 30));

        ShowPassword1.setBackground(new java.awt.Color(0, 0, 102));
        ShowPassword1.setForeground(new java.awt.Color(255, 255, 255));
        ShowPassword1.setText(" Show Password");
        ShowPassword1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowPassword1MouseClicked(evt);
            }
        });
        jPanel20.add(ShowPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        Setting.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, 190));

        AdUpdate1.setBackground(new java.awt.Color(0, 0, 102));
        AdUpdate1.setText("Update");
        AdUpdate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdUpdate1MouseClicked(evt);
            }
        });
        Setting.add(AdUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 107, 40));

        Usercard.add(Setting, "Setting");

        getContentPane().add(Usercard, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 670, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public DBManager getDBManager(){
        dBManager=new DBManager();
        return dBManager;
    }
    public Users getClient() {
        return client;
    }

    public void setClient(Users client) {
        this.client = client;
        onLoad();
    }
    
    private void onLoad(){
        userName.setText(getClient().getNickname());
//        byte[] profile_image = getClient().getProfileImage();
//        if(profile_image != null){
//
//                    Utility utility = new Utility();
//                    ImageIcon imageicon = utility.toImageIcon(profile_image);

//                    ImageIcon iconresized1 = new ImageIcon(imageicon.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
//                    img_profile.setIcon(iconresized1);
//                    img_profile2.setIcon(iconresized1);
//                    img_profile3.setIcon(iconresized1);
//                    img_profile4.setIcon(iconresized1);
//                    img_profile5.setIcon(iconresized1);
//                    img_profile6.setIcon(iconresized1);
//
//                    ImageIcon iconresized2 = new ImageIcon(imageicon.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
//                    DashPhoto.setIcon(iconresized2);
//                }
        load_client_groups();
        chat_list_default();
        user = new ChatClient(getClient().getId(),getClient().getUsername(),getClient().getNickname(),getClient().getEmail());
        //user.startClient();
        start_client();
        
    }

    public void start_client() {
        System.out.println("Start client");
        try {
           Registry reg = LocateRegistry.getRegistry("localhost", 5476);
            chat = (Chat) reg.lookup("ChatAdmin");

        } catch (RemoteException | NotBoundException ex) {
            System.out.println(ex);
        }

    }
     public void chat_list_default(){
         chat_body_panel.setVisible(false);
         chat_list_panel.setVisible(true);
     }
    private void menuReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuReportActionPerformed
    int y1 = 13;

    public void load_client_groups() {

        List chats = getDBManager().getChats();

        client_groups_panel.removeAll();

        for (Iterator iterator = chats.iterator(); iterator.hasNext();) {
            Groups next = (Groups) iterator.next();

            JPanel client_grp_panel = new javax.swing.JPanel();
            client_grp_panel.setBackground(new java.awt.Color(39, 51, 167));
            client_grp_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            client_grp_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            client_grp_panel.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    enterToChat(next.getId());

                }
            });

            boolean is_sub = false;
            JLabel subscribe = new javax.swing.JLabel();

            if (is_sub) {
                subscribe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/unsubscribe.png"))); // NOI18N
            } else {
                subscribe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/subscribe.png"))); // NOI18N
            }

            if (next.getStatus() == 1) {
                    subscribe.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        subscribe_action(next.getId(), subscribe);
                        String m = msg_typer.getText();
  
                        LocalDateTime myDateObj = LocalDateTime.now();
                        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                        String time_now = myDateObj.format(myFormatObj);
                        Message msg = new Message();
                        msg.setDate_time(time_now);
                        String user = client.getUsername();
                        m = "****** " + user  + " has join the chat " + " ******";
                        //System.out.println("Calling "+m);
                        msg.setMessage(m);
                        try {
                            ChatService chatService = new ChatService(EGroupId);
                            chatService.send_message(msg);
                            System.out.println("Message :"+msg.getMessage());
                        } catch (RemoteException ex) {
                            Logger.getLogger(ClientDashboard.class.getName()).log(Level.SEVERE, null, ex);
                        }


                    }   
                });

            } else {
                subscribe.setEnabled(false);
                subscribe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }

            JLabel grp_dec = new javax.swing.JLabel();
            grp_dec.setForeground(new java.awt.Color(255, 255, 255));
            grp_dec.setText(next.getDescription());

            JLabel statuts_txt = new javax.swing.JLabel();
            statuts_txt.setBackground(new java.awt.Color(28, 36, 47));
            statuts_txt.setForeground(new java.awt.Color(255, 255, 255));

            JLabel statuts_icon = new javax.swing.JLabel();

            if (next.getStatus() == 1) {
                statuts_txt.setText("online");
                statuts_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/online.png")));
            } else {
                statuts_txt.setText("offline");
                statuts_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/offline.png")));
            }

            JLabel grp_name = new javax.swing.JLabel();
            grp_name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            grp_name.setForeground(new java.awt.Color(255, 255, 255));
            grp_name.setText(next.getName());

            client_grp_panel.add(subscribe, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 42, 99, 35));
            client_grp_panel.add(grp_dec, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 42, 160, 35));
            client_grp_panel.add(statuts_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 13, 51, -1));
            client_grp_panel.add(statuts_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 13, 18, 16));
            client_grp_panel.add(grp_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 160, -1));
            client_groups_panel.add(client_grp_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, y1, 350, 96));

            y1 += 110;

        }

    }
    
        public void subscribe_action(int grp_id, JLabel sub_btn) {
        try {
            File btn_icon = new File("");
            String abspath = btn_icon.getAbsolutePath();
            //chat=new ChatService();
          
            if (chat.is_subscribed(user.getId())) {
                chat.unsubscribre(grp_id, user);
                System.out.println("inside the subcribe action true");
                ImageIcon icon = new ImageIcon(abspath + "\\src\\PHOTOS\\subscribe.png");
                sub_btn.setIcon(icon);
            } else {
                chat.subscribre(grp_id, user); 
                System.out.println("inside the subcribe action false");
                ImageIcon icon = new ImageIcon(abspath + "\\src\\PHOTOS\\unsubscribe.png");
                sub_btn.setIcon(icon);
            }

        } catch (RemoteException ex) {
            System.out.println("Exeption occur "+ex.getMessage());
        }
    } 
    public void enterToChat(int groupId) {
       
       try {
           //chat=new ChatService(groupId);
            if (chat.is_subscribed(user.getId())) {
                System.out.println("chat is subcribe");
                chatDefault();
                EGroupId = groupId;
                ChatService chatService = new ChatService(EGroupId);
                ArrayList<Message> message=chatService.retriveMSG();
                for (Message msg : message) {
                    send_msg_handler(msg);
                    System.out.println("enter to chat"+msg.getMessage());
                }
                                
                retrivemsg.start();
            }
        System.out.println("chat is not subcribe");
        } catch (RemoteException ex) {
            System.out.println("Exeption occur "+ex.getMessage());
        }
    }
    
     public void chatDefault() {
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(true);
    }
    
        Thread retrivemsg = new Thread() {
        public void run() {
            int preiv = 0;

            while (true) {
                
                try {

                    Message newmsg = chat.broadcast();
                    if (newmsg != null) {
                        
                        if (preiv != newmsg.getMsgid()) {
                           
                            //System.out.println(nmsg.getDate_time() + "\t" + nmsg.getName() + " : " + nmsg.getMessage() + "\n");

                            System.out.println(newmsg.getMsgid() + "-" + user.getId()+"-"+newmsg.getUserid());
                            if (newmsg.getUserid() == user.getId()) {
                                System.out.println("Thread invoke true");
                                send_msg_handler(newmsg);
                            } else {
                                System.out.println("Thread invoke else");
                                recive_msg_handler(newmsg);
                            }

                            preiv = newmsg.getMsgid();
                        }
                    }

                    Thread.sleep(100);
                } catch (RemoteException | NullPointerException | InterruptedException ex) {
                    System.out.println("Error : "+ex.getMessage());
                }
            }

        }
    };
        int y2 = 210;

    public void recive_msg_handler(Message msg) {
        
        chat_background.repaint();
        chat_background.revalidate();

        JLabel msg_content = new javax.swing.JLabel();
        msg_content.setForeground(new java.awt.Color(255, 255, 255));
        msg_content.setText("<html>" + msg.getMessage() + "</html>");

        JLabel msg_time = new javax.swing.JLabel();
        msg_time.setForeground(new java.awt.Color(255, 255, 255));
        msg_time.setText(msg.getDate_time());

        JLabel msg_name = new javax.swing.JLabel();
        msg_name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        msg_name.setForeground(new java.awt.Color(255, 255, 255));
        msg_name.setText(msg.getName());

        JLabel msg_dp = new javax.swing.JLabel();
        msg_dp.setBackground(new java.awt.Color(28, 36, 47));

        List data = getDBManager().getAvatart(msg.getUserid());
        Iterator i = data.iterator();
        if (i.hasNext()) {
            Users user = (Users) i.next();
            Utility utility = new Utility();
            ImageIcon iconresized = new ImageIcon(utility.toImageIcon(user.getProfileImage()).getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
            msg_dp.setIcon(iconresized);
        }

        JPanel msg_layer = new javax.swing.JPanel();

        msg_layer.setBackground(
                new java.awt.Color(0,153,153));
        msg_layer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        msg_layer.setLayout(
                new org.netbeans.lib.awtextra.AbsoluteLayout());

        msg_layer.add(msg_content,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 260, 40));
        msg_layer.add(msg_time,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 210, -1));
        msg_layer.add(msg_name,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 210, -1));
        msg_layer.add(msg_dp,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, 35, 35));

//        chat_background.add(msg_layer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 280, 110));
        chat_background.add(msg_layer,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(20, y2, 280, 110));

        chat_background.repaint();
        chat_background.revalidate();

        JScrollBar sb = msgScrollPane.getVerticalScrollBar();
        sb.setValue(sb.getMaximum());

        y2 += 120;

    }
        
        public void send_msg_handler(Message msg) {
          
        chat_background.repaint();
        chat_background.revalidate();

        JLabel msg_content = new javax.swing.JLabel();
        msg_content.setForeground(new java.awt.Color(255, 255, 255));
        msg_content.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        msg_content.setText("<html>" + msg.getMessage() + "</html>");

        JLabel msg_time = new javax.swing.JLabel();
        msg_time.setForeground(new java.awt.Color(255, 255, 255));
        msg_time.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        msg_time.setText(msg.getDate_time());

        JLabel msg_name = new javax.swing.JLabel();
        msg_name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        msg_name.setForeground(new java.awt.Color(255, 255, 255));
        msg_name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        msg_name.setText(msg.getName());

        JLabel msg_dp = new javax.swing.JLabel();
        msg_dp.setBackground(new java.awt.Color(54, 63, 77));

        
        List data = getDBManager().getAvatart(msg.getUserid());
        Iterator i = data.iterator();
        if (i.hasNext()) {
            Users user = (Users) i.next();
            Utility utility = new Utility();
            ImageIcon iconresized = new ImageIcon(utility.toImageIcon(user.getProfileImage()).getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
            msg_dp.setIcon(iconresized);
        }

        JPanel msg_layer = new javax.swing.JPanel();
        msg_layer.setBackground(new java.awt.Color(39, 51, 167));
        msg_layer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        msg_layer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msg_layer.add(msg_content, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 260, 40));
        msg_layer.add(msg_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 210, -1));
        msg_layer.add(msg_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, -1));
        msg_layer.add(msg_dp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 35, 35));

        //chat_background.add(msg_layer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 280, 110));
        chat_background.add(msg_layer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, y2, 280, 110));

        JScrollBar sb = msgScrollPane.getVerticalScrollBar();
        sb.setValue(sb.getMaximum());

        chat_background.repaint();
        chat_background.revalidate();

        y2 += 120;
    }
    private void menuuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuuserActionPerformed

    }//GEN-LAST:event_menuuserActionPerformed

    private void menucourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menucourseActionPerformed
        cardLayout1.show(CardjPannel,"CardPri3");
    }//GEN-LAST:event_menucourseActionPerformed

    private void menunoticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menunoticeActionPerformed
        cardLayout1.show(CardjPannel,"CardPri5");

    }//GEN-LAST:event_menunoticeActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        int dialogResult=JOptionPane.showConfirmDialog(null,"Do You Want to Log out?", "Warnning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_NO_OPTION){
            this.dispose();
            ChatLogin lgp = new ChatLogin();
            lgp.show();
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        cardLayout1.show(CardjPannel,"CardPri2");
    }//GEN-LAST:event_jLabel8MouseClicked

    private void menutimetable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menutimetable1ActionPerformed
        cardLayout1.show(CardjPannel,"CardPri4");
    }//GEN-LAST:event_menutimetable1ActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        int dialogResult=JOptionPane.showConfirmDialog(null,"Do You Want to Exit?", "Warnning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        cardLayout1.show(CardjPannel,"CardPri1");
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        int dialogResult=JOptionPane.showConfirmDialog(null,"Do You Want to Exit?", "Warnning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void ShowPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowPasswordMouseClicked
        if(ShowPassword.isSelected()){
            adPwd.setEchoChar((char)0);
            adCPwd.setEchoChar((char)0);
            ShowPassword.setText("Hide Password");
        }
        else{
            adPwd.setEchoChar('•');
            adCPwd.setEchoChar('•');
            ShowPassword.setText("Show Password");
        }
    }//GEN-LAST:event_ShowPasswordMouseClicked


    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel30MouseClicked



    private void ScarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScarIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ScarIdActionPerformed


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ScarId.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cModelActionPerformed


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ScarId.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed



    private void jLabel78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel78MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel78MouseClicked

    private void jLabel79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel79MouseClicked
        int dialogResult=JOptionPane.showConfirmDialog(null,"Do You Want to Exit?", "Warnning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel79MouseClicked



    private void jLabel82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel82MouseClicked

    private void jLabel83MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel83MouseClicked
        int dialogResult=JOptionPane.showConfirmDialog(null,"Do You Want to Exit?", "Warnning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel83MouseClicked




    private void jLabel98MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel98MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel98MouseClicked

    private void jLabel99MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel99MouseClicked
        int dialogResult=JOptionPane.showConfirmDialog(null,"Do You Want to Exit?", "Warnning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel99MouseClicked

    private void menuuser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuuser1ActionPerformed
       cardLayout1.show(Usercard,"GroupList");
    }//GEN-LAST:event_menuuser1ActionPerformed

    private void jLabel100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel100MouseClicked
       int dialogResult=JOptionPane.showConfirmDialog(null,"Do You Want to Log out?", "Warnning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_NO_OPTION){    
            this.dispose();
            ChatLogin lgp = new ChatLogin();
            lgp.show();
        }
    }//GEN-LAST:event_jLabel100MouseClicked

    private void jLabel101MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel101MouseClicked
        updateSection();
        cardLayout1.show(Usercard,"Setting");
    }//GEN-LAST:event_jLabel101MouseClicked

    private void updateSection(){
            uname.setText(getClient().getUsername());
            fname.setText(getClient().getNickname());
            email.setText(getClient().getEmail());
            pwd.setText(getClient().getPassword());
            cpwd.setText(getClient().getPassword());
            usertype.setSelectedItem(getClient().getUserType());
            
            byte[] profile_image = getClient().getProfileImage();
            
            if(profile_image != null){

                    Utility utility = new Utility();
                    ImageIcon imageicon = utility.toImageIcon(profile_image);

                    ImageIcon iconresized2 = new ImageIcon(imageicon.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
                    edite_profie_pic.setIcon(iconresized2);
                }
    }
    
    private void jLabel110MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel110MouseClicked
        int dialogResult=JOptionPane.showConfirmDialog(null,"Do You Want to Exit?", "Warnning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_NO_OPTION){    
                System.exit(0);
        }
    }//GEN-LAST:event_jLabel110MouseClicked

    private void jLabel111MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel111MouseClicked
       this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel111MouseClicked


    private void jLabel114MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MouseClicked
        int dialogResult=JOptionPane.showConfirmDialog(null,"Do You Want to Exit?", "Warnning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_NO_OPTION){    
                System.exit(0);
        }
    }//GEN-LAST:event_jLabel114MouseClicked

    public void sender() {
        String m = msg_typer.getText();
        if (m.equalsIgnoreCase("bye")) {
            
           LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String time_now = myDateObj.format(myFormatObj);

            
            Message msg = new Message();
            msg.setDate_time(time_now);
            String userName = client.getUsername();
            m = "****** " + userName  + " has left the chat " + " ******";

       
            try {
                chat.unsubscribre(EGroupId, user);
            } catch (RemoteException ex) {
                System.out.println("Error Occour in Unscribe "+ex.getMessage());
            }

            this.hide();
            ChatLogin chatLogin = new ChatLogin();
            chatLogin.setVisible(true);


            System.out.println(m);
            msg.setMessage(m);
            
  
            
            JScrollBar vertical = msgScrollPane.getVerticalScrollBar();
            msgScrollPane.setMaximumSize(vertical.getMaximumSize());
        

            try {
                chat.send_message(msg);
                
                msg_typer.setText("");
            } catch (RemoteException ex) {
                System.out.println("Error : "+ex.getMessage());
            }
            
            msgScrollPane.getVerticalScrollBar().addAdjustmentListener((AdjustmentEvent e) -> {
            e.getAdjustable().setValue(e.getAdjustable().getMaximum());
        });
        } else {

            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String time_now = myDateObj.format(myFormatObj);

            Message msg = new Message();
            msg.setGroup_id(EGroupId);
            msg.setMsgid(msg.hashCode());
            msg.setUserid(user.getId());
            msg.setName(user.getUsername());
            msg.setMessage(m);
            msg.setDate_time(time_now);

            try {
                chat.send_message(msg);
                ChatService chatService = new ChatService(EGroupId);
                chatService.save_msg(msg);
                
                msg_typer.setText("");
            } catch (RemoteException ex) {
                System.out.println(ex);
            }
        }
        
    }


    private void msg_typerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_msg_typerKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.sender();
        }
    }//GEN-LAST:event_msg_typerKeyPressed


    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked

        JFileChooser chooser = new JFileChooser(); //open image file file
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png"); //set image type filter
        chooser.setFileFilter(filter); //filter
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) { //if image selected
            File file = chooser.getSelectedFile(); //get selected file
            String strfilepath = file.getAbsolutePath(); //get abs path

            try {
                ImageIcon icon = new ImageIcon(strfilepath); //string image path open as a image icon
                ImageIcon iconresized = new ImageIcon(icon.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT)); //resize image icon fit for profile icon label
                edite_profie_pic.setText(null); // remove label text
                edite_profie_pic.setIcon(iconresized); //set seleted image to profile icon label

            } catch (Exception e) {
                System.out.println("Exception occurred : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton10MouseClicked

 
    private void ShowPassword1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowPassword1MouseClicked
        if(ShowPassword1.isSelected()){
            pwd.setEchoChar((char)0);
            cpwd.setEchoChar((char)0);
            ShowPassword1.setText("Hide Password");
        }
        else{
            pwd.setEchoChar('•');
            cpwd.setEchoChar('•');
            ShowPassword1.setText("Show Password");
        }
    }//GEN-LAST:event_ShowPassword1MouseClicked

    private void AdUpdate1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdUpdate1MouseClicked
        byte[] image = null;

        ImageIcon avatar = (ImageIcon) edite_profie_pic.getIcon();
        if (avatar != null) {
            Utility utility = new Utility();
            try {

                BufferedImage bImage = utility.ImageIconToBufferedImage(avatar);
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ImageIO.write(bImage, "png", bos);
                image = bos.toByteArray();

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage());
            }

        }

        Users updateusers = new Users();
        updateusers.setId(getClient().getId());
        updateusers.setEmail(email.getText().trim());
        updateusers.setUsername(uname.getText().trim());
        updateusers.setNickname(fname.getText().trim());
        updateusers.setPassword(pwd.getText().trim());
        updateusers.setProfileImage(image);
        updateusers.setUserType(getClient().getUserType());

        String cpassword = cpwd.getText().trim();

        DBManager dbManager = new DBManager();
        if((email.getText().equals("")||uname.getText().equals("")||fname.getText().equals("")||pwd.getText().equals("")||cpwd.getText().equals(""))){
            JOptionPane.showMessageDialog(this,"please fill al the fields!!");
        }else{
            if(pwd.getText().equalsIgnoreCase(cpassword)){
                if (dbManager.update(updateusers)) {
                    onLoad();
                    JOptionPane.showMessageDialog(this,"User updated successfully..");
                } else {
                    JOptionPane.showMessageDialog(this,"User can not updated!");
                }
            }else{
                JOptionPane.showMessageDialog(this,"password not match!");
            }
        }

        //        img_profile2.setIcon(avatar);
        //        img_profile2.setIcon(avatar);
    }//GEN-LAST:event_AdUpdate1MouseClicked

    private void menutimetable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menutimetable2MouseClicked
        updateSection();
        cardLayout1.show(Usercard,"Setting");
    }//GEN-LAST:event_menutimetable2MouseClicked

    private void send_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_send_btnMouseClicked
        sender();
    }//GEN-LAST:event_send_btnMouseClicked


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AID;
    private rojerusan.RSMaterialButtonRectangle AdUpdate;
    private rojerusan.RSMaterialButtonRectangle AdUpdate1;
    private javax.swing.JTextField Amount;
    private javax.swing.JTextField BID1;
    private javax.swing.JLabel BookCount;
    private javax.swing.JTextField CID1;
    private javax.swing.JTextField CarID;
    private javax.swing.JPanel CardPri1;
    private javax.swing.JPanel CardPri2;
    private javax.swing.JPanel CardPri3;
    private javax.swing.JPanel CardPri4;
    private javax.swing.JPanel CardPri5;
    private javax.swing.JPanel CardPri6;
    private javax.swing.JPanel CardjPannel;
    private rojerusan.RSMaterialButtonRectangle Csearch4;
    private rojerusan.RSMaterialButtonRectangle Csearch5;
    private javax.swing.JLabel DashPhoto;
    private javax.swing.JTextField Date;
    private javax.swing.JLabel DriCount;
    private javax.swing.JPanel GroupList;
    private javax.swing.JPanel Invoice;
    private rojeru_san.complementos.RSTableMetro InvoiceTable;
    private javax.swing.JTextField MaintanceID;
    private javax.swing.JTextField ScarId;
    private javax.swing.JButton Search;
    private javax.swing.JPanel Setting;
    private javax.swing.JCheckBox ShowPassword;
    private javax.swing.JCheckBox ShowPassword1;
    private javax.swing.JLabel TAmountDisplay;
    private javax.swing.JPanel Usercard;
    private javax.swing.JPasswordField adCPwd;
    private javax.swing.JComboBox<String> adGender;
    private javax.swing.JLabel adName;
    private javax.swing.JPasswordField adPwd;
    private javax.swing.JTextField admintxt;
    private javax.swing.JTextField bidtxt;
    private rojerusan.RSMaterialButtonRectangle booking_id_search;
    private rojerusan.RSMaterialButtonRectangle bookingadd;
    private rojerusan.RSMaterialButtonRectangle bookingdelete;
    private javax.swing.JTextField bookingidtxt;
    private rojeru_san.complementos.RSTableMetro bookingtable;
    private rojerusan.RSMaterialButtonRectangle bookingupdate;
    private javax.swing.JComboBox cFueltype;
    private javax.swing.JComboBox<String> cModel;
    private javax.swing.JTextField cName;
    private javax.swing.JTextField cNoplate;
    private javax.swing.JTextField cPrice;
    private javax.swing.JTextField cSeats;
    private javax.swing.JTextField cStatus;
    private javax.swing.JTextField cType;
    private javax.swing.JButton cadd;
    private javax.swing.JButton cadd1;
    private javax.swing.JTextField carId;
    private javax.swing.JTextField carid;
    private javax.swing.JTable cartable;
    private javax.swing.JTextField cartxt;
    private javax.swing.JButton cdelete;
    private javax.swing.JPanel chat_background;
    private javax.swing.JPanel chat_body_panel;
    private javax.swing.JPanel chat_list_panel;
    private javax.swing.JScrollPane chat_list_scrollPane1;
    private javax.swing.JLabel chatlist_setting;
    private javax.swing.JLabel chatlist_setting2;
    private javax.swing.JLabel chatlist_title;
    private javax.swing.JLabel chatlist_title2;
    private javax.swing.JPanel client_groups_panel;
    private javax.swing.JLabel client_logout1;
    private javax.swing.JLabel client_logout2;
    private javax.swing.JTextField costtxt;
    private javax.swing.JPasswordField cpwd;
    private javax.swing.JButton csearch;
    private javax.swing.JLabel cusad1;
    private javax.swing.JLabel cusad2;
    private rojerusan.RSMaterialButtonRectangle cusidsearch;
    private javax.swing.JTextField cusidtxt;
    private javax.swing.JLabel cusname;
    private javax.swing.JTextField customertxt;
    private javax.swing.JTextField damounttxt;
    private javax.swing.JTextField drivertxt;
    private javax.swing.JTextField edatetxt;
    private javax.swing.JLabel edite_profie_pic;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField ivoicetxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblimage;
    private rojerusan.RSMaterialButtonRectangle manage_booking_search;
    private rojerusan.RSMaterialButtonRectangle menuReport;
    private rojerusan.RSMaterialButtonRectangle menucourse;
    private rojerusan.RSMaterialButtonRectangle menunotice;
    private rojerusan.RSMaterialButtonRectangle menutimetable1;
    private rojerusan.RSMaterialButtonRectangle menutimetable2;
    private rojerusan.RSMaterialButtonRectangle menuuser;
    private rojerusan.RSMaterialButtonRectangle menuuser1;
    private javax.swing.JTextField midtxt;
    private javax.swing.JScrollPane msgScrollPane;
    private javax.swing.JTextField msg_typer;
    private javax.swing.JTextField partstxt;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField reasontxt;
    private javax.swing.JTextField sdatetxt;
    private javax.swing.JLabel send_btn;
    private javax.swing.JLabel stCount;
    private javax.swing.JComboBox statustxt;
    private javax.swing.JButton timesub;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity1;
    private javax.swing.JTextField txtCity2;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName1;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRegNo;
    private javax.swing.JTextField txtaddress2;
    private javax.swing.JLabel txtid;
    private javax.swing.JTextField uname;
    private javax.swing.JLabel userName;
    private javax.swing.JComboBox<String> usertype;
    // End of variables declaration//GEN-END:variables

    
}
