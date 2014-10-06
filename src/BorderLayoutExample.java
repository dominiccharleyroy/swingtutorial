import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * An example of a JPanel using the BorderLayout layout manager.
 */
public class BorderLayoutExample {
	public static void main(String[] args) {
		// Create the window.
		JFrame window = new JFrame("Window Title");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(640, 480);
		
		// Create our JPanel.
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		// Add a button to each section.
		panel.add(new JButton("EAST"), BorderLayout.EAST);
		panel.add(new JButton("NORTH"), BorderLayout.NORTH);
		panel.add(new JButton("WEST"), BorderLayout.WEST);
		panel.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		panel.add(new JButton("CENTER"));
		
		// Set it as the window's content pane and show the window.
		window.add(panel);		
		window.setVisible(true);
	}
}
