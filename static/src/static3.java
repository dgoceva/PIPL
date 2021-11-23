// which variables can main "see" ?

class Data {
	static int test1 = 1;
	int test2 = 2;
}

// class for main
public class static3 {

	int			test3 = 3;
	final int	test4 = 4;
	static int	test5 = 5;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test6 = 6;
		
		System.out.println(Data.test1); // test1 is static, so main can access
		// System.out.println(test2); // test2 not static, so main can't access
		// System.out.println(test3); // test3 not static, so main can't access
		// System.out.println(test4); // test4 not static, so main can't access
		System.out.println(test5); // test5 is static, so main can access
		System.out.println(test6); // test6 is local, so main can access
		
	}

}
