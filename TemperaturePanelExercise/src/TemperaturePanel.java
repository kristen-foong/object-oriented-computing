import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperaturePanel extends JPanel{
	private JTextField input;
	private JLabel output;
	
	public TemperaturePanel() {
		JLabel ins = new JLabel("Enter temp in F: ");
		input = new JTextField(5);
		/*
		JButton button = new JButton("Press to convert");
		button.addActionListener(new TemperatureListener());
		*/
		input.addActionListener(new TemperatureListener());
		output = new JLabel("Temp in celsius: ");
		
		add(ins);
		add(input);
		//add(button);
		add(output);
		setPreferredSize(new Dimension(350,299));
		setBackground(Color.ORANGE);
	}
	
	private class TemperatureListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String text = input.getText();
			double f = Double.parseDouble(text);
			double c = (f - 32)*5/9;
			output.setText("Temp in celsius: " + c);
		}
	}
	
}
