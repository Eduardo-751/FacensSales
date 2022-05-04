/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import javax.swing.JFrame;

import View.Login;

public class Main {
	public static JFrame frame;
    /**
     * @param args the command line arguments
     * @throws InterruptedException 
     */
    public static void main(String[] args) {
    	JFrame loginScreen = new Login();
        frame = loginScreen;
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
    }    
}
