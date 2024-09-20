/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package home;

/**
 * @author kavish chandra - S11219143
 * @author Sudhansu Jayshil kisun - S11219520
 * @author Fardeen Ali - S11219171
 * @author Akash Mishra - S11219345
 */

public class Home {

    public static void main(String[] args) {
        // display login form
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
    }
    
}
