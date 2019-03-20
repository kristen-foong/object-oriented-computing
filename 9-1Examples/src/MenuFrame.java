import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuFrame {


	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Buttons");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(new FilePanel());
		frame.pack();
		frame.setVisible(true);
	}


}
