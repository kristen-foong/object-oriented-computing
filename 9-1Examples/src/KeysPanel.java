import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class KeysPanel extends JPanel {
	private JButton up, down, left, right;

	public KeysPanel() {
		JPanel organizer = new JPanel();
		organizer.setBackground(Color.white);
		organizer.setLayout(new BorderLayout());
		
		up = new JButton("^");
		up.setBackground(Color.white);

		down = new JButton("v");
		down.setBackground(Color.white);

		left = new JButton("<");
		left.setBackground(Color.white);

		right = new JButton(">");
		right.setBackground(Color.white);
		
		organizer.add(up, BorderLayout.NORTH);
		organizer.add(down, BorderLayout.SOUTH);
		organizer.add(right, BorderLayout.EAST);
		organizer.add(left, BorderLayout.WEST);
		
		add(organizer);
		addKeyListener(new ArrowListener());
		setPreferredSize(new Dimension(200, 100));
		setFocusable(true);
	}

	private class ArrowListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent event) {
			switch(event.getKeyCode()) {
			case KeyEvent.VK_UP:
				up.setBackground(Color.green);
				break;
			case KeyEvent.VK_DOWN:
				down.setBackground(Color.green);
				break;
			case KeyEvent.VK_LEFT:
				left.setBackground(Color.green);
				break;
			case KeyEvent.VK_RIGHT:
				right.setBackground(Color.green);
				break;
			}
		}

		@Override
		public void keyReleased(KeyEvent event) {
			up.setBackground(Color.white);
			down.setBackground(Color.white);
			left.setBackground(Color.white);
			right.setBackground(Color.white);
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}

	}
}