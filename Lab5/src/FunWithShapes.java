/**
 * The FunWithShapes class is a tester class that checks that the GeometricShape,
 * Circle, and Octagon classes function, as well as the methods within the classes
 * (such as compareTo, max, and sumArea).
 * @author Kristen Foong
 * @class CPSC1181
 * @lab Lab 5
 *
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections; 

public class FunWithShapes {

	public static void main(String[] args) {
		//create array of GeometricShapes
		GeometricShape[] shapeArr = new GeometricShape[5];
		shapeArr[0] = new Circle();
		shapeArr[1] = new Circle("blue", true, 20);
		shapeArr[2] = new Octagon();
		shapeArr[3] = new Octagon("red", false, 10);
		shapeArr[4] = new Circle("orange", true, 1);

		GeometricShape g1 = shapeArr[0];
		GeometricShape g2 = shapeArr[1];
		GeometricShape g3 = shapeArr[2];
		GeometricShape g4 = shapeArr[3];
		GeometricShape g5 = shapeArr[4];
		
		//toString
		System.out.println("Current Shape Array");
		System.out.println("--------------------");
		for(int i = 0; i < shapeArr.length; i++) {
			String str = "g" + (i+1) + ". ";
			System.out.println(str + shapeArr[i]);
		}
		
		//max
		System.out.println("\nTesting max method");
		System.out.println("--------------------");
		System.out.println("Comparing Circle[radius=1] and Circle[radius=20]");
		System.out.println(GeometricShape.max(g1,  g2));
		System.out.println("\nComparing Octagon[sideLength=5] and Octagon[sideLength=10]");
		System.out.println(GeometricShape.max(g3,  g4));
		System.out.println("\nComparing Circle[radius=1] and Octagon[sideLength=10]");
		System.out.println(GeometricShape.max(g1,  g4));
		System.out.println("\nComparing Circle[radius=1] and Circle[radius=1]");
		System.out.println(GeometricShape.max(g1,  g5));
		
		//compareTo
		System.out.println("\nTesting compareTo method");
		System.out.println("--------------------");
		System.out.println("Comparing Circle[radius=1] and Circle[radius=20]");
		System.out.println(g1.compareTo(g2));
		System.out.println("\nComparing Octagon[sideLength=5] and Octagon[sideLength=10]");
		System.out.println(g3.compareTo(g4));
		System.out.println("\nComparing Octagon[sideLength=10] and Circle[radius=1]");
		System.out.println(g4.compareTo(g1));
		System.out.println("\nComparing Circle[radius=1] and Circle[radius=10]");
		System.out.println(g1.compareTo(g5));
		
		//sumArea
		System.out.println("\nTesting sumMethod method");
		System.out.println("--------------------");
		System.out.println(GeometricShape.sumArea(shapeArr));
		
		//sort
		System.out.println("\nTesting sort method");
		System.out.println("--------------------");
		GeometricShape[] shapeArrCopy = new GeometricShape[5];
		for(int i = 0; i < shapeArr.length; i++) {
			shapeArrCopy[i] = shapeArr[i];
		}
		Arrays.sort(shapeArrCopy);
		System.out.println(Arrays.toString(shapeArrCopy));
		
		//ShapeComparator
		System.out.println("\nTesting ShapeComparator");
		System.out.println("--------------------");
		ArrayList<GeometricShape> geoArr = new ArrayList<GeometricShape>();
		for(int i = 0; i < shapeArr.length; i++) {
			geoArr.add(shapeArr[i]);
		}
		System.out.println("Before Sort:");
		System.out.println(geoArr);
		System.out.println("\nAfter Sort:");
		Collections.sort(geoArr, new ShapeComparator());
		System.out.println(geoArr);
	}

}
