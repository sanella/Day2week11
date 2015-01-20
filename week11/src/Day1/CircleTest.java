package Day1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CircleTest extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Circle c = new Circle(g);
		c.drawAt(100, 100);

		RedCircle r = new RedCircle(g);
		r.drawAt(150, 150);

		CrossedCircle cr = new CrossedCircle(g);
		cr.drawAt(200, 200);
	}

	public static void main(String[] args) {
		JFrame window = new JFrame("Prozor");
		CircleTest panel = new CircleTest();
		window.add(panel);
		window.setSize(500, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
