// $final$ -- makes a variable constant -> unchangeable
// Once a $final$ variable is assigned, it cannot be reassigned!
// Often used in conjunction with $static$ -- see Math.PI

public class final0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int k = 100;
		
		System.out.println(k);
		
//		  k = 200; // this line will cause problems!
	}

}
