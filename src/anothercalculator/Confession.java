/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anothercalculator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Confession extends javax.swing.JFrame {

    public Confession() {
        initComponents();
        Connect();
        //LoadConID();
    }

    Connection con;
    PreparedStatement pst, pst2, pst3;
    ResultSet rs, rs2, rs3;
    
    public void Connect()
    {
        try
        {  
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:8889/cis2103","root","root"); 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    /*
    public void LoadConID(){
        try {
            String email = jTextFieldEmail.getText();
            String password = jTextFieldPassword.getText();
                    
            pst = con.prepareStatement("SELECT * FROM Users WHERE Email=? AND Password=?");
            
            pst.setString(1, email);
            pst.setString(2, password);
            
            rs = pst.executeQuery();
                
            if (rs.next() == true){
             
                String SenderID = rs.getString("UserID");
                pst2 = con.prepareStatement("SELECT ConfessID FROM Confession WHERE SenderID=?");
                pst2.setString(1, SenderID);

                rs2 = pst2.executeQuery();
                txtConID.removeAllItems();
                while (rs2.next()){
                    txtConID.addItem(rs2.getString(1));
                }

         
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Confession.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRecipientLN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRelationship = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtConID = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnMycon = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtRecipientFN = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        RecCon = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSenderFN = new javax.swing.JTextField();
        txtRelationship1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtMessage1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSenderLN = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnSearch1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnGShop = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtGift = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtGift1 = new javax.swing.JTextField();
        btnSettings = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ConfessID", "Relationship", "Message", "RecipientLN", "RecipientFN"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Email");

        jLabel2.setText("Password");

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("My Confessions");

        jLabel4.setText("Recipient's last name:");

        jLabel5.setText("Relationship:");

        txtMessage.setColumns(20);
        txtMessage.setRows(5);
        jScrollPane1.setViewportView(txtMessage);

        jLabel6.setText("Message:");

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnBack.setText("Go back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtConID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ConfessID", "Relationship", "Message", "RecipientLN", "RecipientFN", "GiftSent"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        btnMycon.setText("Load All Confessions");
        btnMycon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyconActionPerformed(evt);
            }
        });

        jLabel7.setText("Recipient's first name:");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ConfessID", "Relationship", "Message", "SenderLN", "SenderFN", "GiftReceived"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        RecCon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setText("Received Confessions");

        jLabel9.setText("Sender's first name:");

        txtMessage1.setColumns(20);
        txtMessage1.setRows(5);
        jScrollPane5.setViewportView(txtMessage1);

        jLabel10.setText("Message:");

        jLabel11.setText("Sender's last name:");

        jLabel12.setText("Relationship:");

        btnSearch1.setText("Search");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Select ConfessID:");

        jLabel14.setText("Select ConfessID:");

        btnGShop.setText("Visit the Gift shop!");
        btnGShop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGShopMouseClicked(evt);
            }
        });
        btnGShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGShopActionPerformed(evt);
            }
        });

        jLabel15.setText("Enter GiftID:");

        jLabel16.setText("Gift:");

        btnSettings.setText("Account Settings");
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(txtRelationship, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtRecipientLN, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(txtRecipientFN)
                            .addComponent(btnGShop)
                            .addComponent(jLabel15)
                            .addComponent(txtGift)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(btnMycon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSend))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtSenderLN, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtRelationship1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16)
                            .addComponent(jLabel9)
                            .addComponent(txtSenderFN, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(txtGift1))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldEmail)
                            .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSettings))
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSearch1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RecCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnUpdate)
                                    .addGap(63, 63, 63)
                                    .addComponent(btnSearch)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelete)
                                    .addGap(62, 62, 62)
                                    .addComponent(txtConID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRecipientLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRecipientFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRelationship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(btnGShop))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnSearch)
                            .addComponent(txtConID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete)
                            .addComponent(btnSettings))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSend)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnBack)
                                .addComponent(btnMycon)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(RecCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(btnSearch1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSenderLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSenderFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRelationship1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGift1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        try {
            String email = jTextFieldEmail.getText();
            String password = jTextFieldPassword.getText();
                    
            pst = con.prepareStatement("SELECT * FROM Users WHERE Email=? AND Password=?");
            
            pst.setString(1, email);
            pst.setString(2, password);
            
            rs = pst.executeQuery();
                
            if (rs.next() == true){
                String SenderID = rs.getString("UserID");
                String relationship = txtRelationship.getText();
                String message = txtMessage.getText();
                String recipientln = txtRecipientLN.getText();
                String recipientfn = txtRecipientFN.getText();
                String gift = txtGift.getText();
                
                relationship.replace("'", "\'");
                message.replace("'", "\'");
                recipientln.replace("'", "\'");
                recipientfn.replace("'", "\'");
                
                pst2 = con.prepareStatement("INSERT INTO Confession (SenderID, Relationship, Message, RecipientLN, RecipientFN, GiftFK)VALUES(?,?,?,?,?,?)");
                pst2.setString(1, SenderID);
                pst2.setString(2, relationship);
                pst2.setString(3, message);
                pst2.setString(4, recipientln);
                pst2.setString(5, recipientfn);
                pst2.setString(6, gift);
                
                int k = pst2.executeUpdate();
            
                if (k == 1){
                    JOptionPane.showMessageDialog(this, "Confession sent successfully!");      
                    txtRelationship.setText("");
                    txtMessage.setText("");
                    txtRecipientLN.setText("");
                    txtRecipientFN.setText("");
                    txtGift.setText("");
                    btnMycon.doClick();
                } else {
                    JOptionPane.showMessageDialog(this, "Confession failed to be sent!");
                }
                
                pst3 = con.prepareStatement("INSERT INTO Notification (GiftID, BuyerID, Operation)VALUES(?,?,'INSERT')");
                pst3.setString(1, gift);
                pst3.setString(2, SenderID);
                
                int k2 = pst3.executeUpdate();
           
            }
        } catch (SQLException ex) {
            Logger.getLogger(Confession.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        this.setVisible(false);
        Splash spl = new Splash();
        spl.setVisible(true);
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            String relationship = txtRelationship.getText();
            String message = txtMessage.getText();
            String recipientln = txtRecipientLN.getText();
            String recipientfn = txtRecipientFN.getText();
            String gift = txtGift.getText();
            String ConID = txtConID.getSelectedItem().toString();
            
            relationship.replace("'", "\'");
            message.replace("'", "\'");
            recipientln.replace("'", "\'");
            recipientfn.replace("'", "\'");
            ConID.replace("'", "\'");
            
            pst = con.prepareStatement("UPDATE Confession SET Relationship=?,Message=?,RecipientLN=?,RecipientFN=?,GiftFK=? WHERE ConfessID=?");
           
            pst.setString(1, relationship);
            pst.setString(2, message);
            pst.setString(3, recipientln);
            pst.setString(4, recipientfn);
            pst.setString(5, gift);
            pst.setString(6, ConID);
            
            int k = pst.executeUpdate();
            
            if (k == 1){
                JOptionPane.showMessageDialog(this, "Confession updated successfully!");                
                txtRelationship.setText("");
                txtMessage.setText("");
                txtRecipientLN.setText("");
                txtRecipientFN.setText("");
                txtGift.setText("");
                txtRelationship.requestFocus();
                btnMycon.doClick();
            } else {
                JOptionPane.showMessageDialog(this, "Confession failed to be saved!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String ConID = txtConID.getSelectedItem().toString();
        
        try {
            pst = con.prepareStatement("SELECT * FROM Confession WHERE ConfessID=?");
            pst.setString(1,ConID);
            rs = pst.executeQuery();
            
            if (rs.next() == true){
                txtRelationship.setText(rs.getString(3));
                txtMessage.setText(rs.getString(4));
                txtRecipientLN.setText(rs.getString(5));
                txtRecipientFN.setText(rs.getString(6));
                txtGift.setText(rs.getString(7));
            } else {
                JOptionPane.showMessageDialog(this, "No confession found.");
            }
        } catch (SQLException e){
            
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnMyconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyconActionPerformed
        try {
            String email = jTextFieldEmail.getText();
            String password = jTextFieldPassword.getText();
                    
            pst = con.prepareStatement("SELECT * FROM Users WHERE Email=? AND Password=?");
            
            pst.setString(1, email);
            pst.setString(2, password);
            
            rs = pst.executeQuery();
                
            if (rs.next() == true){
             
                String SenderID = rs.getString("UserID");
                pst2 = con.prepareStatement("SELECT ConfessID FROM Confession WHERE SenderID=?");
                pst2.setString(1, SenderID);

                rs2 = pst2.executeQuery();
                txtConID.removeAllItems();
                while (rs2.next()){
                    txtConID.addItem(rs2.getString(1));
                } 
                
                // fetching
                
                int q;
                
                pst2 = con.prepareStatement("SELECT * FROM Confession WHERE SenderID=?");
                pst2.setString(1, SenderID);

                rs2 = pst2.executeQuery();
                
                ResultSetMetaData rss = rs2.getMetaData();
                q = rss.getColumnCount();
                
                DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
                df.setRowCount(0);
                while (rs2.next()){
                    Vector v2 = new Vector();
                    String giftID = rs2.getString("GiftFK");
                    
                    pst = con.prepareStatement("SELECT * FROM Gift WHERE GiftID=?");
            
                    pst.setString(1, giftID);
                    rs = pst.executeQuery();

                    if (rs.next() == true){
                            for (int a=1; a <= q; a++){
                            v2.add(rs2.getString("ConfessID"));
                            v2.add(rs2.getString("Relationship"));
                            v2.add(rs2.getString("Message"));
                            v2.add(rs2.getString("RecipientLN"));
                            v2.add(rs2.getString("RecipientFN"));
                            v2.add(rs.getString("GiftName"));
                        }
                        df.addRow(v2);
                    }
                            
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Confession.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            String email = jTextFieldEmail.getText();
            String password = jTextFieldPassword.getText();
                    
            pst = con.prepareStatement("SELECT * FROM Users WHERE Email=? AND Password=?");
            
            pst.setString(1, email);
            pst.setString(2, password);
            
            rs = pst.executeQuery();
                
            if (rs.next() == true){
             
                String ln = rs.getString("LastName");
                String fn = rs.getString("FirstName");
                pst2 = con.prepareStatement("SELECT ConfessID FROM Confession WHERE RecipientLN=? AND RecipientFN=?");
                pst2.setString(1, ln);
                pst2.setString(2, fn);

                rs2 = pst2.executeQuery();
                RecCon.removeAllItems();
                while (rs2.next()){
                    RecCon.addItem(rs2.getString(1));
                } 
                
                // fetching
                
                int q;
                
                pst2 = con.prepareStatement("SELECT * FROM Confession WHERE RecipientLN=? AND RecipientFN=?");
                pst2.setString(1, ln);
                pst2.setString(2, fn);

                rs2 = pst2.executeQuery();
                
                String ConfessorID;
                
                ResultSetMetaData rss = rs2.getMetaData();
                q = rss.getColumnCount();
                
                DefaultTableModel df = (DefaultTableModel)jTable3.getModel();
                df.setRowCount(0);
                while (rs2.next()){
                    Vector v2 = new Vector();
                    String giftID = rs2.getString("GiftFK");
                    
                    pst3 = con.prepareStatement("SELECT * FROM Gift WHERE GiftID=?");
            
                    pst3.setString(1, giftID);
                    rs3 = pst3.executeQuery();

                    if (rs3.next() == true){
                    
                        for (int a=1; a <= q; a++){
                            v2.add(rs2.getString("ConfessID"));
                            v2.add(rs2.getString("Relationship"));
                            v2.add(rs2.getString("Message"));
                            ConfessorID = rs2.getString("SenderID");

                            pst = con.prepareStatement("SELECT * FROM Users WHERE UserID=?");
                            pst.setString(1, ConfessorID);
                            rs = pst.executeQuery();

                            if (rs.next() == true){
                                v2.add(rs.getString("LastName"));
                                v2.add(rs.getString("FirstName"));
                            }
                            v2.add(rs3.getString("GiftName"));
                        }
                        df.addRow(v2);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Confession.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMyconActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String ConID = txtConID.getSelectedItem().toString();
          
            pst2 = con.prepareStatement("SELECT * FROM Confession WHERE ConfessID=?");
            pst2.setString(1,ConID);
            rs2 = pst2.executeQuery();
            
            if (rs2.next() == true){
                pst3 = con.prepareStatement("INSERT INTO Notification (GiftID, BuyerID, Operation)VALUES(?,?,'DELETE')");
                String SenderID = rs2.getString(2);
                String gift = rs2.getString(7);
                pst3.setString(1, gift);
                pst3.setString(2, SenderID);

                int k2 = pst3.executeUpdate();
            }
            
            pst = con.prepareStatement("DELETE FROM Confession WHERE ConfessID=?");
            pst.setString(1, ConID);
            
            int k = pst.executeUpdate();
            
            if (k == 1){
                JOptionPane.showMessageDialog(this, "Confession deleted successfully!");               
                txtRelationship.setText("");
                txtMessage.setText("");
                txtRecipientLN.setText("");
                txtRecipientFN.setText("");
                txtGift.setText("");
                txtRelationship.requestFocus();
                btnMycon.doClick();
            } else {
                JOptionPane.showMessageDialog(this, "Confession failed to be deleted!");
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        String ConID = RecCon.getSelectedItem().toString();
        
        try {
            pst = con.prepareStatement("SELECT * FROM Confession WHERE ConfessID=?");
            pst.setString(1,ConID);
            rs = pst.executeQuery();
            
            if (rs.next() == true){
                txtRelationship1.setText(rs.getString(3));
                txtMessage1.setText(rs.getString(4));
                txtGift1.setText(rs.getString(7));
                String ConfessorID = rs.getString(2);
                
                pst2 = con.prepareStatement("SELECT * FROM Users WHERE UserID=?");
                pst2.setString(1, ConfessorID);
                rs2 = pst2.executeQuery();

                if (rs2.next() == true){
                    txtSenderLN.setText(rs2.getString(3));
                    txtSenderFN.setText(rs2.getString(2));
                }
                
                txtRelationship1.setEditable(false);
                txtMessage1.setEditable(false);
                txtGift1.setEditable(false);
                txtSenderLN.setEditable(false);
                txtSenderFN.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(this, "No confession found.");
            }
        } catch (SQLException e){
            
        }
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void btnGShopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGShopMouseClicked

        AvailableGifts ag = new AvailableGifts();
        ag.setVisible(true);
    }//GEN-LAST:event_btnGShopMouseClicked

    private void btnGShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGShopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGShopActionPerformed

    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
        String email = jTextFieldEmail.getText();
        String password = jTextFieldPassword.getText();
            
        try {
            pst = con.prepareStatement("SELECT * FROM Users WHERE Email=? AND Password=?");
            pst.setString(1, email);
            pst.setString(2, password);
            
            rs = pst.executeQuery();
            
            if (rs.next() == true){
                String FirstName = rs.getString("FirstName");
                String LastName = rs.getString("LastName");
                String UserType = rs.getString("UserType");
                String id = rs.getString("UserID");
                
                AccountSettings as = new AccountSettings();
                as.txtFName.setText(FirstName);
                as.txtLName.setText(LastName);
                as.txtStatus.setText(UserType);
                as.txtID.setText(id);
                as.txtID.setEditable(false);
                this.setVisible(false);
                as.setVisible(true);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Confession.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSettingsActionPerformed

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
            java.util.logging.Logger.getLogger(Confession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confession().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> RecCon;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGShop;
    private javax.swing.JButton btnMycon;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSettings;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    public javax.swing.JTextField jTextFieldEmail;
    public javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JComboBox<String> txtConID;
    private javax.swing.JTextField txtGift;
    private javax.swing.JTextField txtGift1;
    private javax.swing.JTextArea txtMessage;
    private javax.swing.JTextArea txtMessage1;
    private javax.swing.JTextField txtRecipientFN;
    private javax.swing.JTextField txtRecipientLN;
    private javax.swing.JTextField txtRelationship;
    private javax.swing.JTextField txtRelationship1;
    private javax.swing.JTextField txtSenderFN;
    private javax.swing.JTextField txtSenderLN;
    // End of variables declaration//GEN-END:variables
}
