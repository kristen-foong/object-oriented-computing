import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;

import javax.swing.*;
import javafx.scene.shape.Circle;

public class LinePanel extends JPanel {
	private Point p1, p2;
	
	public LinePanel() {
		p1 = null;
		p2 = null;
		addMouseListener(new LineListener());
		addMouseMotionListener(new LineListener());
		addKeyListener(new ArrowListener());
		setBackground(Color.black);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.magenta);
		if(p1 != null && p2 != null) {
			// g2.drawLine(p1.x,  p1.y,  p2.x,  p2.y);
			double radius = Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2);
			radius = Math.sqrt(radius);
			Ellipse2D.Double circle = new Ellipse2D.Double(p1.x - radius, p1.y - radius, radius*2, radius*2);
			g2.draw(circle);
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
		public void mouseClicked(MouseEvent event) {}

		@Override
		public void mouseEntered(MouseEvent event) {}

		@Override
		public void mouseExited(MouseEvent event) {}

		@Override
		public void mouseReleased(MouseEvent event) {}
		
		@Override
		public void mouseMoved(MouseEvent event) {}
		
	}
	
	private class ArrowListener implements KeyListener {
		public void keyPressed(KeyEvent event){
			switch(event.getKeyCode()){
				case KeyEvent.VK_UP:
					p1.y++;
					break;
				case KeyEvent.VK_DOWN:
					p1.y--;
					break;
				case KeyEvent.VK_LEFT:
					p1.x--;
					break;
				case KeyEvent.VK_RIGHT:
					p1.x++;
					break;
			}
		}
		
		@Override
		public void keyReleased(KeyEvent event) {}
		@Override
		public void keyTyped(KeyEvent event) {}

	}
}
