import javax.swing.*;

/**
 * This class shows an example of Swing alerts and confirmation dialogs.
 */
public class AlertExample {

	public static void main(String[] args) {
		// Show a regular alert with an OK button.
		JOptionPane.showMessageDialog(null, "This is an alert!");
		
		// Show a dialog with a text field to get input.
		String name = JOptionPane.showInputDialog(null, "What is your name?");
		JOptionPane.showMessageDialog(null, "Hi " + name + "!");
		
		// Show the user a Yes/No dialog. Note that we have to specify what
		// buttons we want as the last argument.
		int result = JOptionPane.showConfirmDialog(null, "Are you awesome?", 
				"Dialog Title", JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "You pressed Yes!");
		} else {
			JOptionPane.showMessageDialog(null, "You pressed No!");
		}
	}

}
