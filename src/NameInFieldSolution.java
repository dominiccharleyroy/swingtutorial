import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * This example features a JTextField, a JButton and a JLabel.
 * When the JButton is pressed, the label is updated to have the
 * JTextField contents.
 */
public class NameInFieldSolution {

	
	public static void main(String[] args) {
		// Create the window.
		JFrame window = new JFrame("Window Title");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(640, 480);
		
		// Create our JPanel.
		JPanel panel = new JPanel();
		
		// Create a text field.
		JTextField textField = new JTextField(20); 
		
		// Create a label and add it to the panel.
		JLabel label = new JLabel("Button not pressed.");
		
		// Create a button as well as the action listener.
		JButton button = new JButton("Update label");
		button.addActionListener(new ButtonActionListener(textField, label));
		
		// Add our components in the right order.
		panel.add(textField);
		panel.add(button);
		panel.add(label);		
		
		// Set it as the window's content pane and show the window.
		window.add(panel);		
		window.setVisible(true);
	}
	
	/**
	 * This action listener updates a label to have the same text as a 
	 * JTextField.
	 */
	private static class ButtonActionListener implements ActionListener {

		private JLabel label;
		private JTextField textField;
		
		public ButtonActionListener(JTextField textField, JLabel label) {
			this.textField = textField;
			this.label = label;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			this.label.setText(textField.getText());
		}
	}
}
