
public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 7;
		System.out.println(""+x+"!="+fact(x));
	}
	
	public static int fact(int a) {
		if (a <= 1) return 1;
		else return a*fact(a-1);
	}

}
