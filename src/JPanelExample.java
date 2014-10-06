import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * An example of JPanels having multiple components - in this case,
 * we add five labels.
 */
public class JPanelExample {
	public static void main(String[] args) {
		// Create the window.
		JFrame window = new JFrame("Window Title");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(640, 480);
		
		// Create our JPanel.
		JPanel panel = new JPanel();
		
		// Create 5 labels and add them to our panel.
		for (int i = 0; i < 5; i++) {
			panel.add(new JLabel("Label " + i));
		}
		
		// Set it as the window's content pane and show the window.
		window.add(panel);		
		window.setVisible(true);
	}
}
