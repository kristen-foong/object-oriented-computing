
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Rat {
	private int x, y;
	double scale;
	private Color c;
	
	public Rat(int x, int y, Color c) {
		this.x = x;
		this.y = y;
		this.c = c;
		this.scale = 1;
	}
	
	public Rat(int x, int y, Color c, double scale) {
		this.x = x;
		this.y = y;
		this.c = c;
		this.scale = scale;
	}
	
	public void draw(Graphics2D g2) {
		
		int scale5 = (int)(5*scale);
		int scale10 = (int)(10*scale);
		int scale15 = (int)(15*scale);
		int scale20 = (int)(20*scale);
		int scale30 = (int)(30*scale);
		int scale40 = (int)(40*scale);

		int[] xPoly = {x-scale20, x+scale20, x};
		int[] yPoly = {y+scale5, y+scale5, y+scale40};
		
		Polygon head = new Polygon(xPoly, yPoly, xPoly.length);
		Ellipse2D.Double body = new Ellipse2D.Double(x-scale20, y+scale20, scale40, scale40);
		Ellipse2D.Double leftEar = new Ellipse2D.Double(x-scale30, y, scale15, scale15);
		Ellipse2D.Double rightEar = new Ellipse2D.Double(x+scale15, y, scale15, scale15);
		Ellipse2D.Double leftEye = new Ellipse2D.Double(x-scale10, y+scale10, scale5, scale5);
		Ellipse2D.Double rightEye = new Ellipse2D.Double(x+scale5, y+scale10, scale5, scale5);
		Ellipse2D.Double nose = new Ellipse2D.Double(x-scale5, y+scale40, scale10, scale10);
		
		g2.setColor(c);
		g2.fill(body);
		g2.fill(head);
		g2.setStroke(new BasicStroke(1));
		g2.setColor(Color.DARK_GRAY);
		g2.drawPolygon(head);
		g2.setColor(c);
		g2.fill(leftEar);
		g2.fill(rightEar);
		g2.setColor(Color.BLACK);
		g2.fill(leftEye);
		g2.fill(rightEye);
		g2.setColor(Color.PINK);
		g2.fill(nose);
	}
}
