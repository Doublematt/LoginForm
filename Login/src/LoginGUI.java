import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;

public class LoginGUI {

	public static void main(String[] args) {
		
		/*
		 * HashMap of right Logins and passwords
		 * key - Login
		 * value - password
		 */
		HashMap<String, String> LOGPASS =  new  HashMap<String, String>();
		LOGPASS.put("User1","MyPass");
		LOGPASS.put("default", "12345");
		LOGPASS.put("Admin","Admin1");
		
		
		// Login frame parameters 
		JFrame frame = new JFrame("Login form");
		frame.setBounds(PopUpWindow.FRAMEWIDTH, PopUpWindow.FRAMEHEIGHT, PopUpWindow.FRAMEX, PopUpWindow.FRAMEY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		// creating panel for all elements
		JPanel panel = new JPanel();
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		
		
		// login form
		
		JLabel loginLabel = new JLabel("Loign:");
		panel.add(loginLabel);
		loginLabel.setBounds(50, 30, 70, 20);
		
		JTextField loginField = new JTextField();
		loginField.setBounds(120, 30, 100, 20);
		panel.add(loginField);
		
		
		
		// password form
		
		JLabel passwordLabel = new JLabel("Password: ");
		panel.add(passwordLabel);
		passwordLabel.setBounds(50, 60, 70, 20);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(120, 60, 100, 20);
		panel.add(passwordField);
		
		
		
		
		// button used to log in
		// should change the visibility of one of two labels succesLabel or unsuccesLabel
		JButton loginButton = new JButton("Log in ");
		loginButton.setBounds(130, 100, 80, 25);
		panel.add(loginButton);
		
		
		
		/*
		* two labels used if you fail to log in or you success	
		*  they should't be visible at the beginning
		*  they start to be visible after after clicking the loginButton
		*/
		JLabel succesLabel = new JLabel("Sucessfully logged in!");
		succesLabel.setBounds(100, 140, 200, 25);
		panel.add(succesLabel);
		succesLabel.setVisible(false);
		
		JLabel unsuccesLabel = new JLabel("Login unsuccesful");
		unsuccesLabel.setBounds(100, 140, 200, 25);
		panel.add(unsuccesLabel);
		unsuccesLabel.setVisible(false);
		
		
		
		/*
		 * button created to show right logins and passwords
		 * after clicking create new Object PopUpWindow (JFrame) 
		 * window should contain all the right logins and passwords 
		 */
		JButton rightValuesButton = new JButton ("Psss click me");
		rightValuesButton.setBounds(10, 170, 130, 20);
		panel.add(rightValuesButton);
		rightValuesButton.setVisible(true);
		
		
		
		/*
		 * action listener used to login
		 * checks login and password and change visibility of right label
		 */
		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// getting text out of textFields and assigning it to Strings to check if they are right
				String userLogin = loginField.getText();
				// getText still works but it probably should be used here
				String userPassword = passwordField.getText();
				
				/*
				 * first if checks if Strings are empty and if they are there is no point in going further
				 * then it checks if they are correct using HashMap method contains and get method
				 * it sets the right label visibility to true
				 * Strings are being cleared at the and to make sure not to use them afterwards
				 */
				
				if(!userLogin.isEmpty() && !userPassword.isEmpty()) {
					if(LOGPASS.containsKey(userLogin) && (LOGPASS.get(userLogin)).equals(userPassword)) {
						
						// additional console print to check if everything is working 
						System.out.println("You have sucessfully logged in");
						succesLabel.setVisible(true);
						
						if(unsuccesLabel.isVisible())
							unsuccesLabel.setVisible(false);
					}
					
					else {
						System.out.println("Login unsuccesful");
						
						unsuccesLabel.setVisible(true);
						
						if(succesLabel.isVisible())
							succesLabel.setVisible(false);
						
						// clearing strings after checking conditions
						loginField.setText("");
						passwordField.setText("");
						
						// changing focus to let user input other login and password
						loginField.requestFocus();
						
						
					}	
					
				}
				
			}
					
		});
		
		/*
		 * used to find right values of login and password to sign in
		 * creates a new object of PopUpWindow class
		 * 
		 */
		rightValuesButton.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent e) {
			
				PopUpWindow popUp = new PopUpWindow("Logins and passwords");
			}
				
		});
		
		
		frame.setVisible(true);
	}
	

}
