import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DropDownPanel extends JPanel{
	private JComboBox<String> colorCombo;
	private Color[] colorOptions;
	public DropDownPanel() {
		JLabel instruction  = new JLabel("Pick a background color: ");
		
		colorOptions = new Color[]{Color.white, Color.cyan, Color.magenta, Color.green, Color.red, Color.blue, Color.yellow}; 
		String[] colorNames = {"White", "Cyan", "Magenta", "Green", "Red", "Blue", "Yellow"};
		
		colorCombo = new JComboBox<String>(colorNames);
		colorCombo.setAlignmentX(Component.CENTER_ALIGNMENT);
		colorCombo.addActionListener(new ComboListener());
		
		add(instruction);
		add(colorCombo);
		setBackground(Color.white);
		setPreferredSize(new Dimension(500, 100));
	}
	private class ComboListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			int index = colorCombo.getSelectedIndex();
			setBackground(colorOptions[index]);
		}
	}
}
