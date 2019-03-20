import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class MoveableCirclePanel extends JPanel {
	private Point p1, p2;

	public MoveableCirclePanel() {

		p1 = null;
		p2 = null;

		addMouseListener(new LineListener());
		addMouseMotionListener(new LineListener());

		addKeyListener(new WASDListener());
		setFocusable(true);
		
		setBackground(Color.black);
		setPreferredSize(new Dimension(500, 500));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.magenta);
		if (p1 != null && p2 != null) {
			double radius = Math.sqrt(Math.pow(p2.x - p1.x,2)+Math.pow(p2.y-p1.y,2));
			Ellipse2D.Double circle = new Ellipse2D.Double(p1.x - radius, p1.y-radius, radius*2, radius*2);
			g2.draw(circle);
		}
	}
	private class WASDListener extends KeyAdapter{
		public void keyPressed(KeyEvent event) {
			switch(event.getKeyCode()) {
			case KeyEvent.VK_S:
				p1.setLocation(p1.getX(), p1.getY()+5);
				p2.setLocation(p2.getX(), p2.getY()+5);
				break;
			case KeyEvent.VK_W:
				p1.setLocation(p1.getX(), p1.getY()-5);
				p2.setLocation(p2.getX(), p2.getY()-5);
				break;
			case KeyEvent.VK_A:
				p1.setLocation(p1.getX()-5, p1.getY());
				p2.setLocation(p2.getX()-5, p2.getY());
				break;
			case KeyEvent.VK_D:
				p1.setLocation(p1.getX()+5, p1.getY());
				p2.setLocation(p2.getX()+5, p2.getY());
				break;
			}
			repaint();
		}
		
	}
	private class LineListener implements MouseListener, MouseMotionListener {
		public void mousePressed(MouseEvent event) {
			p1 = event.getPoint();
			repaint();
		}
		public void mouseDragged(MouseEvent event) {
			p2 = event.getPoint();
			repaint();
		}
		@Override
		public void mouseClicked(MouseEvent event) {
		}
		@Override
		public void mouseEntered(MouseEvent event) {
		}
		@Override
		public void mouseExited(MouseEvent event) {
		}
		@Override
		public void mouseReleased(MouseEvent event) {
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			
		}

	}

}
