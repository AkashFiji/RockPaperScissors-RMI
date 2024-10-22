/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rmi;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.ServerNotActiveException;

/**
 * @author Akash Mishra
 */

public class client {

    /**
     * Executes a client action by communicating with the server.
     *
     * @param action     The action to perform (as a char).
     * @param ipAddress  The IP address of the server.
     * @param port       The port number for the server.
     * @return          The result of the action as a char.
     * @throws NotBoundException        If the remote object is not bound.
     * @throws MalformedURLException     If the URL is malformed.
     * @throws RemoteException          If a remote communication error occurs.
     * @throws ServerNotActiveException  If the server is not active.
     */
    
    public char executeClientAction(char action, String ipAddress, String port) throws NotBoundException, MalformedURLException, RemoteException, ServerNotActiveException {
        
        char result = ' '; // Variable to store the result of the action

        System.out.println("Connecting to server at IP address: " + ipAddress + " on port: " + port);
        serverInterface server = (serverInterface) Naming.lookup("rmi://" + ipAddress + ":" + port + "/serverInterface");

        // Call the action on the server and get the result
        result = server.handlePlayerAction(action);

        return result; // Return the result
    }

    public char executeClientCheckRound(char actionChar, String ipAddress, String port) throws NotBoundException, MalformedURLException, RemoteException, ServerNotActiveException {
        System.out.println("Executing client round check...");

        System.out.println("Connecting to server at IP Address: " + ipAddress + " on port: " + port);
        serverInterface server = (serverInterface) Naming.lookup("rmi://" + ipAddress + ":" + port + "/serverInterface");
        System.out.println("Client has successfully connected to the server.");
        
        // Return the result of checking the round status
        return server.checkRound();
    }

    public void clearGame(String ipAddress, String port) throws NotBoundException, MalformedURLException, RemoteException, ServerNotActiveException {
        System.out.println("---------- ROUND ENDED ----------");
    }
}

