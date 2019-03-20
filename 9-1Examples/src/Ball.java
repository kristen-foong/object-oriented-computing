import java.awt.Point;

public class Ball {
	private Point p;
	private int xDirection, yDirection;
	
	public Ball(Point p, int xDirection, int yDirection) {
		this.p = p;
		this.xDirection = xDirection;
		this.yDirection = yDirection;
	}

	public int getxDirection() {
		return xDirection;
	}

	public void setxDirection(int xDirection) {
		this.xDirection = xDirection;
	}

	public int getyDirection() {
		return yDirection;
	}

	public void setyDirection(int yDirection) {
		this.yDirection = yDirection;
	}

	public Point getPoint() {
		return p;
	}

	public void setPoint(Point p) {
		this.p = p;
	}
	
}
