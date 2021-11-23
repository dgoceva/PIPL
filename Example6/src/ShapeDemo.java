import java.awt.Container;
import java.awt.*;
import java.awt.geom.*;

import javax.swing.JPanel;

class MyNewPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		final BasicStroke stroke = new BasicStroke(2.0f);
		final float dash1[] = { 10.0f };
		final BasicStroke dashed = new BasicStroke(1.0f, BasicStroke.CAP_BUTT,
				BasicStroke.JOIN_MITER, 10.0f, dash1, 0.0f);
		final BasicStroke wideStroke = new BasicStroke(8.0f);

		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		// draw Line2D.Double
		g2.draw(new Line2D.Double(10, 10, 100, 20));

		// create new QuadCurve2D.Float
		QuadCurve2D q = new QuadCurve2D.Float();
		// draw QuadCurve2D.Float with set coordinates
		q.setCurve(50, 30, 70, 70, 90, 50);
		g2.setStroke(stroke);
		g2.setPaint(Color.blue);
		g2.draw(q);

		// create new CubicCurve2D.Double
		CubicCurve2D c = new CubicCurve2D.Double();
		// draw CubicCurve2D.Double with set coordinates
		c.setCurve(70, 70, 30, 10, 50, 80, 120, 90);
		g2.setPaint(Color.cyan);
		g2.draw(c);

		// draw Rectangle2D.Double
		g2.setPaint(Color.green);
		g2.draw(new Rectangle2D.Double(130, 20, 40, 100));

		// draw RoundRectangle2D.Double
		g2.setStroke(dashed);
		g2.setPaint(Color.magenta);
		g2.draw(new RoundRectangle2D.Double(60, 120, 50, 30, 10, 10));

		// draw Arc2D.Double
		g2.setStroke(wideStroke);
		g2.setPaint(Color.red);
		g2.draw(new Arc2D.Double(30, 100, 70, 40, 90, 135, Arc2D.OPEN));

		// draw Ellipse2D.Double
		g2.setStroke(stroke);
		g2.setColor(Color.darkGray);
		g2.draw(new Ellipse2D.Double(140, 140, 50, 30));
		// fill Ellipse2D.Double
		GradientPaint redtowhite = new GradientPaint(140,140,Color.RED,190, 140,Color.WHITE);
		g2.setPaint(redtowhite);
		g2.fill(new Ellipse2D.Double(140, 140, 50, 30));
	}

}

public class ShapeDemo {
	// OK let's have our main() create a frame.
	public static void ShapeDemoMain() {
		// Create new frame
		MyFrame myframe = new MyFrame();
		MyNewPanel mypanel = new MyNewPanel();
		// Random stuff we just have to do (the book explains, kind of)
		Container contentPane = myframe.getContentPane();
		// add panel
		contentPane.add(mypanel);
		// Show frame
		myframe.setVisible(true);
	}

}
