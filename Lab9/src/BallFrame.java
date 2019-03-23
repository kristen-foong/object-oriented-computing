/**
 * The BallFrame class holds the main method in which a frame is created,
 * and a ballcomponent is added.
 * @auth Kristen Foong
 * @class CPSC1181
 * @lab lab9
 */

import javax.swing.JFrame;

public class BallFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Lab 9 Bouncing Balls");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(new BallComponent());
		frame.pack();
		frame.setVisible(true);

	}

}
