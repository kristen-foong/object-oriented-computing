/**
 * The BallComponent class is a subclass of JPanel. There is a paint component and a
 * mouse listener. In the mouse listener, a new ball is created and added to the ball 
 * array. A new thread is also created, with the ball passed in as a parameter, and
 * started.
 * @auth Kristen Foong
 * @class CPSC1181
 * @lab lab 9
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JPanel;


public class BallComponent extends JPanel{
	private ArrayList<Ball> ballArr = new ArrayList<Ball>();
	
	/**
	 * Constructor for the BallComponent class
	 */
	public BallComponent() {
		addMouseListener(new ClickListener());
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(500, 500));
	}
	
	/**
	 * Draws each ball in the BallArray
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		for(Ball b:ballArr) {
			b.draw(g2);
		}
	}
	
	/**
	 * Helper method that gets the JComponent
	 * @return this JComponent
	 */
	public JComponent getThis() {
		return this;
	}
	
	/**
	 * A listener that gets the point at which the mouse is clicked,
	 * creates a new ball and adds it to the array,
	 * creates a new thread with the ball passed as a parameter and starts the thread
	 */
	private class ClickListener extends MouseAdapter {
		public void mouseClicked(MouseEvent event) {
			Point p = event.getPoint();
			Ball b = new Ball((int)p.getX(), (int)p.getY(), getThis());
			ballArr.add(b);
			Thread t = new Thread(b);
			t.start();
		}
	}
	
}
