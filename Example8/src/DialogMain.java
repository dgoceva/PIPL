import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

class MyDlgPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// button variables now instace vars.
	// May as well init here.
	JButton toggle = new JButton("Toggle");

	// Constructor
	MyDlgPanel() {
		ButtonHandler b = new ButtonHandler();
		toggle.addActionListener(b);
		// add buttons (and text field)
		add(toggle);
	}

	class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// check source, if green button, set color
			DialogTest dlg = new DialogTest(null);
			dlg.setVisible(true);
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
}

public class DialogMain {
	public static void DialogTestMain() {
		MyDlgPanel mypanel = new MyDlgPanel();
		MyFrame myframe = new MyFrame();
		Container contentPane = myframe.getContentPane();
		contentPane.add(mypanel);
		myframe.setVisible(true);
	}

}
