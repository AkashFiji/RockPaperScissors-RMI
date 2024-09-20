/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rmi;
import java.rmi.*;
import java.rmi.server.ServerNotActiveException;

/**
 * @author kavish chandra - S11219143
 * @author Sudhansu Jayshil kisun - S11219520
 * @author Fardeen Ali - S11219171
 * @author Akash Mishra - S11219345
 */

public interface serverInterface extends Remote {
public char handlePlayerAction (char a) throws RemoteException,ServerNotActiveException;
public char checkRound () throws RemoteException,ServerNotActiveException;
public void resetGame() throws RemoteException,ServerNotActiveException;

}
