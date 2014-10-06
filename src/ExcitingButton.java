import javax.swing.*;


/**
 * This example shows a button which updates a label's text
 * when clicked.
 */
public class ExcitingButton {

	public static void main(String[] args) {
			// Create the window.
			JFrame window = new JFrame("Window Title");
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setSize(640, 480);
			
			// Create our JPanel.
			JPanel panel = new JPanel();
			
			// Create a label and add it to the panel.
			JLabel label = new JLabel("Button not pressed.");
			panel.add(label);
			
			// Create a button as well as the action listener, and then add
			// the button the panel.
			JButton button = new JButton("Update label");
			button.addActionListener(new LabelUpdaterActionListener(label));
			panel.add(button);
			
			// Set it as the window's content pane and show the window.
			window.add(panel);		
			window.setVisible(true);
		}

	
	
}
