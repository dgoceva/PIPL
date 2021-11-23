import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

class MyNewPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Handler for Mouse presses and clicks
	// Extends MouseAdapator
	// (which implements MouseListener with empty methods)
	// We use an inner class so we can access to data on JPanel
	Color current = Color.red;

	class MouseHandler extends MouseAdapter {

		// call on mouse button down
		public void mousePressed(MouseEvent ev) {
			int x = ev.getX();
			int y = ev.getY();
			System.out.println("Pressed at " + x + "," + y);
		}

		public void mouseClicked(MouseEvent ev) {
			int x = ev.getX();
			int y = ev.getY();
			System.out.println("Clicked at " + x + "," + y);
			// access instance vars in MyPanel instance that created us.
			// Can also use keyword 'outer' analogously to 'this' and 'super'
			// to refer to enclosing class (in this case an instance of MyPanel)
			if (current.equals(Color.red))
				current = Color.blue; // if red switch to blue
			else
				current = Color.red; // else to red
			repaint();
		}

	}

	MyNewPanel() {
		addMouseListener(new MouseHandler());
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// System.out.println("paintComponent");
		g.setColor(current);
		g.drawString("Hello World", 50, 50);
	}

}

public class InnerFrameTest {
	// OK let's have our main() create a frame.
    public static void InnerFrameTestMain(){
        // Initialize application

        // Initialize GUI
	MyFrame myframe = new MyFrame();
	MyNewPanel mypanel = new MyNewPanel();
	// Random stuff we just have to do (the book explains, kind of)
	Container contentPane = myframe.getContentPane();
	// add panel
	contentPane.add(mypanel);
	// Enter event loop
	myframe.setVisible(true);
    }

}
