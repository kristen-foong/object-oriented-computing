import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlusMinusPanel extends JPanel{
	private JLabel output;
	private static int total = 0;
	private JButton plus, minus;
	
	public PlusMinusPanel() {
		minus = new JButton("--");
		minus.addActionListener(new PlusListener());
		plus = new JButton("++");
		plus.addActionListener(new PlusListener());
		output = new JLabel(" " + total + " ");
		
		add(minus);
		add(output);
		add(plus);
		
		setPreferredSize(new Dimension(350,200));
		setBackground(Color.CYAN);
	}
	
	/*
	private class MinusListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			total--;
			output.setText(" " + total + " ");
		}
	}
	*/
	
	private class PlusListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == plus) {
				total++;
			}else {
				total--;
			}
			output.setText(" " + total + " ");
		}
	}
	
	
}
