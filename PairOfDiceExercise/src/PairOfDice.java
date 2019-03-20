
public class PairOfDice {
	
	public static int rollDie(Die d1, Die d2) {
		return d1.roll() + d2.roll();
	}
	
	public static void main(String args[]) {
		Die d1 = new Die(20, "blue", (int)(Math.random()*19 + 1));
		Die d2 = new Die(6, "red", (int)(Math.random()*5 + 1));
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("Rolling Dice...");
		int sumOfDie = rollDie(d1, d2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("\nSum of Rolled Die: " + sumOfDie);
	}
}
