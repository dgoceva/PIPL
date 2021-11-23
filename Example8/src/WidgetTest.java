import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MyFrame() {
		setTitle("MyFrame");
		setSize(200, 200); // size in pixels, must set: defaults to 0,0
		// Magic to get program to quit on Frame window close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MyPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Color current = Color.red;

	// Constructor
	MyPanel() {
		JButton toggle = new JButton("Toggle");
		JButton greenColor = new JButton("Green Color");
		ActionListener buttonEvent = new ButtonHandler();
		toggle.addActionListener(buttonEvent);
		greenColor.addActionListener(buttonEvent);
		add(toggle);
		add(greenColor);
	}

	class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
			if (e.getActionCommand() == "Toggle") {
				if (current.equals(Color.red))
					current = Color.blue;
				else
					current = Color.red;
			} else {
				current = Color.green;
			}
			repaint();
		}

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(current);
		g.drawString("Hello World", 50, 50);
	}

}

public class WidgetTest {
	// OK let's have our main() create a frame.
	public static void WidgetTestMain() {
		// Initialize application

		// Initialize GUI
		MyFrame myframe = new MyFrame();
		MyPanel mypanel = new MyPanel();
		// Random stuff we just have to do (the book explains, kind of)
		Container contentPane = myframe.getContentPane();
		// add panel
		contentPane.add(mypanel);
		// add button to panel
		myframe.setVisible(true);
	}

}
