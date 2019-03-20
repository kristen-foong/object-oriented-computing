/**
 * The Octagon class is a child class of GeometricShape. Octagon has a sideLength.
 * The getPerimeter method returns the perimeter of the octagon. The getArea method
 * returns the area of the octagon.
 * @author Kristen Foong
 * @class CPSC1181
 * @lab Lab 5
 *
 */
public class Octagon extends GeometricShape {
	private int sideLength;
	
	/**
	 * The default constructor of the Octagon class
	 */
	public Octagon() {
		super();
		this.sideLength = 5;
	}
	
	/**
	 * Octagon constructor
	 * @param color			the color of the octagon
	 * @param isFilled		whether the octagon is filled with this color
	 * @param sideLength	the length of one side of the octagon
	 */
	public Octagon(String color, boolean isFilled, int sideLength) {
		super(color, isFilled);
		this.sideLength = sideLength;
	}

	/**
	 * Returns the side length of the octagon
	 * @return	the side length of the octagon
	 */
	public int getSideLength() {
		return this.sideLength;
	}

	/**
	 * Sets the side length of the octagpon
	 * @param sideLength	the new side length of the octagon
	 */
	public void setSideLength(int sideLength) {
		this.sideLength = sideLength;
	}
	
	/**
	 * Gets the area of the octagon
	 * @return the area of the octagon
	 */
	public double getArea() {
		double cut = Math.pow(Math.pow(this.getSideLength(),2), 0.5);
		double area = Math.pow(this.getSideLength() + 2*cut,2) - 2*Math.pow(cut, 2);
		return area;
	}
	
	/**
	 * Gets the perimeter of the octagon
	 * @eturn the perimeter of the octagon
	 */
	public double getPerimeter() {
		return (this.getSideLength()*8);
	}

	/**
	 * A string summary of the octagon
	 * @return a string summarizing the properties of the octagon
	 */
	public String toString() {
		return "Octagon[color=" + this.getColor() + ", isFilled=" + this.isFilled() + ", sideLength="
				+ this.getSideLength() + "]";
	}
}
