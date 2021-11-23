import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyMenuPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Color current = Color.red;
	private String msg = "Hello World";

	// button variables now instace vars.
    //  May as well init here.
    JTextField text = new JTextField(10);
    // Menu items created by menu.add(), still need to keep them for handler
    JMenuItem toggle;
    JMenuItem green;

	// Constructor
	MyMenuPanel(JFrame myframe) {
		// Need to add menu stuff and add to frame (not panel)
		JMenuBar mb = new JMenuBar();
		myframe.setJMenuBar(mb);
		// create menu and add to menuber
		JMenu cmenu = new JMenu("Colors");
		// Note: book is in error here, calls non-existant addMenu()
		mb.add(cmenu);
		// add() method on menu creates and adds menu items
		toggle = cmenu.add("Toggle");
		// add a horiz line to look cool
		cmenu.addSeparator();
		green = cmenu.add("Green");
		// make one instance of listener and add to all
		//  works exactly the same as for buttons
		ButtonHandler b = new ButtonHandler();
		toggle.addActionListener(b);
		green.addActionListener(b);
		text.addActionListener(b);

		// add text field
		add(text);
	}

	class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		    // check source, if green button, set color
		    if(e.getSource() == green){
			current = Color.green;
		    }
		    else if(e.getSource() == text){
			String s = text.getText();
			if(s != null) msg = s; // install as new msg
			repaint();
		    }
		    else{ // do toggle stuff
			if(current.equals(Color.red))
			    current = Color.blue;
			else
			    current = Color.red;
		    }
		    repaint();
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(current);
		g.drawString(msg, 50, 50);
	}
}

public class MenuTest {
	// OK let's have our main() create a frame.
	public static void MenuTestMain() {
		// Initialize application

		// Initialize GUI
		MyFrame myframe = new MyFrame();
		MyMenuPanel mypanel = new MyMenuPanel(myframe);
		// Random stuff we just have to do (the book explains, kind of)
		Container contentPane = myframe.getContentPane();
		// add panel
		contentPane.add(mypanel);
		// add button to panel
		myframe.setVisible(true);
	}

}