import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * An example of nesting JPanels using various layout managers in order to
 * create a calculator.
 */
public class Calculator {
	public static void main(String[] args) {
		// Create the window.
		JFrame window = new JFrame("Window Title");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(640, 480);

		// Create our container JPanel.
		JPanel container = new JPanel();
		container.setLayout(new BorderLayout());
		
		// Add a JTextField with the initial text "0" to the north.
		container.add(new JTextField("0"), BorderLayout.NORTH);

		// Create a JPanel which will contain our buttons.
		JPanel buttonContainer = new JPanel();
		buttonContainer.setLayout(new GridLayout(3, 3));
		
		// Create 9 buttons and add them to the button container.
		for (int i = 1; i <= 9; i++) {
			buttonContainer.add(new JButton("" + i));
		}
		
		// Add the button container to the main container.
		container.add(buttonContainer);

		// Set it as the window's content pane and show the window.
		window.add(container);
		window.setVisible(true);
	}
}
