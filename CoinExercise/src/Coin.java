
public class Coin {
	private static final int HEADS = 0, TAILS = 1;
	private int face;
	
	public Coin() {
		flip();
	}
	
	public int getFace() {
		return this.face;
	}
	
	public void setFace(int face) {
		this.face = face;
	}
	
	public void flip() {
		this.face = (Math.random() < 0.5)? HEADS: TAILS;
	}
	
	public boolean isHeads() {
		if(this.face == HEADS) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		String str = "The coin displays " + this.face;
		return str;
	}
}
