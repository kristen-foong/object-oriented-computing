import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.Random;

import javax.swing.*;

import javax.swing.JPanel;

public class BouncingBallPanel extends JPanel {
	//Point is part of the java.awt class
	private Point location;
	private Timer t;
	//arbitrary change values for x / y
	private int xDirection = 10, yDirection = 5; 
	private int delay;
	
	public BouncingBallPanel() {
		Random gen = new Random();
		//generates a random point for the ball to begin at
		location = new Point(gen.nextInt(400), gen.nextInt(400));
		//50 milliseconds between each repaint
		delay = 50;
		t = new Timer(delay, new TimerListener());
		t.start(); //start timer
		setBackground(Color.black);
		setPreferredSize(new Dimension(400, 400));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		g2.setColor(Color.magenta);
		//can use location.x or location.y as they are public instance data
		Ellipse2D.Double ball = new Ellipse2D.Double(location.getX(), location.getY(), 20, 20);
		g2.fill(ball);
	}

	private class TimerListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			//if location is about to go too far left / right
			//switch the direction
			if (location.getX() >= 380 || location.getX() <= 0) {
				xDirection *= -1;
				//can set the delay in the timer to change to speed up / slow down ball
				if(delay > 0) {
					delay-=5;
				}
				t.setDelay(delay);
			}
			//if location is about to go too far up / down
			//switch the direction
			if (location.getY() >= 380 || location.getY() <= 0) {
				yDirection *= -1;
				if(delay > 0) {
					delay-=5;
				}
				t.setDelay(delay);
			}
			location.setLocation((location.getX() + xDirection), (location.getY() + yDirection));
			//redraws the entire panel
			repaint();
		}
	}
}
