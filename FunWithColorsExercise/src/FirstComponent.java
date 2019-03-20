
import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.util.Random;

public class FirstComponent extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Rectangle box = new Rectangle(0,0,100,100);
		
		Random num = new Random();
		Color c = new Color(num.nextInt(256), num.nextInt(256), num.nextInt(256));
		g2.setColor(c);
		g2.fill(box);
		
		g2.draw(box);
		c = new Color(num.nextInt(256), num.nextInt(256), num.nextInt(256));
		Ellipse2D.Double circ = new Ellipse2D.Double(0,0,100,100);
		g2.setColor(c);
		g2.fill(circ);
		g2.draw(circ);
	}
}
