import javax.swing.*;

/**
 * This example shows a window with Hello, world! shown on a label.
 */
public class BasicWindow {
	public static void main(String[] args) {
		// Create the window.
		JFrame window = new JFrame("Window Title");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(640, 480);
		
		// Create our label.
		JLabel label = new JLabel("Hello, ");
		label.setText(label.getText() + "world!");
		
		// Set it as the window's content pane and show the window.
		window.add(label);		
		window.setVisible(true);
	}
}
