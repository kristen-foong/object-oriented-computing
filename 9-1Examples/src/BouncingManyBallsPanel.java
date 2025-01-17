import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

import javax.swing.JPanel;

public class BouncingManyBallsPanel extends JPanel {
	private Timer t;
	private int xDirection = 10, yDirection = 5;
	private ArrayList<Ball> ballList;

	public BouncingManyBallsPanel() {
		ballList = new ArrayList<Ball>();
		Random gen = new Random();
		//initial random point of first ball
		Point p = new Point(gen.nextInt(400), gen.nextInt(400));
		Ball b = new Ball(p, xDirection, yDirection);
		ballList.add(b);
		t = new Timer(50, new TimerListener());
		t.start();
		addMouseListener(new ClickListener());
		setBackground(Color.black);
		setPreferredSize(new Dimension(400, 400));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		g2.setColor(Color.magenta);
		//goes through entire ball list
		for (Ball b : ballList) {
			Point p = b.getPoint();
			Ellipse2D.Double ball = new Ellipse2D.Double(p.getX(), p.getY(), 20, 20);
			g2.fill(ball);
		}
	}

	private class TimerListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			//iterate through entire list of balls
			for (Ball b : ballList) {
				Point p = b.getPoint();
				//check if off the canvas
				if (p.getX() >= 380 || p.getX() <= 0) {
					b.setxDirection(b.getxDirection() * -1);
				}
				if (p.getY() >= 380 || p.getY() <= 0) {
					b.setyDirection(b.getyDirection()* -1);
				}
				p.setLocation((p.getX() + b.getxDirection()), (p.getY() + b.getyDirection()));
				b.setPoint(p);
			}
			//don't forget to repaint!!!
			repaint();
		}
	}

	private class ClickListener extends MouseAdapter {
		//extends so we don't have to implement the other methods
		public void mouseClicked(MouseEvent event) {
			//adds a ball at our click point
			ballList.add(new Ball(event.getPoint(), xDirection, yDirection));
		}
	}
}
