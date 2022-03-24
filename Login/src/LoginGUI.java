import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginGUI {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Login");
		
		frame.setBounds(200, 200, 370, 230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		frame.getContentPane().add(panel);
		
		JLabel loginLabel = new JLabel("Loign:");
		panel.add(loginLabel);
		loginLabel.setBounds(50, 30, 70, 20);
		
		JTextField loginField = new JTextField();
		loginField.setBounds(120, 30, 100, 20);
		panel.add(loginField);
		
		JLabel passwordLabel = new JLabel("Password: ");
		panel.add(passwordLabel);
		passwordLabel.setBounds(50, 60, 70, 20);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(120, 60, 100, 20);
		panel.add(passwordField);
		
		JButton loginButton = new JButton("Log in ");
		loginButton.setBounds(130, 100, 80, 25);
		panel.add(loginButton);
		
		JLabel succesLabel = new JLabel("Sucessfully logged in!");
		succesLabel.setBounds(100, 150, 200, 25);
		panel.add(succesLabel);
		succesLabel.setVisible(false);
		
		JLabel unsuccesLabel = new JLabel("Login unsuccesful");
		unsuccesLabel.setBounds(100, 150, 200, 25);
		panel.add(unsuccesLabel);
		unsuccesLabel.setVisible(false);
		
		
		
		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String userLogin = loginField.getText();
				String userPassword = passwordField.getText();
				
				if(!userLogin.isEmpty() && !userPassword.isEmpty()) {
					if(userLogin.equals("Mateusz123") && userPassword.equals("Matusewicz")) {
						
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
						
						loginField.setText("");
						passwordField.setText("");
						
						loginField.requestFocus();
						
						
					}	
					
				}
				
			}
					
		});
		

		
		
		frame.setVisible(true);
	}
	

}
