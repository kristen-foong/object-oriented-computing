
import javax.swing.JFrame;

public class TheFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Plus Minus Panel");
		frame.add(new PlusMinusPanel());
		frame.setVisible(true);
	}
}
