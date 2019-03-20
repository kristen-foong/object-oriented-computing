
public class DogTester {

	public static void main(String args[]) {
		
		//generates three dogs: Rover, Bella, and Zelda
		//prints out the information about these dogs
		Dog rover = new Dog("Rover", "German Shepherd", Dog.Sex.male, 5);
		Dog bella = new Dog("Bella", "Pug", Dog.Sex.female, 7);
		Dog zelda = new Dog("Zelda", "Shiba Inu", Dog.Sex.female, 2);
		System.out.println(rover);
		System.out.println(bella);
		System.out.println(zelda);
		System.out.println();
		
		// Mate dogs:
		// Rover with Bella
		Dog alpha = bella.mate(rover, "Alpha");
		System.out.println(alpha);
		
		// Rover with Zelda
		Dog beta = rover.mate(zelda,  "Beta");
		System.out.println(beta);
		
		// Bella with Zelda
		Dog gamma = bella.mate(zelda,  "Gamma");
		System.out.println(gamma);
	}

}
