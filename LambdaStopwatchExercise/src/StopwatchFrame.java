import javax.swing.JFrame;

public class StopwatchFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Stopwatch");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(new Stopwatch());
		frame.pack();
		frame.setVisible(true);

	}

}
