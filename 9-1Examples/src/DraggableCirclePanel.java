import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class DraggableCirclePanel extends JPanel {
	private Point p1, p2;

	public DraggableCirclePanel() {

		p1 = null;
		p2 = null;

		addMouseListener(new LineListener());
		addMouseMotionListener(new LineListener());

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
			// TODO Auto-generated method stub
			
		}

	}

}
