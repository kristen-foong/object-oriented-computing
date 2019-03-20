
import java.awt.*;
import javax.swing.JFrame;


public class DrawRat {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Draw Rat");
		frame.add(new RatComponent());
		frame.setVisible(true);
	}

}
