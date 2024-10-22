/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package home;
import static home.PlayerPage.BackgroundMusic;
import static home.PlayerPage.btnClickSound;
import java.rmi.RemoteException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.server;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Akash Mishra
 */

public class AdminPage extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public AdminPage() {
        initComponents();
        BackgroundMusic();
 
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        btnStartServer = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        btnBanPlayers = new javax.swing.JButton();
        viewPlayers = new javax.swing.JButton();
        panel3 = new java.awt.Panel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome");

        user.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        user.setForeground(new java.awt.Color(204, 204, 255));
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setText("Admin");

        btnStartServer.setBackground(new java.awt.Color(204, 204, 255));
        btnStartServer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnStartServer.setForeground(new java.awt.Color(0, 102, 102));
        btnStartServer.setText("START SERVER");
        btnStartServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartServerActionPerformed(evt);
            }
        });

        LogoutBtn.setBackground(new java.awt.Color(204, 204, 255));
        LogoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(0, 102, 102));
        LogoutBtn.setText("LOGOUT");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        btnQuit.setBackground(new java.awt.Color(204, 204, 255));
        btnQuit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(0, 102, 102));
        btnQuit.setText("QUIT");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        btnBanPlayers.setBackground(new java.awt.Color(204, 204, 255));
        btnBanPlayers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBanPlayers.setForeground(new java.awt.Color(0, 102, 102));
        btnBanPlayers.setText("BAN PLAYERS");
        btnBanPlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanPlayersActionPerformed(evt);
            }
        });

        viewPlayers.setBackground(new java.awt.Color(204, 204, 255));
        viewPlayers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewPlayers.setForeground(new java.awt.Color(0, 102, 102));
        viewPlayers.setText("VIEW PLAYERS");
        viewPlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPlayersActionPerformed(evt);
            }
        });

        panel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Rock, Paper, Scissors Game");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/clouds.gif"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/clouds.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBanPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                        .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStartServer, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(181, 181, 181))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(330, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user)
                        .addGap(26, 26, 26)
                        .addComponent(btnStartServer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBanPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(10, 10, 10)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        // TODO add your handling code here:
        btnClickSound();
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_LogoutBtnActionPerformed
   
    public static String prt = "2011";
    public static Vector traffic = new Vector();
    public static boolean isFinished = false;
    
    private void btnStartServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartServerActionPerformed

    btnClickSound();
    int port = Integer.parseInt(prt); // Parse the port number from a string
    
    if (port > 1024) {
        server a = null;
        try {
          a = new server();  // Create a new server instance
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "The server is not connected");
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Start the server with the specified port
        a.startServer(prt);
        JOptionPane.showMessageDialog(new JFrame(), "The server is connected");
    } else {
        JOptionPane.showMessageDialog(new JFrame(), "The port number must be greater than 1024");
    }
    }//GEN-LAST:event_btnStartServerActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
    btnClickSound();
    System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnBanPlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanPlayersActionPerformed
    // TODO add your handling code here:                                      
    btnClickSound();
    String dbUrl = "jdbc:mysql://localhost:3306/rps_game";
    String dbUser = "root";
    String dbPass = "";

    List<String> emailAddresses = new ArrayList<>();
    List<String> fullNames = new ArrayList<>();

    try {
        // Establish a database connection
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        Statement statement = connection.createStatement();

        String query = "SELECT email, full_name FROM player";
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            String email = resultSet.getString("email");
            String name = resultSet.getString("full_name");
            emailAddresses.add(email);
            fullNames.add(name);
        }

        resultSet.close();
        statement.close();
        connection.close();
    } catch (Exception e) {
        System.err.println("Error: " + e.getMessage());
    }

    // Convert the lists to arrays
    String[] emailArray = emailAddresses.toArray(new String[0]);
    String[] nameArray = fullNames.toArray(new String[0]);

    // Create a JTable to display both email addresses and full names
    String[][] data = new String[emailArray.length][2]; // Two columns for email and full name
    for (int i = 0; i < emailArray.length; i++) {
        data[i][0] = emailArray[i];   
        data[i][1] = nameArray[i];    
    }

    String[] columnNames = {"Email Addresses", "Full Name"}; 
    JTable table = new JTable(data, columnNames);
    table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    // Wrap the JTable in a JScrollPane
    JScrollPane scrollPane = new JScrollPane(table);
    scrollPane.setPreferredSize(new Dimension(300, 200)); // Set size

    // Create a new JFrame to show the table
    JFrame frame = new JFrame("Ban Players");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

    // Add a button to confirm the selection
    JButton banButton = new JButton("Ban Selected Player");
    banButton.addActionListener(e -> {
    int selectedRow = table.getSelectedRow();
    if (selectedRow != -1) {
        String selectedEmail = (String) table.getValueAt(selectedRow, 0);
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        Statement statement = connection.createStatement();

        String deleteQuery = "DELETE FROM player WHERE email = '" + selectedEmail + "'";
        int rowsAffected = statement.executeUpdate(deleteQuery);

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(
                    null,
                    selectedEmail + " has been banned",
                    "Ban Successful",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "No records found for " + selectedEmail + ".",
                    "Record Not Found",
                    JOptionPane.WARNING_MESSAGE);
        }

        statement.close();
        connection.close();
    } catch (Exception ei) {
        System.err.println("Error: " + ei.getMessage());
    }

    // Close the frame after banning
    frame.dispose();
    } else {
        JOptionPane.showMessageDialog(frame, "Please select an email address to ban.");
    }
    });

    frame.getContentPane().add(banButton, BorderLayout.SOUTH);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);

    }//GEN-LAST:event_btnBanPlayersActionPerformed

    private void viewPlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPlayersActionPerformed
    
    btnClickSound();                                       
    String dbUrl = "jdbc:mysql://localhost:3306/rps_game";
    String dbUser = "root";
    String dbPass = "";
    List<String> emailAddresses = new ArrayList<>();
    List<String> fullNames = new ArrayList<>();

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        Statement statement = connection.createStatement();

        String query = "SELECT email, full_name FROM player";
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            String email = resultSet.getString("email");
            String name = resultSet.getString("full_name");
            emailAddresses.add(email);
            fullNames.add(name);
        }

        resultSet.close();
        statement.close();
        connection.close();
    } catch (Exception e) {
        System.err.println("Error: " + e.getMessage());
    }

    // Convert the lists to arrays
    String[] emailArray = emailAddresses.toArray(new String[0]);
    String[] nameArray = fullNames.toArray(new String[0]);

    // Create a JTable to display both email addresses and full names
    String[][] data = new String[emailArray.length][2];
    for (int i = 0; i < emailArray.length; i++) {
        data[i][0] = emailArray[i];   
        data[i][1] = nameArray[i];    
    }

    String[] columnNames = {"Email Addresses", "Full Name"};
    JTable table = new JTable(data, columnNames);
    table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    // Wrap the JTable in a JScrollPane
    JScrollPane scrollPane = new JScrollPane(table);
    scrollPane.setPreferredSize(new Dimension(300, 200)); 

    // Create a new JFrame to show the table
    JFrame frame = new JFrame("view Players");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    }//GEN-LAST:event_viewPlayersActionPerformed

    public void setUser(String name){
        user.setText(name);
    }

    
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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton btnBanPlayers;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnStartServer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private java.awt.Panel panel3;
    private javax.swing.JLabel user;
    private javax.swing.JButton viewPlayers;
    // End of variables declaration//GEN-END:variables

}
