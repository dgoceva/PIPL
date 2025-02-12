
// pass by reference
// How do you "pass an object"? Technically, by value, but what you're
// really passing the reference value, which is the address of the
// object. A call to the method stores the address of the object in
// the formal parameter of the method.

class Data1 {
	int k;
}

class Test1 {
	void change(Data1 x) {
		System.out.println("Before changing: "+x.k);
		x.k++;
		System.out.println("After changing: "+x.k);		
	}
}

public class pass1 { 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		Data1 d = new Data1();
		d.k = 1;
		System.out.println("Before passing: "+d.k);
		t.change(d);
		System.out.println("After passing: "+d.k);		
	}
}


//		  Example pass1
//														Test1 Class
//		+----------------+              +----------------------------+  
//		|    main(args)  |              |  +------------+			 |
//		| +------------+ |              |  | change(x)  |			 |
//		| |    +---+   | |      		|  | +--------+ |			 |
//		| |  t | *-+---+-+--------------+->| |  +---+ | |			 |
//		| |    +---+   | |				|  | | x|   | | |			 |
//		| |		 	   | |				|  | |  +---+ | |			 |
//		| |    +---+   | |				|  | +--------+ |			 |
//		| |  d | *-+---+-+------+		|  +------------+  			 |
//		| |    +---+   | |	    |		+----------------------------+
//		| |			   | |		|
//		| |    +---+   | |		|						Data1 Class
//		| |args| *-+---+-+-->	|		+----------------------------+
//		| |    +---+   | |	   	|		|	+------------+			 |
//		| +------------+ |     	|		|   |  +------+	 |			 |
//		+----------------+		+-------+-> | k| 0 1 2|  |			 |
//			Main class					|	|  +------+	 |			 |
//										|	+------------+			 |
//										+----------------------------+
