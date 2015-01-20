package Day1;

import java.awt.Color;
import java.awt.Graphics;

public class RedCircle extends CrossedCircle {

	public RedCircle(Graphics g) {
		super(g);
	}

	
	
	public void drawAt(int x, int y) {
		super.drawAt(x, y);

		Color previusColor = g.getColor();

		g.setColor(Color.RED);
		g.fillOval(x - size / 2, y - size / 2, 50, 50);
		g.setColor(previusColor);

	}

}
