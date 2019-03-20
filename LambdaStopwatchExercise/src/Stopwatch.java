
import java.awt.*;
import javax.swing.*;

public class Stopwatch extends JPanel{
	private Timer timeIt;
	private JButton start, stop, reset;
	private JLabel theSeconds;
	private static int seconds = 0;
	
	public Stopwatch() {
		theSeconds = new JLabel(seconds + "s");
		start = new JButton("start");
		stop = new JButton("stop");
		reset = new JButton("reset");
		
		start.addActionListener((event) -> timeIt.start());
		stop.addActionListener((event) -> timeIt.stop());
		reset.addActionListener((event) -> { 
			timeIt.stop();
			seconds = 0;
			theSeconds.setText(seconds + "s");
		});

		timeIt = new Timer(1000, (event) -> {
			seconds++;
			theSeconds.setText(seconds + "s");
		});
		
		add(theSeconds);
		add(start);
		add(stop);
		add(reset);
		setPreferredSize(new Dimension(300,100));
	}
	
}
