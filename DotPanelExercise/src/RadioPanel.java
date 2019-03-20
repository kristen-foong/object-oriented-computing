import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class RadioPanel extends JPanel {
	private JRadioButton up, down;
	private JTextField textbox;
	private String name;

	public RadioPanel() {
		
		JLabel instruction = new JLabel("Enter some text: ");
		textbox = new JTextField(25);
		
		up = new JRadioButton("UPPERCASE");
		down = new JRadioButton("lowercase");

		up.addActionListener(new RadioListener());
		down.addActionListener(new RadioListener());
	
		ButtonGroup group = new ButtonGroup();
		group.add(up);
		group.add(down);
		
		add(instruction);
		add(textbox);
		add(up);
		add(down);
		
		
		setPreferredSize(new Dimension(275,200));
	}

	

	private class RadioListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String text = textbox.getText();
			if(event.getSource() == up)
				textbox.setText(text.toUpperCase());
			else textbox.setText(text.toLowerCase());
		}
	}
	
	
	
}
