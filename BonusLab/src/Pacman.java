
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.*;
import java.awt.Dialog;

public class Pacman extends JPanel{
	private ImageIcon pellet, currGhost, pacman, blue;
	private Point pelletLocation, ghostLocation, pacmanLocation;
	private double pacRight, pacLeft, pacTop, pacBottom; 
	private Timer timeIt;
	private int xDirection = 5;
	private int yDirection = 5;
	private ArrayList<ImageIcon> ghostArr;
	private boolean alive = true;
	private boolean poweredUp = false;
	private boolean eatenGhost = false;
	
	public Pacman() {

		ImageIcon inky = new ImageIcon("inky.png");
		ImageIcon pinky = new ImageIcon("pinky.png");
		ImageIcon blinky = new ImageIcon("blinky.png");
		ImageIcon clyde = new ImageIcon("clyde.png");
		blue = new ImageIcon("blue.png");
		pacman = new ImageIcon("pacman.png");
		pellet = new ImageIcon("pellet.png");
		
		ghostArr = new ArrayList<ImageIcon>();
		ghostArr.add(inky);
		ghostArr.add(pinky);
		ghostArr.add(blinky);
		ghostArr.add(clyde);
		
		Random gen = new Random();
		pelletLocation = new Point(gen.nextInt(400), gen.nextInt(400));
		ghostLocation = new Point(gen.nextInt(400), gen.nextInt(400));
		pacmanLocation = null;
		
		currGhost = inky;
		alive = true;
		timeIt = new Timer(50, new TimerListener());
		timeIt.start();
		
		addKeyListener(new GhostListener());
		addMouseListener(new PacmanListener());
		addMouseMotionListener(new PacmanListener());
		setFocusable(true);
		
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(500,500));
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		currGhost.paintIcon(this, g2, (int)ghostLocation.getX(), (int)ghostLocation.getY());
		pellet.paintIcon(this, g2, (int)pelletLocation.getX(), (int)pelletLocation.getY());
		if(pacmanLocation != null) {
			pacman.paintIcon(this, g2, (int)pacmanLocation.getX()-50, (int)pacmanLocation.getY()-50);
		}
	}
	
	private class TimerListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			int gHeight = 90; //ghost height
			int gWidth = 70;
			int phw = 20; //pellet diameter
			
			double ghostRight = ghostLocation.getX() + gWidth;
			double ghostLeft = ghostLocation.getX(); 
			double ghostTop = ghostLocation.getY();
			double ghostBottom = ghostLocation.getY() + gHeight;
		
			double pelletRight = pelletLocation.getX() + gWidth;
			double pelletLeft = pelletLocation.getX(); 
			double pelletTop = pelletLocation.getY();
			double pelletBottom = pelletLocation.getY() + gHeight;
			
			if (ghostLocation.getX() >= 400 || ghostLocation.getX() <= 0) {
				xDirection *= -1;
			}
			if (ghostLocation.getY() >= 400 || ghostLocation.getY() <= 0) {
				yDirection *= -1;
			}
			ghostLocation.setLocation((ghostLocation.getX() + xDirection), (ghostLocation.getY() + yDirection));
			
			if(pacmanLocation != null) {
				//intersection of pacman and pellet
				if(pacBottom < pelletTop || pacTop > pelletBottom || pacLeft > pelletRight || pacRight < pelletLeft) {
					poweredUp = false;
				}else {
					poweredUp = true;
					currGhost = blue;
				}
				//intersection of pacman and ghost
				if(pacBottom < ghostTop || pacTop > ghostBottom || pacLeft > ghostRight || pacRight < ghostLeft) {
					if(poweredUp) {
						eatenGhost = true;
					}
				}else {
					alive = false;
				}
			}
			
			if(alive) {
				repaint();
			}else if (eatenGhost){
				System.out.println("time to stop");
				xDirection = 0;
				yDirection = 0;
				timeIt.stop();
				JOptionPane.showMessageDialog(null, "You Win!");
			}else {
				System.out.println("time to stop");
				xDirection = 0;
				yDirection = 0;
				timeIt.stop();
				JOptionPane.showMessageDialog(null, "You Lose!");
			}
			
		}
	}
	
	private class GhostListener extends KeyAdapter {
		public void keyPressed(KeyEvent event) {
			switch(event.getKeyCode()) {
			case KeyEvent.VK_P:
				currGhost = ghostArr.get(1);
				break;
			case KeyEvent.VK_B:
				currGhost = ghostArr.get(2);
				break;
			case KeyEvent.VK_I:
				currGhost = ghostArr.get(0);
				break;
			case KeyEvent.VK_C:
				currGhost = ghostArr.get(3);
				break;
			}
			repaint();
		}
	}
	
	private class PacmanListener implements MouseListener, MouseMotionListener {
		public void mouseEntered(MouseEvent event) {
			int pwh = 50; //pacman diameter
			pacmanLocation = event.getPoint();
			pacRight = pacmanLocation.getX() + pwh;
			pacLeft = pacmanLocation.getX() - pwh; 
			pacTop = pacmanLocation.getY() - pwh;
			pacBottom = pacmanLocation.getY() + pwh;
			repaint();
		}
		public void mouseMoved(MouseEvent event) {
			int pwh = 50; //pacman diameter
			pacmanLocation = event.getPoint();
			pacRight = pacmanLocation.getX() + pwh;
			pacLeft = pacmanLocation.getX() - pwh; 
			pacTop = pacmanLocation.getY() - pwh;
			pacBottom = pacmanLocation.getY() + pwh;
			repaint();
		}
		@Override
		public void mouseClicked(MouseEvent event) {
		}
		@Override
		public void mousePressed(MouseEvent event) {
		}
		@Override
		public void mouseExited(MouseEvent event) {
		}
		@Override
		public void mouseReleased(MouseEvent event) {
		}
		
		@Override
		public void mouseDragged(MouseEvent arg0) {
			
		}

	}
}	
