import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * An example of  a JPanel using the GridLayout layot manager.
 */
public class GridLayoutExample {
	public static void main(String[] args) {
		// Create the window.
		JFrame window = new JFrame("Window Title");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(640, 480);
		
		// Create our JPanel.
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));
		
		// Create 6 labels and add them to our panel.
		for (int i = 0; i < 6; i++) {
			panel.add(new JButton("Button" + i));
		}
		
		// Set it as the window's content pane and show the window.
		window.add(panel);		
		window.setVisible(true);
	}
}
