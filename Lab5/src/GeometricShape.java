/**
 * GeometricShape is an abstract class. The shape can be filled or not filled with a 
 * given color. GeometricShape implements the Comparable interface and has a method 
 * that compares two GeometricShapes and returns the larger of the two.
 * @author Kristen Foong
 * @class  CPSC1181
 * @lab	   Lab5
 */

public abstract class GeometricShape implements Comparable<GeometricShape>{
	public String color;
	public boolean isFilled;

	//abstract classes to be implemented by child classes
	public abstract double getArea();
	public abstract double getPerimeter();

	/**
	 * Default Constructor for GeometricShape
	 */
	public GeometricShape() {
		this.color = "white";
		this.isFilled = true;
	}
	
	/**
	 * Constructor for GeometricShape
	 * @param color		the color of the shape
	 * @param isFilled	whether the shape is filled with the color or not
	 */
	public GeometricShape(String color, boolean isFilled) {
		this.color = color;
		this.isFilled = isFilled;
	}

	/**
	 * Gets the color of the shape
	 * @return	the string color of the shape
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Sets the color of the shape
	 * @param color	the new color of the shape
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Checks if the shape is filled with the color
	 * @return	a boolean whether the shape is filled with the color
	 */
	public boolean isFilled() {
		return isFilled;
	}

	/**
	 * Sets the shape to be filled or not filled
	 * @param isFilled	a boolean
	 */
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	/**
	 * A string that summarizes the GeometricShape
	 */
	public String toString() {
		return "GeometricShape[color=" + this.color + ", isFilled=" + this.isFilled + "]";
	}
	
	/**
	 * Uses the Comparable interface and compares the current shape's area to the
	 * provided shape's area
	 * @param g2 	the shape to be compared with
	 */
	public int compareTo(GeometricShape g2) {
		return (int)(this.getArea() - g2.getArea());
	}
	
	/**
	 * Sorts an array of GeometricShapes
	 * @param arr	an array of GeometricShapes
	 * @return		the array that has been sorted
	 */
	public GeometricShape[] sort(GeometricShape[] arr) {
		GeometricShape[] shapeArr = arr;
		for(int i = 1; i < shapeArr.length - 1; i++) {
			int j = i-1;
			GeometricShape temp = arr[i+1];
			while(j > -1 && shapeArr[i].compareTo(temp) > 0) {
				shapeArr[j+1] = shapeArr[j];
				j--;
			}
			shapeArr[j+1] = temp;
		}
		return shapeArr;
	}
	
	/**
	 * Returns the larger of the two passed in shapes
	 * @param g1	the first GeometricShape	
	 * @param g2	the second GeometricShape
	 * @return		the larger of the two shapes
	 */
	public static GeometricShape max(GeometricShape g1, GeometricShape g2) {
		if(g1.compareTo(g2) < 0) {
			return g2;
		}else {
			return g1;
		}
	}
	
	/**
	 * Sums up all the areas of the GeometricShapes within an array
	 * @param shapes	the array of GeometricShapes to be summed
	 * @return			the total area of all GeometricShapes in the array
	 */
	public static double sumArea(GeometricShape[] shapes) {
		double sum = 0;
		for(GeometricShape g: shapes) {
			sum += g.getArea();
		}
		return sum;
	}

}
