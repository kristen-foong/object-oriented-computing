/**
 * The Pentagon class is a child class of GeometricShape. Pentagon has a sideLength.
 * The getPerimeter method returns the perimeter of the pentagon. The getArea method
 * returns the area of the pentagon.
 * @author Kristen Foong
 * @class CPSC1181
 * @lab Lab 6
 *
 */

import java.awt.*;

public class Pentagon extends GeometricShape {
	private int sideLength;
	
	/**
	 * The default constructor of the Pentagon class
	 */
	public Pentagon() {
		super();
		this.sideLength = 5;
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Pentagon constructor
	 * @param color			the color of the Pentagon
	 * @param isFilled		whether the Pentagon is filled with this color
	 * @param sideLength	the length of one side of the Pentagon
	 */
	public Pentagon(Color color, boolean isFilled, int sideLength, int x, int y) {
		super(color, isFilled, x, y);
		this.sideLength = sideLength;
	}

	/**
	 * Returns the side length of the Pentagon
	 * @return	the side length of the Pentagon
	 */
	public double getSideLength() {
		return this.sideLength;
	}

	/**
	 * Sets the side length of the pentagon
	 * @param sideLength	the new side length of the Pentagon
	 */
	public void setSideLength(int sideLength) {
		this.sideLength = sideLength;
	}
	
	/**
	 * Gets the area of the Pentagon
	 * @return the area of the Pentagon
	 */
	public double getArea() {
		double area = Math.sqrt(5*(5+2*Math.sqrt(5)))*sideLength/4;
		return area;
	}
	
	/**
	 * Gets the perimeter of the Pentagon
	 * @eturn the perimeter of the Pentagon
	 */
	public double getPerimeter() {
		return (this.getSideLength()*5);
	}

	/**
	 * A string summary of the Pentagon
	 * @return a string summarizing the properties of the Pentagon
	 */
	public String toString() {
		return "Pentagon[color=" + this.getColor() + ", isFilled=" + this.isFilled() + ", sideLength="
				+ this.getSideLength() + "]";
	}
	
	public void draw(Graphics2D g2) {
		int points = 5;
		int a = (int)Math.sqrt(Math.pow(sideLength, 2)/5);
		int a2 = 2*a;
		
		int[] xPoints = {x+a2, x+(2*a2), x+a+a2, x+a, x};
		int[] yPoints = {y, y+a, y+a+a2, y+a+a2, y+a};
		
		Polygon Pentagon = new Polygon(xPoints, yPoints, points);
		g2.setColor(color);
		g2.draw(Pentagon);
		if(this.isFilled()) {
			g2.fill(Pentagon);
		}
	}
}
