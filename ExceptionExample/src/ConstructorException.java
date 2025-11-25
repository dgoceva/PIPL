
public class ConstructorException {

	int data = 34;
	
	public static void main() {
		ConstructorException obj = new ConstructorException();
		System.out.println(obj);
		System.out.println(obj.data);
	}

	public ConstructorException() {
		super();
		try {
			data = 54/0;
		} catch(ArithmeticException e) {
			System.out.println(e);
//			throw new ArithmeticException();
		}
	}

}
