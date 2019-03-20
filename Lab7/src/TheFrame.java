/**
 * The Frame class creates a new JFrame and adds a StatPanel to it.
 * @auth Kristen Foong
 * @class CPSC1181
 * @lab Lab 7
 */

import javax.swing.JFrame;

public class TheFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Lab 7");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(new StatPanel());
		frame.pack();
		frame.setVisible(true);

	}

}
