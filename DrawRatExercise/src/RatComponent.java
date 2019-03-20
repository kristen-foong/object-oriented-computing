
import java.awt.*;
import javax.swing.JComponent;

public class RatComponent extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.WHITE);
		g2.fillRect(0, 0, 500, 500);
		
		Rat r = new Rat(50,50,Color.LIGHT_GRAY);
		Rat r2 = new Rat(200,200,Color.CYAN);
		Rat r3 = new Rat(300,80,Color.RED, 2);
		Rat r4 = new Rat(400,350,Color.GREEN);
		Rat r5 = new Rat (400,20,Color.ORANGE, 0.5);
		r.draw(g2);
		r2.draw(g2);
		r3.draw(g2);
		r4.draw(g2);
		r5.draw(g2);
	}
}
