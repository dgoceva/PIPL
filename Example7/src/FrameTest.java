import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame{

 	private static final long serialVersionUID = 1L;

	public MyFrame(){
	setTitle("MyFrame");
	setSize(200,200);        // size in pixels, must set: defaults to 0,0
	// Magic to get program to quit on Frame window close
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MyPanel extends JPanel{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

// Constructor
   MyPanel(){
       // add Mouse Listener to catch mouse events from MyPanel
       addMouseListener(new MouseHandler());
    }

    public void paintComponent(Graphics g){
	super.paintComponent(g);

	//	    System.out.println("paintComponent");
	g.drawString("Hello World",50,50);

    }

}
 class MouseHandler extends MouseAdapter{
	
	// call on  mouse button down
	public void mousePressed(MouseEvent ev){
	    int x = ev.getX();
	    int y = ev.getY();
	    System.out.println("Pressed at " + x + "," + y);
	}

	// call on  mouse click (mouse down, mouse up)
	public void mouseClicked(MouseEvent ev){
	    int x = ev.getX();
	    int y = ev.getY();
	    System.out.println("Clicked at " + x + "," + y);
	}

    }

public class FrameTest {
	// OK let's have our main() create a frame.
    public static void FrameTestMain(){
        // Initialize application

        // Initialize GUI
	MyFrame myframe = new MyFrame();
	MyPanel mypanel = new MyPanel();
	// Random stuff we just have to do (the book explains, kind of)
	Container contentPane = myframe.getContentPane();
	// add panel
	contentPane.add(mypanel);
	// Enter event loop
	myframe.setVisible(true);
    }

}
