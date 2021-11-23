import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyNewPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Color current = Color.red;
	private String msg = "Hello World";

	// button variables now instace vars.
	// May as well init here.
	JButton toggle = new JButton("Toggle");
	JButton green = new JButton("Green");
	JTextField text = new JTextField(10);

	// Constructor
	MyNewPanel() {
		ButtonHandler b = new ButtonHandler();
		toggle.addActionListener(b);
		green.addActionListener(b);
		text.addActionListener(b);
		// add buttons (and text field)
		add(toggle);
		add(green);
		add(text);
	}

	class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// check source, if green button, set color
			if (e.getSource() == green) {
				current = Color.green;
			} else if (e.getSource() == text) {
				String s = text.getText();
				if (s != null)
					msg = s; // install as new msg
				repaint();
			} else { // do toggle stuff
				if (current.equals(Color.red))
					current = Color.blue;
				else
					current = Color.red;
			}
			repaint();
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		text.setForeground(current);
		text.setText(msg);
	}
}

public class TextTest {
	// OK let's have our main() create a frame.
	public static void TextTestMain() {
		// Initialize application

		// Initialize GUI
		MyFrame myframe = new MyFrame();
		MyNewPanel mypanel = new MyNewPanel();
		// Random stuff we just have to do (the book explains, kind of)
		Container contentPane = myframe.getContentPane();
		// add panel
		contentPane.add(mypanel);
		// add button to panel
		myframe.setVisible(true);
	}

}