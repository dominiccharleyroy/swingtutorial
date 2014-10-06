import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;


/**
 * This action listener will change the text of a specified label when
 * actionPerformed is called.
 */
public class LabelUpdaterActionListener implements ActionListener {

	private JLabel labelToUpdate;
	
	public LabelUpdaterActionListener(JLabel labelToUpdate) {
		this.labelToUpdate = labelToUpdate;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.labelToUpdate.setText("Button presed!");
	}

}
