
import javax.swing.JFrame;

public class TheFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Temperature Pane;");
		frame.add(new TemperaturePanel());
		frame.setVisible(true);
	}
}
