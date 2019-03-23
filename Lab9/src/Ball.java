/**
 * The Ball class implements the Runnable interface. The ball has a set x and y position
 * and a diameter of 25 and a red color. The velocity is randomly picked, either 5 or -5.
 * The move method checks if the ball is within the component size and updates the xVelocity,
 * yVelocity, x, and y positions. The draw method draws a ball. While the thread is not
 * interrupted, the draw method moves the ball, repaints, and sets the thread to sleep.
 * @auth Kristen Foong
 * @class CPSC1181
 * @lab Lab 9
 */

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.*;
import java.util.Random;
import javax.swing.*;
import java.awt.Color;

public class Ball implements Runnable{
	private int diameter = 25;
	private Color col;
	private int x, y, xVelocity, yVelocity;
	private JComponent comp;
	
	/**
	 * Constructor for the Ball class
	 * @param x		the x position
	 * @param y		the y position
	 * @param comp	the JComponent to be passed in
	 */
	public Ball(int x, int y, JComponent comp) {
		this.x = x;
		this.y = y;
		this.comp = comp;
		//randomly set x / y velocities
		Random rand = new Random();
		if(rand.nextBoolean()) {
			this.xVelocity = 5;
		}else {
			this.xVelocity = -5;
		}
		if(rand.nextBoolean()) {
			this.yVelocity = 5;
		}else {
			this.yVelocity = -5;
		}
		Random num = new Random();
		this.col = new Color(num.nextInt(256), num.nextInt(256), num.nextInt(256));
	}
	
	/**
	 * The method that updates the x & y velocities so the ball stays within the bounds
	 * of the Component
	 */
	public void move() {
		//check if within bounds of component
		Dimension size = comp.getSize();
		if(this.x >= size.getWidth()-diameter || this.x <= 0) {
			this.xVelocity *= -1;
		}
		if(this.y >= size.getHeight()-diameter || this.y <= 0) {
			this.yVelocity *= -1;
		}
		this.x += xVelocity;
		this.y += yVelocity;
	}
	
	/**
	 * Draws and fills a ball
	 * @param g2
	 */
	public void draw(Graphics2D g2) {
		g2.setColor(col);
		Ellipse2D.Double ball = new Ellipse2D.Double(this.x, this.y, diameter, diameter);
		g2.fill(ball);
	}
	
	/**
	 * While the thread is not interrupted, the run method
	 * moves the ball, repaints, and sets the therad to sleep
	 */
	public void run() {
		try {
			while(!Thread.interrupted()) {
				this.move();
				comp.repaint();
				Thread.sleep(60);
			}
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
