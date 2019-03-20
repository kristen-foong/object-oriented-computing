import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Dot{
	private int size;
	private Color color;
	private Point p;
	
	public Dot(int size, Color color, Point p) {
		this.size = size;
		this.color = color;
		this.p = p;
	}
	
	
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public Point getP() {
		return p;
	}


	public void setP(Point p) {
		this.p = p;
	}
	
}
