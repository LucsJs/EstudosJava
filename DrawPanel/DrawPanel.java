import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();

		int distX = width/30;
		int distY = height/30;
		int cont;
		
		int x1 = 0, y1;
		int x2, y2 = height;
		x2 = 0;
		y1 = 0;
		cont = 1;
		while (cont++ <= 30) {
			g.drawLine(0, y1, x2, height);
			y1 += distY;
			x2 += distX;

		}
		
		x2 = height;
		y1 = 0;
		cont = 1;
		while (cont++ <= 30) {
			g.drawLine(width, y1, x2, height);
			y1 += distY;
			x2 -= distX;		
	
		}

		y1 = height;
		cont = 1;

	}
}