package launcher;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class DesignBar extends JPanel {

	private static final long serialVersionUID = 1L;
	public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2D = (Graphics2D) g;
	g.setColor(Color.black);
	g.fillRect(0, 0, 800, 2);
	g.setColor(new Color(0, 0, 0, 200));
	Rectangle2D.Float rectangle = new Rectangle2D.Float(0, 0, 800, 100);
	setOpaque(false);
	g2D.fill(rectangle);
	}
}