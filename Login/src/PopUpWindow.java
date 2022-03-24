import javax.swing.*;


/*
 * pops up after clicking a rightValuessButton
 * contains static values of frames used in this project
 * show to the user right values of login and password
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
		
		JFrame pop = new JFrame(WindowName);
		pop.setBounds(FRAMEWIDTH, FRAMEHEIGHT, FRAMEX, FRAMEY);
		pop.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		// initialization all the necessary components
		initComponents();
		
		pop.setVisible(true);
	}

	// body of initComponents
	private void initComponents() {
		
		
		
		
		
		
	}
	

}


