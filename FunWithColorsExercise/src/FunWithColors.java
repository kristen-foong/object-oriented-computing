
import java.awt.*;
import javax.swing.JFrame;

public class FunWithColors {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Fun With Colors");
		frame.add(new FirstComponent());
		frame.setVisible(true);
	}

}
