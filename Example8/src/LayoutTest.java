import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyLayoutFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton blue = new JButton("Blue");
	JButton green = new JButton("Green");
	JButton red = new JButton("Red");
	JButton yellow = new JButton("Yellow");
	JButton black = new JButton("Black");

	public MyLayoutFrame() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
		setTestLayout(4);
		setSize(200, 200);
		setTitle("Layout Test");
		setVisible(true);
	}

	public void setTestLayout(int kind) {
		switch (kind) {
		case 1:
			setLayout(new BorderLayout());
			add(yellow, BorderLayout.SOUTH);
			add(blue, BorderLayout.WEST);
			add(green, BorderLayout.NORTH);
			add(red, BorderLayout.CENTER);
			add(black, BorderLayout.EAST);
			break;
		case 2:
			setLayout(new GridLayout(3, 4));
			add(blue);
			add(green);
			add(red);
			add(yellow);
			add(black);
			break;
		case 3:
			Box b = Box.createVerticalBox();
			b.add(blue);
			b.add(Box.createVerticalGlue());
			b.add(green);
			b.add(Box.createVerticalGlue());
			b.add(red);
			b.add(Box.createVerticalGlue());
			b.add(yellow);
			b.add(Box.createVerticalGlue());
			b.add(black);
			getContentPane().add(b);
			break;
		case 4:
			setLayout(new GridBagLayout());
			GridBagConstraints constraints = new GridBagConstraints();
			constraints.weightx = 100;
			constraints.weighty = 100;
			add(blue, constraints,0,0,1,1);
			add(green, constraints,0,1,1,1);
			add(red, constraints,1,0,1,1);
			add(yellow, constraints,1,1,1,1);
			add(black, constraints,0,2,1,1);
			break;
		default:
			setLayout(new FlowLayout());
			add(blue);
			add(green);
			add(red);
			add(yellow);
			add(black);
			break;
		}
	}
		private void add(Component c, GridBagConstraints constraints,
				 int x, int y, int w, int h)
				 {
				 constraints.gridx = x;
				 constraints.gridy = y;
				 constraints.gridwidth = w;
				 constraints.gridheight = h;
				 getContentPane().add(c, constraints);
				 }
}

public class LayoutTest {
	public static void LayoutTestMain() {
		new MyLayoutFrame();
	}

}
