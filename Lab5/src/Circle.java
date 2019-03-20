/**
 * The Circle class is a child class of Geometric Shape and has a radius.
 * The getPerimeter method returns the perimeter of the circle.
 * @author Kristen Foong
 * @class CPSC1181
 * @lab Lab 5
 *
 */
public class Circle extends GeometricShape{
	private int radius;

	/**
	 * The Circle default constructor
	 */
	public Circle() {
		super();
		this.radius = 1;
	}

	/**
	 * The Circle Constructor
	 * @param color		the color of the circle
	 * @param isFilled	whether the circle is filled with that color or not
	 * @param radius	the radius of the circle
	 */
	public Circle(String color, boolean isFilled, int radius) {
		super(color, isFilled);
		this.radius = radius;
	}

	/**
	 * Gets the radius of the circle
	 * @return	the radius of the circle
	 */
	public int getRadius() {
		return this.radius;
	}

	/**
	 * Sets the radius of the circle
	 * @param radius	the new radius of the circle
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * A string summary of the Circle's properties
	 * @return a string that summarizes the circle's properties
	 */
	public String toString() {
		return "Circle[color=" + this.getColor() + ", isFilled=" + this.isFilled() + ", radius=" + this.getRadius() + "]";
	}

	/**
	 * Gets the area of the circle
	 * @return the area of the circle 
	 */
	public double getArea() {
		return Math.PI*Math.pow(this.getRadius(),2);
	}

	/**
	 * Gets the perimeter of the circle
	 * @return the perimeter of the circle
	 */
	public double getPerimeter() {
		return Math.PI*2*this.getRadius();
	}
}
