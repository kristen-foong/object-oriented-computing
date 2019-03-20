import javax.swing.JFrame;

public class PacmanFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Pacman");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(new Pacman());
		frame.pack();
		frame.setVisible(true);

	}

}
