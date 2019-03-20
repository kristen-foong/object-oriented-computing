import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class ButtonPanel extends JPanel {
	private JCheckBox red, green, blue;
	private Color bgColor;

	public ButtonPanel() {
		bgColor = new Color(0,0,0);
		
		JPanel organizer = new JPanel();
		organizer.setLayout(new BoxLayout(organizer, BoxLayout.X_AXIS));
		
		CheckBoxListener cb = new CheckBoxListener();
		
		red = new JCheckBox("Red");
		red.addItemListener(cb);
		green = new JCheckBox("Green");
		green.addItemListener(cb);
		blue = new JCheckBox("Blue");
		blue.addItemListener(cb);
		organizer.add(red);
		organizer.add(green);
		organizer.add(blue);
		
		add(organizer);
		setBackground(bgColor);
		setPreferredSize(new Dimension(200,200));
	}

	

	private class CheckBoxListener implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			int r = 0, g = 0, b = 0;
			if(red.isSelected())
				r = 255;
			if(green.isSelected())
				g = 255;
			if(blue.isSelected())
				b = 255;
			bgColor = new Color(r,g,b);
			setBackground(bgColor);
		}
	}
	
	
	
}
