import java.util.Random;

public class Dog {
	enum Sex {male, female};
	private String name;
	private String breed;
	private int age;
	private Sex gender;
	static int numDogs = 0;
	
	/**
	 * The Dog constructor
	 * @param name the name of the dog
	 * @param breed the breed of the dog
	 * @param gender the dog's gender
	 * @param age the dog's age
	 */
	public Dog(String name, String breed, Sex gender, int age) {
		this.gender = gender;
		this.name = name;
		this.breed = breed;
		this.age = age;
		numDogs++;
	}
	
	/**
	 * Default constructor for Dog class
	 */
	public Dog() {
		this.gender = Sex.male;
		this.name = "Rex";
		this.breed = "Beagle";
		this.age = 1;
		numDogs++;
	}
	
	/**
	 * returns the name of the Dog
	 * @return the name of the Dog
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * sets the name of the Dog
	 * @param name the new name of the dog
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * returns the breed of the dog
	 * @return the dog's breed
	 */
	public String getBreed() {
		return this.breed;
	}
	
	/**
	 * sets the breed of the dog to the new breed
	 * @param breed the new breed of the dog
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	/**
	 * returns the age of the dog
	 * if the given age is below 0, sets the age to 0
	 * @return the dog's age
	 */
	public int getAge() {
		if(age < 0) {
			this.age = 0;
		}
		return this.age;
	}
	
	/**
	 * sets the age of the dog
	 * @param age the new age of the dog
	 */
	public void setAge(int age) {
		if(age < 0) {
			age = 0;
		}
		this.age = age;
	}
	
	/**
	 * returns the gender of the dog
	 * @return the dog's gender
	 */
	public Sex getSex() {
		return this.gender;
	}
	
	/**
	 * sets the gender of the dog
	 * @param gender the new gender of the dog
	 */
	public void setSex(Sex gender) {
		this.gender = gender;
	}
	
	/**
	 * calculates and returns the age of the dog in human years
	 * @return the dog's age in human years
	 */
	public int getHumanAge() {
		return age*7;
	}
	
	/**
	 * summarizes the information about the dog
	 */
	public String toString() {
		String str = "Dog [name=" + this.name;
		str += ", breed=" + this.breed;
		str += ", sex=" + this.gender;
		str += ", age=" + this.age;
		str += "]";
		return str;
	}
	
	/**
	 * returns the current number of dogs created
	 * @return the current number of dogs created
	 */
	static int getTotalDogs() {
		return numDogs;
	}
	
	/**
	 * resets the number of dogs created to 0
	 */
	static void resetTotalDogs() {
		numDogs = 0;
	}
	
	/**
	 * returns the Dog puppy with its resulting information
	 * @param partner the dog to be mated with
	 * @param newName the name of the resulting puppy
	 * @return the new puppy
	 */
	public Dog mate(Dog partner, String newName) {
		Dog puppy;
		if(this.gender == Sex.male && partner.gender == Sex.female || this.gender == Sex.female && partner.gender == Sex.male) {
			String newBreed = this.breed + " " + partner.breed;
			Random rand = new Random();
			Sex newGender;
			int gen = rand.nextInt(2) + 1;
			if(gen == 1) {
				newGender = Sex.male;
			}else {
				newGender = Sex.female;
			}
			puppy = new Dog(newName, newBreed, newGender, 0);
		}else {
			return null;
		}
		return puppy;
	}
	
}


