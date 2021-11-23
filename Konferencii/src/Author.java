
public class Author extends Human {
	private int paperCount;
	
	public int getCount() {
		return paperCount;
	}
	public void setCount(int count) {
		paperCount = count;
	}
	public Author(String Name, String Address, String Tel, int count) {
	super(Name, Address, Tel);
		// TODO Auto-generated constructor stub
		paperCount = count;
	}
	@Override
	public String toString() {
		return "Author [paperCount=" + paperCount + "]";
	}

}
