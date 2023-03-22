/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icttec.chataplication.admin;

import com.icttec.chataplication.main.ChatLogin;
import com.icttec.chatapplication.client.ChatClient;
import com.icttec.chatapplication.dbmanager.DBManager;
import com.icttec.chatapplication.entity.Groups;
import com.icttec.chatapplication.entity.Users;
import com.icttec.chatapplication.server.Server;
import com.icttec.chatapplication.utility.Utility;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KA VI YA
 */
public class AdminDashboard extends javax.swing.JFrame {


    
    private int y;
    private static Users adminUser;
    CardLayout cardLayout1;
    ChatClient chatClient;
    
    public AdminDashboard() {
        initComponents();
        cardLayout1 =(CardLayout)(CardAdmin.getLayout());
        loadGroup(true);
//        chatClient = new ChatClient(getAdmin().getId(), user.getUsername(), user.getNickname(), user.getEmail());
//                    //start client
//                    load_client_groups();
//                    this.start_client();
        
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
        adName1 = new javax.swing.JLabel();
        menuuser1 = new rojerusan.RSMaterialButtonRectangle();
        menucourse1 = new rojerusan.RSMaterialButtonRectangle();
        menunotice1 = new rojerusan.RSMaterialButtonRectangle();
        jLabel100 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        menutimetable2 = new rojerusan.RSMaterialButtonRectangle();
        CardAdmin = new javax.swing.JPanel();
        GroupList = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        chat_list_scrollPane = new javax.swing.JScrollPane();
        group_panel = new javax.swing.JPanel();
        jLabel159 = new javax.swing.JLabel();
        Setting = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        usertype = new javax.swing.JComboBox<String>();
        jLabel116 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        cpwd = new javax.swing.JPasswordField();
        pwd = new javax.swing.JPasswordField();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        ShowPassword1 = new javax.swing.JCheckBox();
        AdUpdate1 = new rojerusan.RSMaterialButtonRectangle();
        edite_profie_pic = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        txtid1 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        CreatGroup = new javax.swing.JPanel();
        jLabel129 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        groupdes = new javax.swing.JTextField();
        jLabel139 = new javax.swing.JLabel();
        cadd2 = new javax.swing.JButton();
        cdelete1 = new javax.swing.JButton();
        groupname = new javax.swing.JTextField();
        cadd3 = new javax.swing.JButton();
        csearch1 = new javax.swing.JButton();
        UserList = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel24 = new javax.swing.JPanel();
        jLabel145 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        timesub1 = new javax.swing.JButton();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        clientList = new javax.swing.JTable();
        searchMail = new javax.swing.JTextField();
        jLabel158 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel149 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        midtxt1 = new javax.swing.JTextField();
        ivoicetxt1 = new javax.swing.JTextField();
        reasontxt1 = new javax.swing.JTextField();
        partstxt1 = new javax.swing.JTextField();
        costtxt1 = new javax.swing.JTextField();
        carid1 = new javax.swing.JTextField();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        Search1 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();

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

        AdUpdate.setBackground(new java.awt.Color(0, 0, 102));
        AdUpdate.setText("Update");
        AdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdUpdateActionPerformed(evt);
            }
        });
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

        jButton9.setText("add image");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
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
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
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
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
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

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("Car ID");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText("Car Name");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("Car Type");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setText("Status");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setText("Price");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 102));
        jLabel44.setText("Add New Car");

        cadd.setBackground(new java.awt.Color(0, 0, 102));
        cadd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cadd.setForeground(new java.awt.Color(255, 255, 255));
        cadd.setText("ADD");
        cadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caddActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("No_of_seats");

        cdelete.setBackground(new java.awt.Color(0, 0, 102));
        cdelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cdelete.setForeground(new java.awt.Color(255, 255, 255));
        cdelete.setText("DELETE");
        cdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdeleteActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel51.setText("Number Plate");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel54.setText("Fuel Type");

        cPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPriceActionPerformed(evt);
            }
        });

        cFueltype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Petrol", "Diesel" }));

        cadd1.setBackground(new java.awt.Color(0, 0, 102));
        cadd1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cadd1.setForeground(new java.awt.Color(255, 255, 255));
        cadd1.setText("UPDATE");
        cadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadd1ActionPerformed(evt);
            }
        });

        csearch.setBackground(new java.awt.Color(0, 0, 102));
        csearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        csearch.setForeground(new java.awt.Color(255, 255, 255));
        csearch.setText("SEARCH");
        csearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csearchActionPerformed(evt);
            }
        });

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

        jButton5.setBackground(new java.awt.Color(0, 0, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Search");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel10.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 80, 30));

        timesub.setBackground(new java.awt.Color(0, 0, 102));
        timesub.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        timesub.setForeground(new java.awt.Color(255, 255, 255));
        timesub.setText("Search");
        timesub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesubActionPerformed(evt);
            }
        });
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

        MaintanceID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaintanceIDActionPerformed(evt);
            }
        });
        jPanel10.add(MaintanceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 130, 30));

        jTabbedPane2.addTab("View Maintanance", new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/timetableListr.png")), jPanel10); // NOI18N

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));
        jPanel11.setForeground(new java.awt.Color(255, 255, 255));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 102));
        jLabel53.setText("Add Maintanance");

        jButton7.setBackground(new java.awt.Color(0, 0, 102));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Delete");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 0, 102));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Add");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        midtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midtxtActionPerformed(evt);
            }
        });

        jLabel5.setText("M Id");

        jLabel55.setText("Reason");

        jLabel46.setText("Parts");

        jLabel49.setText("Cost");

        jLabel58.setText("Car ID");

        jLabel61.setText("Invoive No");

        Search.setBackground(new java.awt.Color(0, 0, 102));
        Search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 0, 102));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Update");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

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
        jLabel80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel80MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 20, -1));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/close.png"))); // NOI18N
        jLabel81.setText("jLabel17");
        jLabel81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel81MouseClicked(evt);
            }
        });
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

        bookingidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingidtxtActionPerformed(evt);
            }
        });

        cusidsearch.setBackground(new java.awt.Color(0, 0, 102));
        cusidsearch.setText("Search");
        cusidsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusidsearchActionPerformed(evt);
            }
        });

        booking_id_search.setBackground(new java.awt.Color(0, 0, 102));
        booking_id_search.setText("Search");
        booking_id_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booking_id_searchActionPerformed(evt);
            }
        });

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

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 0, 102));
        jLabel73.setText("Manage Bookings");

        jLabel74.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel74.setText("Booking ID :");

        bidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bidtxtActionPerformed(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel86.setText("Start Date :");

        sdatetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdatetxtActionPerformed(evt);
            }
        });

        jLabel87.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel87.setText("End Date :");

        edatetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edatetxtActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel88.setText("Status :");

        jLabel89.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel89.setText("Deposit Amount :");

        statustxt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pending", "Approve" }));

        jLabel90.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel90.setText("Customer ID :");

        jLabel91.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel91.setText("Car ID :");

        jLabel92.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel92.setText("Driver ID :");

        jLabel93.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel93.setText("Admin ID :");

        bookingadd.setBackground(new java.awt.Color(0, 0, 102));
        bookingadd.setText("Add");
        bookingadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingaddActionPerformed(evt);
            }
        });

        bookingupdate.setBackground(new java.awt.Color(0, 0, 102));
        bookingupdate.setText("Update");
        bookingupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingupdateActionPerformed(evt);
            }
        });

        bookingdelete.setBackground(new java.awt.Color(0, 0, 102));
        bookingdelete.setText("Delete");
        bookingdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingdeleteActionPerformed(evt);
            }
        });

        manage_booking_search.setBackground(new java.awt.Color(0, 0, 102));
        manage_booking_search.setText("Search");
        manage_booking_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage_booking_searchActionPerformed(evt);
            }
        });

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

        jLabel21.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel21.setText("Admin Dashboard >Checkout->");

        BID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BID1ActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel75.setText("Booking ID");

        CID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CID1ActionPerformed(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel76.setText("Customer ID :");

        AID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AIDActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel77.setText("Admin ID :");

        jLabel94.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel94.setText("Date :");

        Date.setEnabled(false);
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });

        jLabel95.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel95.setText("Amount :");

        Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountActionPerformed(evt);
            }
        });

        Invoice.setBackground(new java.awt.Color(255, 255, 255));
        Invoice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 1, true));

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel57.setText("CUSTOMER INVOICE");

        jLabel59.setText("Bill To:");

        jLabel60.setText("MR");

        cusname.setText("Ashan Indarajith");

        cusad1.setText("No120, Kesbewa Road,");

        cusad2.setText("Piliyandala");

        jLabel65.setText("FROM:");

        jLabel67.setText("Get Far Cars");

        jLabel68.setText("No10, Neluwa Road,");

        jLabel69.setText("Galle");

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

        jLabel66.setText("Payment Method:");

        jLabel70.setText("Cash");

        jLabel71.setText("Thank You for Choosing US!");

        jLabel96.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel96.setText("Total :");

        TAmountDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TAmountDisplay.setText("RS : 18000.00");

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

        Csearch4.setBackground(new java.awt.Color(0, 0, 102));
        Csearch4.setText("Add");
        Csearch4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Csearch4ActionPerformed(evt);
            }
        });

        Csearch5.setBackground(new java.awt.Color(0, 0, 102));
        Csearch5.setText("Print");
        Csearch5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Csearch5ActionPerformed(evt);
            }
        });

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
        setUndecorated(true);
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
        jPanel15.add(DashPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 150, 140));

        adName1.setBackground(new java.awt.Color(255, 255, 255));
        adName1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        adName1.setForeground(new java.awt.Color(255, 255, 255));
        adName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adName1.setText("B. Kavinda");
        jPanel15.add(adName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 195, 240, -1));

        menuuser1.setBackground(new java.awt.Color(102, 153, 255));
        menuuser1.setForeground(new java.awt.Color(0, 0, 102));
        menuuser1.setText("GROUPS");
        menuuser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuuser1ActionPerformed(evt);
            }
        });
        jPanel15.add(menuuser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 231, -1, 54));

        menucourse1.setBackground(new java.awt.Color(102, 153, 255));
        menucourse1.setForeground(new java.awt.Color(0, 0, 102));
        menucourse1.setText("CREATE GROUPS");
        menucourse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menucourse1ActionPerformed(evt);
            }
        });
        jPanel15.add(menucourse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 54));

        menunotice1.setBackground(new java.awt.Color(102, 153, 255));
        menunotice1.setForeground(new java.awt.Color(0, 0, 102));
        menunotice1.setText("USER MANAGMENT");
        menunotice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menunotice1ActionPerformed(evt);
            }
        });
        jPanel15.add(menunotice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 54));

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
        menutimetable2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menutimetable2ActionPerformed(evt);
            }
        });
        jPanel15.add(menutimetable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 54));

        getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 622));

        CardAdmin.setLayout(new java.awt.CardLayout());

        GroupList.setBackground(new java.awt.Color(255, 255, 255));

        jLabel103.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel103.setText("Admin Dashboard->");

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

        chat_list_scrollPane.setBackground(new java.awt.Color(28, 36, 47));

        group_panel.setBackground(new java.awt.Color(255, 255, 255));
        group_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        chat_list_scrollPane.setViewportView(group_panel);

        jLabel159.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(0, 0, 102));
        jLabel159.setText("View Group List");

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
            .addGroup(GroupListLayout.createSequentialGroup()
                .addGroup(GroupListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GroupListLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(chat_list_scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupListLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel159)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(16, 16, 16)
                .addComponent(jLabel159)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chat_list_scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        CardAdmin.add(GroupList, "GroupList");

        Setting.setBackground(new java.awt.Color(255, 255, 255));
        Setting.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/back_red.png"))); // NOI18N
        jLabel112.setText("jLabel16");
        jLabel112.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel112MouseClicked(evt);
            }
        });
        Setting.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 32, -1));

        jLabel113.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel113.setText("Admin Dashboard >Setting->");
        Setting.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 255, 41));

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/close.png"))); // NOI18N
        jLabel114.setText("jLabel17");
        jLabel114.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel114MouseClicked(evt);
            }
        });
        Setting.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 18, 20));

        jLabel115.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel115.setText("Email");
        Setting.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 90, 29));

        email.setEditable(false);
        Setting.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 260, 32));

        usertype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "User" }));
        usertype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertypeActionPerformed(evt);
            }
        });
        Setting.add(usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 260, 28));

        jLabel116.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel116.setText("User Type");
        Setting.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, 32));

        jLabel118.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel118.setText("User Name");
        Setting.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, 32));
        Setting.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 260, 29));

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

        edite_profie_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/user1.png"))); // NOI18N
        edite_profie_pic.setText("jLabel31");
        Setting.add(edite_profie_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, 120));

        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/minimize.png"))); // NOI18N
        jLabel126.setText("jLabel29");
        jLabel126.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel126MouseClicked(evt);
            }
        });
        Setting.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 20, -1));

        jButton10.setText("add image");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        Setting.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        txtid1.setText("Image name");
        Setting.add(txtid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 120, 20));

        jLabel128.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel128.setText("Full Name");
        Setting.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 32));
        Setting.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 260, 29));

        CardAdmin.add(Setting, "Setting");

        CreatGroup.setBackground(new java.awt.Color(255, 255, 255));
        CreatGroup.setForeground(new java.awt.Color(204, 0, 0));
        CreatGroup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel129.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel129.setText("Admin Dashboard >Creat Group->");
        CreatGroup.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/minimize.png"))); // NOI18N
        jLabel143.setText("jLabel29");
        jLabel143.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel143MouseClicked(evt);
            }
        });
        CreatGroup.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 20, -1));

        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/close.png"))); // NOI18N
        jLabel144.setText("jLabel17");
        jLabel144.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel144MouseClicked(evt);
            }
        });
        CreatGroup.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 18, 20));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));

        jLabel134.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel134.setText("Group Name");

        jLabel135.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel135.setText("Group Description");

        groupdes.setScrollOffset(5);

        jLabel139.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(0, 0, 102));
        jLabel139.setText("Create New Group");

        cadd2.setBackground(new java.awt.Color(0, 0, 102));
        cadd2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cadd2.setForeground(new java.awt.Color(255, 255, 255));
        cadd2.setText("ADD");
        cadd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadd2MouseClicked(evt);
            }
        });

        cdelete1.setBackground(new java.awt.Color(0, 0, 102));
        cdelete1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cdelete1.setForeground(new java.awt.Color(255, 255, 255));
        cdelete1.setText("DELETE");
        cdelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdelete1ActionPerformed(evt);
            }
        });

        cadd3.setBackground(new java.awt.Color(0, 0, 102));
        cadd3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cadd3.setForeground(new java.awt.Color(255, 255, 255));
        cadd3.setText("UPDATE");
        cadd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadd3ActionPerformed(evt);
            }
        });

        csearch1.setBackground(new java.awt.Color(0, 0, 102));
        csearch1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        csearch1.setForeground(new java.awt.Color(255, 255, 255));
        csearch1.setText("SEARCH");
        csearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csearch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel139)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(csearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel135)
                        .addComponent(jLabel134)))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(groupname)
                            .addComponent(groupdes)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(cadd2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(cadd3)
                        .addGap(48, 48, 48)
                        .addComponent(cdelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel139)
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(groupname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel134))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(groupdes, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel135))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(csearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadd2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadd3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cdelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        CreatGroup.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 550, 360));

        CardAdmin.add(CreatGroup, "CreatGroup");

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane5.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane5.setForeground(new java.awt.Color(0, 51, 102));
        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));
        jPanel24.setForeground(new java.awt.Color(255, 255, 255));
        jPanel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel145.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel145.setText("Email");
        jPanel24.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 90, 22));

        jButton15.setBackground(new java.awt.Color(0, 0, 102));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Search");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        jPanel24.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 80, 30));

        timesub1.setBackground(new java.awt.Color(0, 0, 102));
        timesub1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        timesub1.setForeground(new java.awt.Color(255, 255, 255));
        timesub1.setText("Delete");
        timesub1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timesub1MouseClicked(evt);
            }
        });
        jPanel24.add(timesub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 80, 30));

        jLabel147.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(0, 0, 102));
        jLabel147.setText("View User List");
        jPanel24.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 11, -1, -1));

        jLabel148.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(0, 0, 102));
        jLabel148.setText("Search");
        jPanel24.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        clientList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "UName", "NName", "Email", "UType"
            }
        ));
        clientList.setGridColor(new java.awt.Color(0, 0, 102));
        clientList.setSelectionBackground(new java.awt.Color(0, 153, 153));
        clientList.setSelectionForeground(new java.awt.Color(255, 255, 204));
        jScrollPane12.setViewportView(clientList);

        jPanel24.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 570, 100));

        searchMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMailActionPerformed(evt);
            }
        });
        jPanel24.add(searchMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, 30));

        jLabel158.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel158.setForeground(new java.awt.Color(0, 0, 102));
        jLabel158.setText("Application User Details");
        jPanel24.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jTabbedPane5.addTab("User Management", new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/timetableListr.png")), jPanel24); // NOI18N

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));
        jPanel25.setForeground(new java.awt.Color(255, 255, 255));

        jLabel149.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(0, 0, 102));
        jLabel149.setText("Add Maintanance");

        jButton16.setBackground(new java.awt.Color(0, 0, 102));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Delete");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(0, 0, 102));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Add");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        midtxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midtxt1ActionPerformed(evt);
            }
        });

        jLabel150.setText("M Id");

        jLabel151.setText("Reason");

        jLabel152.setText("Parts");

        jLabel153.setText("Cost");

        jLabel154.setText("Car ID");

        jLabel155.setText("Invoive No");

        Search1.setBackground(new java.awt.Color(0, 0, 102));
        Search1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Search1.setForeground(new java.awt.Color(255, 255, 255));
        Search1.setText("Search");
        Search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search1ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(0, 0, 102));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Update");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel149)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel153)
                    .addComponent(jLabel151)
                    .addComponent(jLabel150)
                    .addComponent(jLabel152)
                    .addComponent(jLabel154)
                    .addComponent(jLabel155))
                .addGap(47, 47, 47)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(carid1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reasontxt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(midtxt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costtxt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(partstxt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ivoicetxt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 280, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel149)
                .addGap(48, 48, 48)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(midtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel150))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel151)
                    .addComponent(reasontxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel152)
                    .addComponent(partstxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel153)
                    .addComponent(costtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel154))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel155)
                    .addComponent(ivoicetxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Manage Maintanance", new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/addTimetabler.png")), jPanel25); // NOI18N

        jPanel23.add(jTabbedPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 620, 510));

        jLabel156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/minimize.png"))); // NOI18N
        jLabel156.setText("jLabel29");
        jLabel156.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel156MouseClicked(evt);
            }
        });
        jPanel23.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 20, -1));

        jLabel157.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/close.png"))); // NOI18N
        jLabel157.setText("jLabel17");
        jLabel157.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel157MouseClicked(evt);
            }
        });
        jPanel23.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 18, 20));

        javax.swing.GroupLayout UserListLayout = new javax.swing.GroupLayout(UserList);
        UserList.setLayout(UserListLayout);
        UserListLayout.setHorizontalGroup(
            UserListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        UserListLayout.setVerticalGroup(
            UserListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        CardAdmin.add(UserList, "UserList");

        getContentPane().add(CardAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 670, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setAdmin(Users adminUser){
        this.adminUser=adminUser;
        onLoad(getAdmin());
    }
    
    public Users getAdmin(){
        return adminUser;
    }
    
    private void onLoad(Users dfUser){
        adName1.setText(dfUser.getNickname());
        
        byte[] profile_image = dfUser.getProfileImage();
        if(profile_image != null){

                    Utility utility = new Utility();
                    ImageIcon imageicon = utility.toImageIcon(profile_image);

//                    ImageIcon iconresized1 = new ImageIcon(imageicon.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
//                    img_profile.setIcon(iconresized1);
//                    img_profile2.setIcon(iconresized1);
//                    img_profile3.setIcon(iconresized1);
//                    img_profile4.setIcon(iconresized1);
//                    img_profile5.setIcon(iconresized1);
//                    img_profile6.setIcon(iconresized1);

                    ImageIcon iconresized2 = new ImageIcon(imageicon.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
                    DashPhoto.setIcon(iconresized2);
                }
    }
    
    private void updateSection(){
            uname.setText(getAdmin().getUserType());
            fname.setText(getAdmin().getNickname());
            email.setText(getAdmin().getEmail());
            pwd.setText(getAdmin().getPassword());
            cpwd.setText(getAdmin().getPassword());
            usertype.setSelectedItem(getAdmin().getUserType());
            
            byte[] profile_image = getAdmin().getProfileImage();
            
            if(profile_image != null){

                    Utility utility = new Utility();
                    ImageIcon imageicon = utility.toImageIcon(profile_image);

                    ImageIcon iconresized2 = new ImageIcon(imageicon.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
                    edite_profie_pic.setIcon(iconresized2);
                }
    }


    private void menuReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportActionPerformed
      //  AdminReport adminR = new AdminReport();
      //  adminR.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuReportActionPerformed

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

    private void AdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdUpdateActionPerformed
//        if(!(txtRegNo.getText().equals("")&&txtFName.getText().equals("")&&txtEmail.getText().equals("")&&txtAddress.getText().equals("")&&txtaddress2.getText().equals("")&&txtCity2.getText().equals("")&&txtDOB.getText().equals("")&&txtPhone.getText().equals("")&&txtLName1.getText().equals("")&&txtEmail.getText().equals(""))){
//            User user = new User();
//            user.setID(txtRegNo.getText());
//            user.setfName(txtFName.getText());
//            user.setlName(txtLName1.getText());
//            user.setAddressl1(txtAddress.getText());
//            user.setAddressl2(txtaddress2.getText());
//            user.setCity(txtCity2.getText());
//            user.setNIC(txtDOB.getText());
//            user.setEmail(txtEmail.getText());
//            user.setContactno(Integer.parseInt(txtPhone.getText()));
//            user.setGender((String)adGender.getSelectedItem());
//
//            UserImp userImp = new UserImp();
//            userImp.Update(user,"admin");
//            Load();

//        }else{
//            JOptionPane.showMessageDialog(null,"Please fill all the fields!!");
//        }
    }//GEN-LAST:event_AdUpdateActionPerformed

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
//        JFileChooser fchoser=new JFileChooser();
//        fchoser.showOpenDialog(null);
//        File f=fchoser.getSelectedFile();
//        fname=f.getAbsolutePath();
//        ImageIcon micon=new ImageIcon(fname);
//        try {
//            File image=new File(fname);
//            FileInputStream fis=new FileInputStream(image);
//            ByteArrayOutputStream baos=new ByteArrayOutputStream();
//            byte[] buf=new byte[1024];
//            for(int readnum; (readnum=fis.read(buf)) !=-1;)
//            {
//                baos.write(buf,0,readnum);
//            }
//            //  pimage=baos.toByteArray();
//            lblimage.setIcon(resizeImage(fname, buf));
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_jButton9MouseClicked

    private void ScarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScarIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ScarIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        String ctype=(String)cModel.getSelectedItem();
//        ManageCarImp managecarImp = new ManageCarImp();
//        ManageCar managecar = new ManageCar();
//        managecar=managecarImp.Searchtype(ctype);
//
//        DefaultTableModel UFT=(DefaultTableModel) cartable.getModel();
//        UFT.setRowCount(0);
//
//        UFT.addRow(new Object[]{managecar.getCarID(),managecar.getCname(),managecar.getCtype(),managecar.getCstatus(),managecar.getCprice(),managecar.getCseats(),managecar.getCnoplate(),managecar.getCfuel()});
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ScarId.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cModelActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        String CarID=ScarId.getText();
//        ManageCarImp managecarImp = new ManageCarImp();
//        ManageCar managecar = new ManageCar();
//        managecar=managecarImp.Search(CarID);
//
//        DefaultTableModel UFT=(DefaultTableModel) cartable.getModel();
//        UFT.setRowCount(0);
//
//        UFT.addRow(new Object[]{managecar.getCarID(),managecar.getCname(),managecar.getCtype(),managecar.getCstatus(),managecar.getCprice(),managecar.getCseats(),managecar.getCnoplate(),managecar.getCfuel()});

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ScarId.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void caddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caddActionPerformed

//        if(!(carId.getText().equals("")&&cName.getText().equals("")&&cType.getText().equals("")&&cStatus.getText().equals("")&&cPrice.getText().equals("")&&cSeats.getText().equals("")&&cNoplate.getText().equals(""))){
//            ManageCar managecar = new ManageCar();
//            managecar.setCarID(carId.getText());
//
//            managecar.setCname(cName.getText());
//            managecar.setCtype(cType.getText());
//            managecar.setCstatus(cStatus.getText());
//            managecar.setCprice(Integer.parseInt(cPrice.getText()));
//            managecar.setCseats(Integer.parseInt(cSeats.getText()));
//            managecar.setCnoplate(cNoplate.getText());
//            managecar.setCfuel((String)cFueltype.getSelectedItem());
//            ManageCarImp managecarImp = new ManageCarImp();
//            managecarImp.Add(managecar);
//            Load();

//        }else{
//            JOptionPane.showMessageDialog(null,"Please fill all the fields!!");
//        }
    }//GEN-LAST:event_caddActionPerformed

    private void cdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdeleteActionPerformed
//        if(!(carId.getText().equals("")&&cName.getText().equals("")&&cType.getText().equals("")&&cStatus.getText().equals("")&&cPrice.getText().equals("")&&cSeats.getText().equals("")&&cNoplate.getText().equals(""))){
//            ManageCar managecar = new ManageCar();
//            managecar.setCarID(cName.getText());
//            ManageCarImp managecarImp = new ManageCarImp();
//            managecarImp.Delete(managecar);
//
//            Load();
//
//            carId.setText("");
//            cName.setText("");
//            cType.setText("");
//            cStatus.setText("");
//            cPrice.setText("");
//            cSeats.setText("");
//            cNoplate.setText("");
//            cFueltype.requestFocus();
//
//        }else{
//            JOptionPane.showMessageDialog(null,"Please fill all the fields!!");
//        }
    }//GEN-LAST:event_cdeleteActionPerformed

    private void cPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cPriceActionPerformed

    private void cadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadd1ActionPerformed
//        if(!(carId.getText().equals("")&&cName.getText().equals("")&&cType.getText().equals("")&&cStatus.getText().equals("")&&cPrice.getText().equals("")&&cSeats.getText().equals("")&&cNoplate.getText().equals(""))){
//            ManageCar managecar = new ManageCar();
//            managecar.setCarID(carId.getText());
//            managecar.setCname(cName.getText());
//            managecar.setCtype(cType.getText());
//            managecar.setCstatus(cStatus.getText());
//            managecar.setCprice(Integer.parseInt(cPrice.getText()));
//            managecar.setCseats(Integer.parseInt(cSeats.getText()));
//            managecar.setCnoplate(cNoplate.getText());
//            managecar.setCfuel((String)cFueltype.getSelectedItem());
//
//            ManageCarImp managecarImp = new ManageCarImp();
//            managecarImp.Update(managecar);
//            Load();
//
//        }else{
//            JOptionPane.showMessageDialog(null,"Please fill all the fields!!");
//        }
    }//GEN-LAST:event_cadd1ActionPerformed

    private void csearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csearchActionPerformed
//        String CarID=(JOptionPane.showInputDialog("Enter the Car ID"));
//        ManageCarImp managecarImp = new ManageCarImp();
//        ManageCar managecar = new ManageCar();
//        managecar=managecarImp.Search(CarID);
//
//        carId.setText(managecar.getCarID());
//        cName.setText(managecar.getCname());
//        cType.setText(managecar.getCtype());
//        cStatus.setText(managecar.getCstatus());
//        cPrice.setText(String.valueOf(managecar.getCprice()));
//        cSeats.setText(String.valueOf(managecar.getCseats()));
//        cNoplate.setText(managecar.getCnoplate());
//        cFueltype.setSelectedItem(managecar.getCfuel());
//        carId.requestFocus();
    }//GEN-LAST:event_csearchActionPerformed

    private void jLabel78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel78MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel78MouseClicked

    private void jLabel79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel79MouseClicked
        int dialogResult=JOptionPane.showConfirmDialog(null,"Do You Want to Exit?", "Warnning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel79MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
//        String MID = MaintanceID.getText();
//        CarMaintananceImp carmaintananceImp = new CarMaintananceImp();
//        CarMaintanance m = new CarMaintanance();
//        m=carmaintananceImp.Serch(MID);
//
//        DefaultTableModel UTF=(DefaultTableModel) jTable3.getModel();
//        UTF.setRowCount(0);
//        UTF.addRow(new Object[]{m.getM_ID(),m.getReason(),m.getParts(),m.getCost(),m.getCar_id(),m.getInvoice_id()});
    }//GEN-LAST:event_jButton5MouseClicked

    private void timesubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesubActionPerformed
//        String CID = CarID.getText();
//        CarMaintananceImp carmaintananceImp = new CarMaintananceImp();
//        CarMaintanance m = new CarMaintanance();
//        m=carmaintananceImp.Serch_cid(CID);
//
//        DefaultTableModel UTF=(DefaultTableModel) jTable3.getModel();
//        UTF.setRowCount(0);
//        UTF.addRow(new Object[]{m.getM_ID(),m.getReason(),m.getParts(),m.getCost(),m.getCar_id(),m.getInvoice_id()});
    }//GEN-LAST:event_timesubActionPerformed

    private void MaintanceIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaintanceIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaintanceIDActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked

    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
//        if(!(midtxt.getText().equals("")&&reasontxt.getText().equals("")&&partstxt.getText().equals("")&&costtxt.getText().equals("")&&carid.getText().equals("")&&ivoicetxt.getText().equals(""))){
//            CarMaintanance carmaintanance = new CarMaintanance();
//            carmaintanance.setM_ID(midtxt.getText());
//            CarMaintananceImp carmaintananceImp = new CarMaintananceImp();
//            carmaintananceImp.Delete(carmaintanance);
//
//            midtxt.setText("");
//            reasontxt.setText("");
//            partstxt.setText("");
//            costtxt.setText("");
//            carid.setText("");
//            ivoicetxt.setText("");
//
//        }else{
//            JOptionPane.showMessageDialog(null,"Please fill all the fields!!");
//        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
//        if(!(midtxt.getText().equals("")&&reasontxt.getText().equals("")&&partstxt.getText().equals("")&&costtxt.getText().equals("")&&carid.getText().equals("")&&ivoicetxt.getText().equals(""))){
//            CarMaintanance carmaintanance = new CarMaintanance();
//            carmaintanance.setM_ID(midtxt.getText());
//            carmaintanance.setReason(reasontxt.getText());
//            carmaintanance.setParts(partstxt.getText());
//            carmaintanance.setCost(Integer.parseInt(costtxt.getText()));
//            carmaintanance.setCar_id(carid.getText());
//            carmaintanance.setInvoice_id(Integer.parseInt(ivoicetxt.getText()));
//
//            CarMaintananceImp carmaintananceImp = new CarMaintananceImp();
//            carmaintananceImp.Add(carmaintanance);
//            Load();
//
//        }else{
//            JOptionPane.showMessageDialog(null,"Please fill all the fields!!");
//        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void midtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midtxtActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
//        String MID=(JOptionPane.showInputDialog("Enter the Maintanance ID"));
//        CarMaintananceImp carmaintananceImp = new CarMaintananceImp();
//        CarMaintanance carmaintanance = new CarMaintanance();
//        carmaintanance=carmaintananceImp.Serch(MID);
//
//        midtxt.setText(carmaintanance.getM_ID());
//        reasontxt.setText(carmaintanance.getReason());
//        partstxt.setText(carmaintanance.getParts());
//        costtxt.setText(String.valueOf(carmaintanance.getCost()));
//        carid.setText(carmaintanance.getCar_id());
//        ivoicetxt.setText(String.valueOf(carmaintanance.getInvoice_id()));
//
//        midtxt.requestFocus();
    }//GEN-LAST:event_SearchActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
//        if(!(midtxt.getText().equals("")&&reasontxt.getText().equals("")&&partstxt.getText().equals("")&&costtxt.getText().equals("")&&carid.getText().equals("")&&ivoicetxt.getText().equals(""))){
//            CarMaintanance carmaintanance = new CarMaintanance();
//
//            carmaintanance.setM_ID(midtxt.getText());
//            carmaintanance.setReason(reasontxt.getText());
//            carmaintanance.setParts(partstxt.getText());
//            carmaintanance.setCost(Integer.parseInt(costtxt.getText()));
//            carmaintanance.setCar_id(carid.getText());
//            carmaintanance.setInvoice_id(Integer.parseInt(ivoicetxt.getText()));
//
//            CarMaintananceImp carmaintananceImp = new CarMaintananceImp();
//            carmaintananceImp.Update(carmaintanance);
//            //Load();
//
//        }else{
//            JOptionPane.showMessageDialog(null,"Please fill all the fields!!");
//        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jLabel80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel80MouseClicked

    private void jLabel81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseClicked
        int dialogResult=JOptionPane.showConfirmDialog(null,"Do You Want to Exit?", "Warnning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel81MouseClicked

    private void bookingidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingidtxtActionPerformed

    private void cusidsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusidsearchActionPerformed

//        String CID=cusidtxt.getText();
//        BookingImp bookingimp = new BookingImp();
//
//        List<Booking> c_booking=bookingimp.SearchCustomerList(CID);
//        DefaultTableModel UFT=(DefaultTableModel) bookingtable.getModel();
//        UFT.setRowCount(0);
//        for(Booking booking:c_booking){
//            UFT.addRow(new Object[]{booking.getBid(),booking.getStartdate(),booking.getEnddate(),booking.getStatus(),booking.getDeposit(),booking.getCustomerid(),booking.getCarid(),booking.getDriverid()});
//        }

    }//GEN-LAST:event_cusidsearchActionPerformed

    private void booking_id_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booking_id_searchActionPerformed
//        String BID=bookingidtxt.getText();
//        BookingImp bookingimp = new BookingImp();
//        Booking booking = new Booking();
//        booking=bookingimp.Search(BID);
//
//        DefaultTableModel UFT=(DefaultTableModel) bookingtable.getModel();
//        UFT.setRowCount(0);
//
//        UFT.addRow(new Object[]{booking.getBid(),booking.getStartdate(),booking.getEnddate(),booking.getStatus(),booking.getDeposit(),booking.getCustomerid(),booking.getCarid(),booking.getDriverid(),booking.getAdminid()});

    }//GEN-LAST:event_booking_id_searchActionPerformed

    private void bidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bidtxtActionPerformed

    private void sdatetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdatetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sdatetxtActionPerformed

    private void edatetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edatetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edatetxtActionPerformed

    private void bookingaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingaddActionPerformed

    //    if(!(bidtxt.getText().equals("")&&sdatetxt.getText().equals("")&&edatetxt.getText().equals("")&&damounttxt.getText().equals("")&&customertxt.getText().equals("")&&drivertxt.getText().equals("")&&cartxt.getText().equals("")&&admintxt.getText().equals(""))){
//            Booking booking = new Booking();
//            Report report = new Report();
//
//            booking.setBid(bidtxt.getText());
//            booking.setStartdate(sdatetxt.getText());
//            booking.setEnddate(edatetxt.getText());
//            booking.setStatus((String)statustxt.getSelectedItem());
//            booking.setDeposit(damounttxt.getText());
//            booking.setCustomerid(customertxt.getText());
//            booking.setDriverid(drivertxt.getText());
//            booking.setCarid(cartxt.getText());
//            booking.setAdminid(admintxt.getText());
//
//            report.setAdminID(getUser());
//            report.setBookingID(bidtxt.getText());
//            report.setCustomerID(customertxt.getText());
//
//            BID1.setText(report.getBookingID());
//            CID1.setText(report.getCustomerID());
//            AID.setText(report.getAdminID());
//
//            BookingImp bookingImp = new BookingImp();
//            bookingImp.Add(booking);
//            Load();
//
//            CalAmount calAmount = new CalAmount();
//            calAmount.setCarID(cartxt.getText());
//            calAmount.setStartDate(sdatetxt.getText());
//            calAmount.setEndDate(edatetxt.getText());
//            double tAmount = calAmount.calAmount();
//            Amount.setText(String.valueOf(tAmount));
//
//        }else{
//            JOptionPane.showMessageDialog(null,"Please fill all the fields!!");
//        }
//
//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        Date.setText(dtf.format(now));
//        cardLayout1.show(CardjPannel,"CardPri6");
    }//GEN-LAST:event_bookingaddActionPerformed

    private void bookingupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingupdateActionPerformed

//        if(!(bidtxt.getText().equals("")&&sdatetxt.getText().equals("")&&edatetxt.getText().equals("")&&damounttxt.getText().equals("")&&customertxt.getText().equals("")&&drivertxt.getText().equals("")&&cartxt.getText().equals("")&&admintxt.getText().equals(""))){
//            Booking booking = new Booking();
//            booking.setBid(bidtxt.getText());
//            booking.setStartdate(sdatetxt.getText());
//            booking.setEnddate(edatetxt.getText());
//            booking.setStatus((String)statustxt.getSelectedItem());
//            booking.setDeposit(damounttxt.getText());
//            booking.setCustomerid(customertxt.getText());
//            booking.setDriverid(drivertxt.getText());
//            booking.setCarid(cartxt.getText());
//            booking.setAdminid(admintxt.getText());
//
//            BookingImp bookingImp = new BookingImp();
//            bookingImp.Update(booking);
//            Load();
//
//        }else{
//            JOptionPane.showMessageDialog(null,"Please fill all the fields!!");
//        }
    }//GEN-LAST:event_bookingupdateActionPerformed

    private void bookingdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingdeleteActionPerformed

//        if(!(bidtxt.getText().equals("")&&sdatetxt.getText().equals("")&&edatetxt.getText().equals("")&&damounttxt.getText().equals("")&&customertxt.getText().equals("")&&drivertxt.getText().equals("")&&cartxt.getText().equals("")&&admintxt.getText().equals(""))){
//            Booking booking = new Booking();
//            booking.setBid(bidtxt.getText());
//            BookingImp bookingImp = new BookingImp();
//            bookingImp.Delete(booking);
//
//            Load();
//
//            bidtxt.setText("");
//            sdatetxt.setText("");
//            edatetxt.setText("");
//            damounttxt.setText("");
//            customertxt.setText("");
//            drivertxt.setText("");
//            cartxt.setText("");
//            admintxt.setText("");
//
//            bidtxt.requestFocus();
//
//        }else{
//            JOptionPane.showMessageDialog(null,"Please fill all the fields!!");
//        }
    }//GEN-LAST:event_bookingdeleteActionPerformed

    private void manage_booking_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manage_booking_searchActionPerformed
//        String BID=(JOptionPane.showInputDialog("Enter the Booking ID"));
//        BookingImp bookingimp = new BookingImp();
//        Booking booking = new Booking();
//        booking=bookingimp.Search(BID);
//
//        bidtxt.setText(booking.getBid());
//        sdatetxt.setText(booking.getStartdate());
//        edatetxt.setText(booking.getEnddate());
//        statustxt.setSelectedItem(booking.getStatus());
//        damounttxt.setText(booking.getDeposit());
//        customertxt.setText(booking.getCustomerid());
//        cartxt.setText(booking.getCarid());
//        drivertxt.setText(booking.getDriverid());
//        admintxt.setText(booking.getAdminid());
//
//        bidtxt.requestFocus();
    }//GEN-LAST:event_manage_booking_searchActionPerformed

    private void jLabel82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel82MouseClicked

    private void jLabel83MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel83MouseClicked
        int dialogResult=JOptionPane.showConfirmDialog(null,"Do You Want to Exit?", "Warnning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel83MouseClicked

    private void BID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BID1ActionPerformed

    private void CID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CID1ActionPerformed

    private void AIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AIDActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateActionPerformed

    private void AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountActionPerformed

    private void Csearch4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Csearch4ActionPerformed
//        Report report = new Report();
//        if(!(BID1.getText().equals("")&&CID1.getText().equals("")&&AID.getText().equals("")&&Date.getText().equals("")&&Amount.getText().equals(""))){
//
//            report.setBookingID(BID1.getText());
//            report.setCustomerID(CID1.getText());
//            report.setAdminID(AID.getText());
//            report.setDate(Date.getText());
//            report.setAmount(Double.parseDouble(Amount.getText()));
//            ReportImp reportImp = new ReportImp();
//            reportImp.Add(report);
//            Load();
//
//        }else{
//            JOptionPane.showMessageDialog(null,"Please fill all the fields!!");
//        }
//
//        DefaultTableModel UFT=(DefaultTableModel) InvoiceTable.getModel();
//        UFT.setRowCount(0);
//
//        UFT.addRow(new Object[]{report.getBookingID(),report.getAdminID(),report.getDate(),report.getText()+report.getAmount()});
//
//        TAmountDisplay.setText("RS: "+report.getAmount());
//
//        ReportImp reportImp1 = new ReportImp();
//        List<Report> report2=reportImp1.InvoiceList(CID1.getText());
//
//        for(Report repo:report2){
//            cusname.setText(repo.getCustomerName());
//            cusad1.setText(repo.getAddress1());
//            cusad2.setText(repo.getAddress2());
//        }

    }//GEN-LAST:event_Csearch4ActionPerformed

    private void Csearch5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Csearch5ActionPerformed

//        PrinterJob job = PrinterJob.getPrinterJob();
//        job.setJobName("Print Data");
//        job.setPrintable(new Printable(){
//            public int print(Graphics pg,PageFormat pf, int pageNum){
//                pf.setOrientation(PageFormat.LANDSCAPE);
//                if(pageNum > 0){
//                    return Printable.NO_SUCH_PAGE;
//                }
//
//                Graphics2D g2 = (Graphics2D)pg;
//                g2.translate(pf.getImageableX(), pf.getImageableY());
//                g2.scale(1.3,1.3);
//
//                Invoice.print(g2);
//
//                return Printable.PAGE_EXISTS;
//
//            }
//
//        });
//        boolean ok = job.printDialog();
//        if(ok){
//            try{
//
//                job.print();
//            }
//            catch (PrinterException ex){
//                ex.printStackTrace();
//            }
//        }
    }//GEN-LAST:event_Csearch5ActionPerformed

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
        cardLayout1.show(CardAdmin,"GroupList");
    }//GEN-LAST:event_menuuser1ActionPerformed

    private void menucourse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menucourse1ActionPerformed
        cardLayout1.show(CardAdmin,"CreatGroup");
    }//GEN-LAST:event_menucourse1ActionPerformed

    private void menunotice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menunotice1ActionPerformed
       cardLayout1.show(CardAdmin,"UserList");
       UserList();      
    }//GEN-LAST:event_menunotice1ActionPerformed

    private void UserList(){
        DefaultTableModel UFT=(DefaultTableModel) clientList.getModel();
       UFT.setRowCount(0);
       DBManager dbManager = new DBManager();
       List<Users> clientList=dbManager.list("User");
       for(Users client:clientList){
            UFT.addRow(new Object[]{client.getId(),client.getUsername(),client.getNickname(),client.getEmail(),client.getUserType()});
        }
    }
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
        cardLayout1.show(CardAdmin,"Setting");
    }//GEN-LAST:event_jLabel101MouseClicked

    private void menutimetable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menutimetable2ActionPerformed
        cardLayout1.show(CardAdmin,"Setting");
    }//GEN-LAST:event_menutimetable2ActionPerformed

    private void jLabel110MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel110MouseClicked
        int dialogResult=JOptionPane.showConfirmDialog(null,"Do You Want to Exit?", "Warnning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_NO_OPTION){    
                System.exit(0);
        }
    }//GEN-LAST:event_jLabel110MouseClicked

    private void jLabel111MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel111MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel111MouseClicked

    private void jLabel143MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel143MouseClicked
         this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel143MouseClicked

    private void jLabel144MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel144MouseClicked
         int dialogResult=JOptionPane.showConfirmDialog(null,"Do You Want to Exit?", "Warnning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_NO_OPTION){    
                System.exit(0);
        }
    }//GEN-LAST:event_jLabel144MouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
       String Email=searchMail.getText();
       DefaultTableModel UFT=(DefaultTableModel) clientList.getModel();
       UFT.setRowCount(0);
       DBManager dbManager = new DBManager();
       List<Users> clientList=dbManager.searchUser("User",Email);
       for(Users client:clientList){
            UFT.addRow(new Object[]{client.getId(),client.getUsername(),client.getNickname(),client.getEmail(),client.getUserType()});
        }
       if(UFT.getRowCount()==0){
           JOptionPane.showMessageDialog(this,"No User Found!");
       }
    }//GEN-LAST:event_jButton15MouseClicked

    private void searchMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchMailActionPerformed

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void midtxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midtxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midtxt1ActionPerformed

    private void Search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search1ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jLabel156MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel156MouseClicked
         this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel156MouseClicked

    private void jLabel157MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel157MouseClicked
        int dialogResult=JOptionPane.showConfirmDialog(null,"Do You Want to Exit?", "Warnning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_NO_OPTION){    
                System.exit(0);
        }
    }//GEN-LAST:event_jLabel157MouseClicked

    private void csearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_csearch1ActionPerformed

    private void cadd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadd3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadd3ActionPerformed

    private void cdelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdelete1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdelete1ActionPerformed

    private void cadd2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadd2MouseClicked
        // TODO add your handling code here:
        
        String name = groupname.getText();
        String description = groupdes.getText();
        DBManager dbManager = new DBManager();
        if (dbManager.ceratChat(name, description)) {
             JOptionPane.showMessageDialog(this,"Group created sucessfully");          
        } else {
            JOptionPane.showMessageDialog(this,"Group can not create!");
        }
    }//GEN-LAST:event_cadd2MouseClicked


    private void loadGroup(boolean isSignin) {
        y = 20;
        DBManager dbManager = new DBManager();
        List groups = dbManager.getChats();

        group_panel.removeAll();
        //group_panel.repaint();
        //group_panel.revalidate();

        for (Iterator iterator = groups.iterator(); iterator.hasNext();) {
            Groups next = (Groups) iterator.next();

            if (isSignin) {
                //put all chats offline before the admin login
                dbManager.putOffline(next.getId());
            }

            JPanel group = new javax.swing.JPanel();
            group.setBackground(new java.awt.Color(44, 47, 255));
            group.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            JLabel g_action = new javax.swing.JLabel();

            if (dbManager.isOnline(next.getId())) {
                g_action.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/stop.png"))); // NOI18N
            } else {
                g_action.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/start.png"))); // NOI18N
            }

            g_action.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    groupAction(next.getId(), g_action);

                }
            });

            JLabel g_des = new javax.swing.JLabel();
            g_des.setForeground(new java.awt.Color(255, 255, 255));
            g_des.setText("<html>" + next.getDescription() + "</html>");

            JLabel g_name = new javax.swing.JLabel();
            g_name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            g_name.setForeground(new java.awt.Color(255, 255, 255));
            g_name.setText(next.getName());
            
            group.add(g_action, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, 45));
            group.add(g_des, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 36, 163, 33));
            group.add(g_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 160, -1));
            group_panel.add(group, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, y, 470, 90));

            y += 100;
        }
 
    }
    
    
    public void groupAction(int chatId, JLabel Action) {

        File btn_icon = new File("");
        String absolutespath = btn_icon.getAbsolutePath();
        DBManager dbManager = new DBManager();
        Server server = new Server();

        if (dbManager.isOnline(chatId)) {
            dbManager.putOffline(chatId);
            ImageIcon icon = new ImageIcon(absolutespath + "\\src\\PHOTOS\\start.png");
            Action.setIcon(icon);
           // server.stopServer();
        } else if (dbManager.putOnline(chatId)) {
            ImageIcon icon = new ImageIcon(absolutespath + "\\src\\PHOTOS\\stop.png");
            Action.setIcon(icon);
            //start server and nofify  the observers
            server.startServer(chatId);

        }
    }
    
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

    private void jLabel126MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel126MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel126MouseClicked

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

    private void jLabel114MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MouseClicked
         int dialogResult=JOptionPane.showConfirmDialog(null,"Do You Want to Exit?", "Warnning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_NO_OPTION){    
                System.exit(0);
        }
    }//GEN-LAST:event_jLabel114MouseClicked

    private void jLabel112MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel112MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel112MouseClicked

    private void usertypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertypeActionPerformed

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
        updateusers.setId(getAdmin().getId());
        updateusers.setEmail(email.getText().trim());
        updateusers.setUsername(uname.getText().trim());
        updateusers.setNickname(fname.getText().trim());
        updateusers.setPassword(pwd.getText().trim());
        updateusers.setProfileImage(image);
        updateusers.setUserType(getAdmin().getUserType());


        String cpassword = cpwd.getText().trim();
        
            
        DBManager dbManager = new DBManager();
       if((email.getText().equals("")||uname.getText().equals("")||fname.getText().equals("")||pwd.getText().equals("")||cpwd.getText().equals(""))){
            JOptionPane.showMessageDialog(this,"please fill al the fields!!"); 
       }else{
           if(pwd.getText().equalsIgnoreCase(cpassword)){
                if (dbManager.update(updateusers)) {
                    onLoad(updateusers);
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

    private void timesub1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timesub1MouseClicked
       
       String deleteUser =searchMail.getText();
       int id=0;

       DBManager dbManager = new DBManager();
       List<Users> clientList=dbManager.searchUser("User",deleteUser);
       for(Users client:clientList){
            id=client.getId();
        }
       
        int dialogResult=JOptionPane.showConfirmDialog(null,"Do You Want to Delete?", "Warnning",JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_NO_OPTION){    
            if(dbManager.deleteUser(id)){
                   JOptionPane.showMessageDialog(this,"User Deleted!");
                   UserList();
                   searchMail.setText("");
            }else{
                   JOptionPane.showMessageDialog(this,"Something wend wrong!");
             }
        }
 


    }//GEN-LAST:event_timesub1MouseClicked

   
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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
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
    private javax.swing.JPanel CardAdmin;
    private javax.swing.JPanel CardPri1;
    private javax.swing.JPanel CardPri2;
    private javax.swing.JPanel CardPri3;
    private javax.swing.JPanel CardPri4;
    private javax.swing.JPanel CardPri5;
    private javax.swing.JPanel CardPri6;
    private javax.swing.JPanel CardjPannel;
    private javax.swing.JPanel CreatGroup;
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
    private javax.swing.JButton Search1;
    private javax.swing.JPanel Setting;
    private javax.swing.JCheckBox ShowPassword;
    private javax.swing.JCheckBox ShowPassword1;
    private javax.swing.JLabel TAmountDisplay;
    private javax.swing.JPanel UserList;
    private javax.swing.JPasswordField adCPwd;
    private javax.swing.JComboBox<String> adGender;
    private javax.swing.JLabel adName;
    private javax.swing.JLabel adName1;
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
    private javax.swing.JButton cadd2;
    private javax.swing.JButton cadd3;
    private javax.swing.JTextField carId;
    private javax.swing.JTextField carid;
    private javax.swing.JTextField carid1;
    private javax.swing.JTable cartable;
    private javax.swing.JTextField cartxt;
    private javax.swing.JButton cdelete;
    private javax.swing.JButton cdelete1;
    private javax.swing.JScrollPane chat_list_scrollPane;
    private javax.swing.JTable clientList;
    private javax.swing.JTextField costtxt;
    private javax.swing.JTextField costtxt1;
    private javax.swing.JPasswordField cpwd;
    private javax.swing.JButton csearch;
    private javax.swing.JButton csearch1;
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
    private javax.swing.JPanel group_panel;
    private javax.swing.JTextField groupdes;
    private javax.swing.JTextField groupname;
    private javax.swing.JTextField ivoicetxt;
    private javax.swing.JTextField ivoicetxt1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
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
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
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
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblimage;
    private rojerusan.RSMaterialButtonRectangle manage_booking_search;
    private rojerusan.RSMaterialButtonRectangle menuReport;
    private rojerusan.RSMaterialButtonRectangle menucourse;
    private rojerusan.RSMaterialButtonRectangle menucourse1;
    private rojerusan.RSMaterialButtonRectangle menunotice;
    private rojerusan.RSMaterialButtonRectangle menunotice1;
    private rojerusan.RSMaterialButtonRectangle menutimetable1;
    private rojerusan.RSMaterialButtonRectangle menutimetable2;
    private rojerusan.RSMaterialButtonRectangle menuuser;
    private rojerusan.RSMaterialButtonRectangle menuuser1;
    private javax.swing.JTextField midtxt;
    private javax.swing.JTextField midtxt1;
    private javax.swing.JTextField partstxt;
    private javax.swing.JTextField partstxt1;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField reasontxt;
    private javax.swing.JTextField reasontxt1;
    private javax.swing.JTextField sdatetxt;
    private javax.swing.JTextField searchMail;
    private javax.swing.JLabel stCount;
    private javax.swing.JComboBox statustxt;
    private javax.swing.JButton timesub;
    private javax.swing.JButton timesub1;
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
    private javax.swing.JLabel txtid1;
    private javax.swing.JTextField uname;
    private javax.swing.JComboBox<String> usertype;
    // End of variables declaration//GEN-END:variables

    
}
