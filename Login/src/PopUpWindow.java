import javax.swing.*;


/*
 * pops up after clicking a rightValuessButton
 * contains static values of frames used in this project
 * contains parameters of each button used in frame
 * show the user right values of login and password
 * 
 */


public class PopUpWindow {
	
	
	// values for frames in my GUI
	public final static int FRAMEWIDTH = 360;
	public final static int FRAMEHEIGHT = 230;
	public final static int FRAMEX= 370;
	public final static int FRAMEY = 230;
	
	/*
	 * String of values from hashMap from LoginGUI.java
	 * used to display them in frame to show the user right values of login and password
	 */
	private String [] userNames = {"User1", "default", "Admin" };
	private String [] userPasswords = {"MyPass", "12345", "Admin1"};
	
	
	public PopUpWindow (String WindowName) {
		
		/*
		 * Creating new JFrame form
		 * setting default operations and parameters
		 */
		this.pop = new JFrame(WindowName);
		pop.setBounds(FRAMEWIDTH, FRAMEHEIGHT, FRAMEX, FRAMEY);
		pop.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	;
		
		// initialization all the necessary components
		initComponents();
		
		
		pop.setVisible(true);
	}

	// body of initComponents
	private void initComponents() {
		
		//creating new panel for frame and init it
		this.popPanel = new JPanel();
		popPanel.setLayout(null);
		pop.getContentPane().add(popPanel);
		
		// loop to create and display all the buttons with logins and passwords
		for(int i = 0; i < userNames.length; i++ ) {
			
			
			// login buttons initialization
			this.users[i] = new JButton(userNames[i]);
			popPanel.add(users[i]);
			users[i].setBounds(USERLABELX, LABELY + 30 * i, LABELWIDTH, LABELHEIGHT);
			
			
			// password buttons initialization
			this.passwords[i] = new JButton(userPasswords[i]);
			popPanel.add(passwords[i]);
			passwords[i].setBounds(PASSLABELX, LABELY + 30 * i, LABELWIDTH, LABELHEIGHT);
			
		}
		
		
		
		
	}
	
	// main frame and main panel declaration
	JFrame pop;
	JPanel popPanel;
	
	// creating arrays which will contain logins and passwords
	JButton [] users = new JButton[userNames.length];
	JButton [] passwords = new JButton[userPasswords.length];

	// values for buttons in frame
	private final int LABELWIDTH = 150; 
	private final int LABELHEIGHT = 20;
	private final int LABELY = 20;
	private final int USERLABELX = 15;
	private final int PASSLABELX = 185;
	
}


