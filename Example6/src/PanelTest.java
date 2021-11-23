import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JPanel; 

class MyPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g){
	    super.paintComponent(g);
	    g.drawString("Hello World",50,50);

	}

}

public class PanelTest{

    // OK let's have our main() create a frame.
    public static void PanelTestMain(){
	// Create new frame
	MyFrame myframe = new MyFrame();
	MyPanel mypanel = new MyPanel();
	// Random stuff we just have to do (the book explains, kind of)
	Container contentPane = myframe.getContentPane();
	// add panel
	contentPane.add(mypanel);
	// Show frame
	myframe.setVisible(true);
    }
}
