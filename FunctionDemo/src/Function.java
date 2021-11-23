
public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3^2="+square(3));
		System.out.println("3.2^2="+square((float)3.2));
		System.out.println("3.2^2="+square(3.2));
	}
	public static int square(int a){
		System.out.println("In square(int)");
		return a*a;
	}
	public static float square(float a){
		return a*a;
	}
	public static double square(double a){
		return a*a;
	}
}
