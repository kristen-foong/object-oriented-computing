/**
 * The ShapeComparator compares two GeometricShapes and returns an integer.
 * When used in sort, this Comparator will sort the array in descending order.
 * @auth Kristen Foong
 * @class CPSC1181
 * @lab Lab 5
 */

import java.util.Comparator;

public class ShapeComparator implements Comparator<GeometricShape>{
	public int compare(GeometricShape g1, GeometricShape g2) {
		return (int)(g2.getPerimeter() - g1.getPerimeter());
	}
}
