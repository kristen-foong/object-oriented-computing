/**
 * The ShapeComponent class sets frame which is white in color. Colors are random, and the
 * class draws rows of Octagons, Circles, and Pentagons.
 * @author Kristen Foong
 * @class CPSC1181
 * @lab Lab6
 */

import java.awt.*;
import java.util.Random;
import javax.swing.JComponent;

public class ShapeComponent extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.WHITE);
		g2.fillRect(0, 0, 500, 500);
		
		Color c = getColor();
		
		int x = 10;
		int y = 10;
		int increment = 70;
		
		Octagon o1 = new Octagon(c, true, 25, x, y);
		c = getColor();
		Octagon o2 = new Octagon(c, false, 25, x+increment, y);
		c = getColor();
		Octagon o3 = new Octagon(c, true, 25, x+(2*increment), y);
		c = getColor();
		Octagon o4 = new Octagon(c, false, 25, x+(3*increment), y);
		c = getColor();
		Octagon o5 = new Octagon(c, true, 25, x+(4*increment), y);
		o1.draw(g2);
		o2.draw(g2);
		o3.draw(g2);
		o4.draw(g2);
		o5.draw(g2);

		c = getColor();
		Circle c1 = new Circle(c, false, 30, x, y+increment);
		c = getColor();
		Circle c2 = new Circle(c, true, 30, x+increment, y+increment);
		c = getColor();
		Circle c3 = new Circle(c, false, 30, x+(2*increment), y+increment);
		c = getColor();
		Circle c4 = new Circle(c, true, 30, x+(3*increment), y+increment);
		c = getColor();
		Circle c5 = new Circle(c, false, 30, x+(4*increment), y+increment);
		c1.draw(g2);
		c2.draw(g2);
		c3.draw(g2);
		c4.draw(g2);
		c5.draw(g2);

		c = getColor();
		Pentagon p1 = new Pentagon(c, true, 35, x, y+(2*increment));
		c = getColor();
		Pentagon p2 = new Pentagon(c, false, 35, x+ increment, y+(2*increment));
		c = getColor();
		Pentagon p3 = new Pentagon(c, true, 35, x+(2*increment), y+(2*increment));
		c = getColor();
		Pentagon p4 = new Pentagon(c, false, 35, x+(3*increment), y+(2*increment));
		c = getColor();
		Pentagon p5 = new Pentagon(c, true, 35, x+(4*increment), y+(2*increment));
		p1.draw(g2);
		p2.draw(g2);
		p3.draw(g2);
		p4.draw(g2);
		p5.draw(g2);
	}
	
	public Color getColor() {
		Random num = new Random();
		return new Color(num.nextInt(256), num.nextInt(256), num.nextInt(256));
	}
}
