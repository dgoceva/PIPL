import java.awt.Container;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

class MyTableFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyTableFrame() {
		// set up UI
		setTitle("MyFrame");
		setSize(200, 200); // size in pixels
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// make model
		MyTableModel model = new MyTableModel(31);
		// make table
		JTable table = new JTable(model);
		// Random stuff we just have to do (the book explains, kind of)
		Container contentPane = getContentPane();
		// add panel with scroller
		JScrollPane scroll = new JScrollPane(table);
		contentPane.add(scroll);

	}

}

class MyTableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int rows = 2;
	int cols = 2;
	String[] colnames = { "Day", "Hours" };
	Integer[] hours;

	MyTableModel(int rows) {
		this.rows = rows;
		hours = new Integer[rows];
		Random r = new Random();
		for (int i=0;i<rows;i++)
			hours[i] = r.nextInt(13);
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return cols;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return rows;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		if (arg1==0)
			return arg0+1;
		else
		return hours[arg0];
			
	}
	public String getColumnName(int col) {
		return colnames[col];
	}
}

public class TableTest {

	// OK let's have our main() create a frame.
	public static void TableTestMain() {
		MyTableFrame myframe = new MyTableFrame();
		myframe.setVisible(true);
	}
}
