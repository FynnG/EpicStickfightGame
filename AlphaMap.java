package maps;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Stickfight;

public class AlphaMap extends JPanel{

	private static final long serialVersionUID = 1L;

	public AlphaMap(JPanel contentPane) {
		this.setBounds(0, 0, 1920, 1080);
		contentPane.add(this);
		this.setLayout(null);
		
		JLabel lblAlphaMapPicture = new JLabel("");
		lblAlphaMapPicture.setIcon(new ImageIcon(Stickfight.class.getResource("/maps/AlphaMap.jpg")));
		lblAlphaMapPicture.setBounds(0, 0, 1920, 1080);
		this.add(lblAlphaMapPicture);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		Line2D.Float floor = new Line2D.Float(100, 800, 1820, 800);
		g2d.draw(floor);
	}
}