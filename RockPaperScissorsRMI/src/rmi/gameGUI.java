/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package rmi;
import java.io.InputStream;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * @author kavish chandra - S11219143
 * @author Sudhansu Jayshil kisun - S11219520
 * @author Fardeen Ali - S11219171
 * @author Akash Mishra - S11219345
 */

public class gameGUI extends javax.swing.JFrame {
    
    public static int owner, opponent, ownerScore=0, opponentScore=0;
    public static char myAction;
    public static boolean finished = false;
    
    /**
     * Creates new form connection
     */
    
    public gameGUI() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);

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
        jPanel4 = new javax.swing.JPanel();
        panel1 = new java.awt.Panel();
        scoreLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblEnemy = new javax.swing.JLabel();
        lblYou = new javax.swing.JLabel();
        lblOpp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCount = new javax.swing.JLabel();
        Scissorsbtn = new javax.swing.JButton();
        Paperbtn = new javax.swing.JButton();
        Resultbtn = new javax.swing.JButton();
        Rockbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        scoreLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setForeground(new java.awt.Color(0, 102, 102));

        panel1.setBackground(new java.awt.Color(204, 204, 255));

        scoreLabel.setFont(new java.awt.Font("Showcard Gothic", 0, 26)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(0, 102, 102));
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel.setText("May The Best Win");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("You");

        lblEnemy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEnemy.setForeground(new java.awt.Color(0, 0, 0));
        lblEnemy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnemy.setText("Opponent");

        lblYou.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmi/question-mark.png"))); // NOI18N
        lblYou.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblOpp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOpp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmi/question-mark.png"))); // NOI18N
        lblOpp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");

        lblCount.setBackground(new java.awt.Color(204, 204, 255));
        lblCount.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        lblCount.setForeground(new java.awt.Color(0, 102, 102));
        lblCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCount.setText("GOODLUCK :)");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblYou, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnemy, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOpp, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
            .addComponent(scoreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEnemy))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOpp, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblYou, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Scissorsbtn.setForeground(new java.awt.Color(255, 255, 255));
        Scissorsbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmi/scissors.png"))); // NOI18N
        Scissorsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScissorsbtnActionPerformed(evt);
            }
        });

        Paperbtn.setForeground(new java.awt.Color(255, 255, 255));
        Paperbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmi/paper.png"))); // NOI18N
        Paperbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaperbtnActionPerformed(evt);
            }
        });

        Resultbtn.setBackground(new java.awt.Color(204, 204, 255));
        Resultbtn.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Resultbtn.setForeground(new java.awt.Color(0, 102, 102));
        Resultbtn.setText("MOVE");
        Resultbtn.setEnabled(false);
        Resultbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultbtnActionPerformed(evt);
            }
        });

        Rockbtn.setForeground(new java.awt.Color(255, 255, 255));
        Rockbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmi/rock.png"))); // NOI18N
        Rockbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RockbtnMouseEntered(evt);
            }
        });
        Rockbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RockbtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Rock");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Paper");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Scissors");

        scoreLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        scoreLabel1.setForeground(new java.awt.Color(204, 204, 255));
        scoreLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel1.setText("Choose Your Move");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Rockbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Paperbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Scissorsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 48, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Resultbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(scoreLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scoreLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Paperbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Scissorsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rockbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(Resultbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String address = "127.0.0.1";
    public static String prt = "2011";
    public static int taille;
    
    private void RockbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RockbtnActionPerformed
    
    int port = Integer.parseInt(prt);
    char Action = 'r';
    myAction=Action;

        if ((port > 1024)) {
            System.out.println("Rock - " + Action + " clicked ");
            client player = new client();

            try {
                //
                char result = player.executeClientAction(Action, address, prt);
                System.out.println("Rock button was clicked");
                System.out.println("the result" + result);
        
                owner = Action;
                Rockbtn.setEnabled(false);
                Scissorsbtn.setEnabled(false);
                Paperbtn.setEnabled(false);
                Resultbtn.setEnabled(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(new JFrame(), "The server is not connected");
                System.out.println(e);
                Logger.getLogger(gameGUI.class.getName()).log(Level.SEVERE, null, e);
            }
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "The port number must be greater than 1024.");
            gameGUI a = new gameGUI();
            a.setVisible(true);
        }
        
        if(Action == 'r'){
            lblYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("rock.png")));
        } 
        else if(Action == 'p'){
            lblYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("paper.png")));
        }
        else if(Action == 's'){
            lblYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("scissors.png")));
        } else{
            System.out.println("error");
        }
}//GEN-LAST:event_RockbtnActionPerformed

    private void ScissorsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScissorsbtnActionPerformed

    int port = Integer.parseInt(prt);
    char Action = 's';
    myAction=Action;

    if ((port > 1024)) {
        System.out.println("Scissors - " + Action + " clicked ");
        client player = new client();

        try {
            char result = player.executeClientAction(Action, address, prt);
            System.out.println("action is " + result);

            owner = Action;
            Rockbtn.setEnabled(false);
            Scissorsbtn.setEnabled(false);
            Paperbtn.setEnabled(false);
            Resultbtn.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), "The server is not connected");
            System.out.println(e);
            Logger.getLogger(gameGUI.class.getName()).log(Level.SEVERE, null, e);
        }
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "The port number must be greater than 1024");
            gameGUI a = new gameGUI();
            a.setVisible(true);
        }
        
    if(Action == 'r'){
        lblYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("rock.png")));
    } else if(Action == 'p'){
        lblYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("paper.png")));
    } else if(Action == 's'){
        lblYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("scissors.png")));
    } else{
        System.out.println("error");
    }
    }//GEN-LAST:event_ScissorsbtnActionPerformed

    private void PaperbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaperbtnActionPerformed

    int port = Integer.parseInt(prt);
    char Action = 'p';
    myAction=Action;

    if ((port > 1024)) {
        System.out.println("Paper - " + Action + " clicked ");
        client player = new client();

        try {
            char result = player.executeClientAction(Action, address, prt);
            System.out.println("Paper button was clicked");
            System.out.println("The result" + result);

            owner = Action;
            Rockbtn.setEnabled(false);
            Scissorsbtn.setEnabled(false);
            Paperbtn.setEnabled(false);
            Resultbtn.setEnabled(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), "There is an error or the server is not connected");
            System.out.println("w  " + e);
            Logger.getLogger(gameGUI.class.getName()).log(Level.SEVERE, null, e);
        }
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "The port number must be greater than 1024");
            gameGUI a = new gameGUI();
            a.setVisible(true); 
        }
        
    if(Action == 'r'){
        lblYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("rock.png")));
    } else if(Action == 'p'){
        lblYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("paper.png")));
    } else if(Action == 's'){
        lblYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("scissors.png")));
    } else {
        System.out.println("error");
    }  
    }//GEN-LAST:event_PaperbtnActionPerformed

    public static void btnClickSound() {
    try {
        // Load the MP3 file from the resource folder
        InputStream inputStream = gameGUI.class.getClassLoader().getResourceAsStream("btnMove.wav");

        // Create an AudioInputStream from the input stream
        AudioInputStream audioInput = AudioSystem.getAudioInputStream(inputStream);

        // Create a Clip and open the audio stream
        Clip clip = AudioSystem.getClip();
        clip.open(audioInput);

        // Start playing the audio
        clip.start();
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}
    
    private void ResultbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultbtnActionPerformed
    btnClickSound();
    char winner = '0';        

    int port = Integer.parseInt(prt);
    client ab = new client();

    System.out.println("Results button was clicked");
    
        try {
            winner = ab.executeClientCheckRound(' ', address, prt);
            System.out.println("winner is " + winner);
            
            if(winner != '0'){              
                if(owner == winner){
                    ownerScore ++;
                    scoreLabel.setText("You: "+ownerScore+" VS "+"Opponent: "+opponentScore);
                    Resultbtn.setEnabled(false);
                    scoreLabel.setForeground(new Color(0, 100, 0)); // Dark green

                    ab.clearGame(address, prt);

                     if(winner == 'r'){
                        lblCount.setText("You won!");
                        lblCount.setForeground(new Color(0, 100, 0));
                        lblYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("rock.png")));
                        lblOpp.setIcon(new javax.swing.ImageIcon(getClass().getResource("scissors.png")));
                    } else if(winner == 'p'){
                        lblCount.setText("You won!");
                        lblCount.setForeground(new Color(0, 100, 0));
                        lblYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("paper.png")));
                        lblOpp.setIcon(new javax.swing.ImageIcon(getClass().getResource("rock.png")));
                    } else if(winner == 's'){
                        lblCount.setText("You won!");
                        lblCount.setForeground(new Color(0, 100, 0));
                        lblYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("scissors.png")));
                        lblOpp.setIcon(new javax.swing.ImageIcon(getClass().getResource("paper.png")));
                    } else{
                         System.out.println("error");
                    }
                    
                } else if (winner == '1'){
                    scoreLabel.setForeground(Color.blue);
                    scoreLabel.setText("You both did same move");
                    lblCount.setText("Draw!");
                    lblCount.setForeground(Color.blue);
                    Resultbtn.setEnabled(false);
                    ab.clearGame(address, prt);

                    if(winner == 'r'){
                        lblOpp.setIcon(new javax.swing.ImageIcon(getClass().getResource("rock.png")));
                    } else if(winner == 'p'){
                        lblOpp.setIcon(new javax.swing.ImageIcon(getClass().getResource("paper.png")));
                    } else if(winner == 's'){
                        lblOpp.setIcon(new javax.swing.ImageIcon(getClass().getResource("scissors.png")));
                    } else{
                        System.out.println("error");
                    }  
                } else {
                    lblCount.setText("You lose!");
                    lblCount.setForeground(Color.red);
                    opponentScore ++;
                    scoreLabel.setText("You: "+ownerScore+" VS "+"Opponent: "+opponentScore);
                    Resultbtn.setEnabled(false);                    
                    scoreLabel.setForeground(Color.red);
                    ab.clearGame(address, prt);

                    if(winner == 'r'){
                        lblOpp.setIcon(new javax.swing.ImageIcon(getClass().getResource("rock.png")));
                        lblYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("scissors.png")));
                    }  else if(winner == 'p'){
                        lblOpp.setIcon(new javax.swing.ImageIcon(getClass().getResource("paper.png")));
                        lblYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("rock.png")));
                    } else if(winner == 's'){
                        lblOpp.setIcon(new javax.swing.ImageIcon(getClass().getResource("scissors.png")));
                        lblYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("paper.png")));
                    } else{
                        System.out.println("error");
                    }                              
                }

                Rockbtn.setEnabled(true);
                Scissorsbtn.setEnabled(true);
                Paperbtn.setEnabled(true);

            } else {
                lblCount.setText("wait for the other player");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), "There is an error or the server is not connected");
            System.out.println("w  " + e);
            Logger.getLogger(gameGUI.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_ResultbtnActionPerformed
    
    private void RockbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RockbtnMouseEntered
        this.setBackground(Color.BLUE);
    }//GEN-LAST:event_RockbtnMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new gameGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Paperbtn;
    private javax.swing.JButton Resultbtn;
    private javax.swing.JButton Rockbtn;
    private javax.swing.JButton Scissorsbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblEnemy;
    private javax.swing.JLabel lblOpp;
    private javax.swing.JLabel lblYou;
    private java.awt.Panel panel1;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel scoreLabel1;
    // End of variables declaration//GEN-END:variables
}