import javax.swing.*;

/**
 * This example shows a button that does nothing when clicked.
 */
public class BoringButton {
	public static void main(String[] args) {
		// Create the window.
		JFrame window = new JFrame("Window Title");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(640, 480);
		
		// Create our JPanel.
		JPanel panel = new JPanel();
		
		// Add a button.
		panel.add(new JButton("Press Me!"));
		
		// Set the panel as the window's content pane and show the window.
		window.add(panel);		
		window.setVisible(true);
	}
}
