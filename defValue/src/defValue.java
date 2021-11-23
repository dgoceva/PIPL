// This program checks the default values of various variables
// Define a class with lots of variables for posterioty sake

class Lotsavar {
	int num;
	double val;
	String name;
	Lotsavar cls;
}
public class defValue {
	public static void main(String[] args) {
		int n;
		double v;
		boolean a;
		String s;
		String s1=new String();
		
		// These prints will be illegal now since s and n don't point to
		// anything yet. In  a box diagram, this will be represented by
		// '?' rather than null or 0
		
		// System.out.println("Print statement#1 "+ n);
		// System.out.println("Print statement#2 "+ s);
		
		// This print statement is legal but observe what it prints
		
		System.out.println("Print statement#3 "+s1);
		
		// Lotsavar is a class with lot of variables (see above)
		
		Lotsavar obj1,obj2;
		 
		// obj1, obj2 not yet initialized, so you can't do this...
		// System.out.println("Print statement#4 "+obj1.num);
		
		// So initialize them first
		obj1 = new Lotsavar(); obj2 = new Lotsavar();
		
		// Now you can use them. Default values appear
		
		System.out.println("Print statement#5 "+obj1.num);
		System.out.println("Print statement#6 "+obj1.val);
		System.out.println("Print statement#7 "+obj2.val);
		System.out.println("Print statement#8 "+obj1.name);
		System.out.println("Print statement#9 "+obj2.name);
		
		// Now change some instance variables from their default
		
		obj1.num=30;obj1.val=0.33;obj1.name="Whatever";
		
		System.out.println("Print statement#10 "+obj1.num);
		System.out.println("Print statement#11 "+obj1.val);
		System.out.println("Print statement#12 "+obj2.val);
		System.out.println("Print statement#13 "+obj1.name);
		System.out.println("Print statement#14 "+obj2.name);
		
		obj1.cls=obj2;
		
		System.out.println("Print statement#15 "+obj1.cls.num);
		System.out.println("Print statement#16 "+obj1.cls.val);
		System.out.println("Print statement#17 "+obj1.cls.name);
		System.out.println("Print statement#18 "+obj2.name);
		
		// System.out.println("Print statement#19 "+obj2.cls.val);
		// Since obj2.cls is still null, a reference such as above
		// leads to runtime error:
		// Exception in thread "main"java.lang.NullPointerException
		
	}
}
