// Need to import these
import javax.swing.*;

/**
 * Basic code to put up a frame.
 */

class MyFrame extends JFrame{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFrame(){
	setTitle("MyFrame");
	setSize(200,200);        // size in pixels, must set: defaults to 0,0
	// Magic to get program to quit on Frame window close
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

public class FrameTest{

    // OK let's have our main() create a frame.
    public static void FrameTestMain(){
	// Create new frame
	MyFrame myframe = new MyFrame();
	// Show frame
	myframe.setVisible(true);
    }
}

