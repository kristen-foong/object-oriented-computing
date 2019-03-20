
public class Die implements Comparable<Die>{
	private int sides, faceUp;
	private String color;

	public Die(int sides, String color, int faceUp) {
		this.sides = sides;
		this.faceUp = faceUp;
		this.color = color;
	}

	public Die() {
		this.sides = 6;
		this.faceUp = 1;
		this.color = "white";
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	public int getFaceUp() {
		return faceUp;
	}

	public void setFaceUp(int faceUp) {
		this.faceUp = faceUp;
	}

	public int roll() {
		faceUp = (int) (Math.random() * (sides - 1) + 1);
		return faceUp;
	}

	public String toString() {
		String str = "Die: " + this.sides + " sides,  " + this.color + ", " + this.faceUp + " is face up";
		return str;
	}
	
	/* use of interface */
	public int compareTo(Die dice) {
		if(this.faceUp < dice.getFaceUp()) {
			return -1;
		}else if(this.faceUp == dice.getFaceUp()) {
			return 0;
		}else {
			return 1;
		}
		/*
		 * alternatively:
		 * return this.faceUp - dice.getFaceUp();
		 * 
		 * works so long as it returns a positive, negative, or 0 integer
		 */
	}
}
