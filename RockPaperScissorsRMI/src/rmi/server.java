/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rmi;
import home.AdminPage;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.ServerNotActiveException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Akash Mishra
 */


public class server extends UnicastRemoteObject implements serverInterface {

    public server() throws RemoteException {
    }

    /**
     * Initializes the server and binds it to the specified port.
     * 
     * @param port The port number on which the server will listen for connections.
     */
    public void startServer(String port) {
        try {
            serverInterface service = new server(); // Create a new server instance
            LocateRegistry.createRegistry(Integer.parseInt(port)); // Create the registry
            Naming.rebind("rmi://127.0.0.1:" + port + "/serverInterface", service); // Bind the service
            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.out.println("Server failed: " + e);
            JOptionPane.showMessageDialog(new JFrame(), "The server is not connected.");
        }
    }

    @Override
    public char handlePlayerAction(char action) throws RemoteException, ServerNotActiveException {
        char result = ' '; // Variable to store the result of the action
        System.out.println("A user has played: " + action);

        try {
            result = action; // Store the action performed by the player
            System.out.println("Action performed: " + action);

            AdminPage.traffic.add(result); // Record the action in the traffic
            int totalPlayers = AdminPage.traffic.size(); // Get the current number of players
            System.out.println("Current number of players: " + totalPlayers);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return result; // Return the recorded action
    }
    
    @Override
    public char checkRound() throws RemoteException, ServerNotActiveException {
        System.out.println("Checking the round status...");
        char roundOutcome = ' ';
        char winner = ' ';
        
        try {
            int totalPlayers = AdminPage.traffic.size(); // Get the current number of players
            
            if ((totalPlayers % 2) == 0) { // Check if there are enough players to evaluate
                char lastAction = (char) AdminPage.traffic.get(totalPlayers - 1); // Get the last player's action
                char secondLastAction = (char) AdminPage.traffic.get(totalPlayers - 2); // Get the second last player's action

                // Determine the winner based on the actions
                if (lastAction == 'r' && secondLastAction == 's' ||
                    lastAction == 'p' && secondLastAction == 'r' ||
                    lastAction == 's' && secondLastAction == 'p') {
                    winner = lastAction; // Last player wins
                } else if (lastAction == secondLastAction) {
                    winner = '1'; // Tie
                } else {
                    winner = secondLastAction; // Second last player wins
                }

                System.out.println("Last action: " + lastAction + ", Second last action: " + secondLastAction);
                System.out.println("Winner action: " + winner);
                
            } else {
                winner = '0'; // Not enough players to determine a winner
            }

        } catch (Exception e) {
            System.out.println("An error has occurred: " + e);
        }

        return winner; // Return the winner's action
    }
    
    public void resetGame() {
        AdminPage.traffic.clear();       
        System.out.println("Game reset completed. Current moves of players: " + AdminPage.traffic.size());
    }
}
