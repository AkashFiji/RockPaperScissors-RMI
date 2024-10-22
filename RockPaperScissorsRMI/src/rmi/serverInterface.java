/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rmi;
import java.rmi.*;
import java.rmi.server.ServerNotActiveException;

/**
 * @author Akash Mishra
 */

public interface serverInterface extends Remote {
public char handlePlayerAction (char a) throws RemoteException,ServerNotActiveException;
public char checkRound () throws RemoteException,ServerNotActiveException;
public void resetGame() throws RemoteException,ServerNotActiveException;

}
