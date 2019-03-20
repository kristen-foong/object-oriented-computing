import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class DotPanel extends JPanel{
	private ArrayList<Dot> pointList;
	private int size;
	private Color color;
	
	public DotPanel() {
		
		pointList = new ArrayList<Dot>();
		
		addMouseListener(new DotListener());
		
		setBackground(Color.black);
		setPreferredSize(new Dimension(500,500));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		for(Dot p: pointList) {
			Ellipse2D.Double circle = new Ellipse2D.Double(p.getP().getX(),  p.getP().getY(), p.getSize(), p.getSize());
			g2.setColor(p.getColor());
			g2.fill(circle);
		}
		
	}
	
	private class DotListener implements MouseListener{
		public void mousePressed(MouseEvent event) {
			int x = event.getX(), y = event.getY();
			Point p = new Point(x,y);
			Random gen = new Random();
			int size = (gen.nextInt(3) + 1) * 5;
			Color c = new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
			Dot d = new Dot(size, c, p);
			pointList.add(d);
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
		
	}

}
