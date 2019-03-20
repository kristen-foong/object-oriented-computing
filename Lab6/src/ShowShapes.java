/**
 * The ShowShapes class creates a JFrame and adds a shape component to the frame.
 * @author Kristen Foong
 * @class CPSC1181
 * @lab Lab6
 */

import java.awt.*;
import javax.swing.JFrame;

public class ShowShapes {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Draw Shapes");
		frame.add(new ShapeComponent());
		frame.setVisible(true);
	}

}
