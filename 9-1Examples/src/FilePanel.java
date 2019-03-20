import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FilePanel extends JPanel {
	private JButton select;
	private JTextField fileName;

	public FilePanel() {
		fileName = new JTextField(25);
		select = new JButton("Select File");
		select.addActionListener(new ButtonListener());
		add(fileName);
		add(select);
		setBackground(Color.white);
		setPreferredSize(new Dimension(400, 400));
	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == select) {
				JFileChooser jfc = new JFileChooser();
				int status = jfc.showOpenDialog(null);
				if(status != JFileChooser.APPROVE_OPTION) {
					fileName.setText("No file chosen.");
				}else {
					File file = jfc.getSelectedFile();
					fileName.setText(file.getName());
				}
			}
		}
	}
}
