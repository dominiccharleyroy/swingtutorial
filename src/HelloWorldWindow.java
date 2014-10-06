import javax.swing.JFrame;

/**
 * Creating an empty window!
 */
public class HelloWorldWindow {
	public static void main(String[] args) {
		JFrame window = new JFrame("Window Title");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(640, 480);
		window.setVisible(true);
	}
}
