// more pass by reference

class Data2 {
	int k;
}

class Test2 {
	void change(Data2 x) {
		System.out.println("Before changing formal parameter: "+x.k);
		x = new Data2();
		System.out.println("After changing formal parameter: "+x.k);		
	}
}

public class pass2 { 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t = new Test2();
		Data2 d = new Data2();
		d.k = 1;
		System.out.println("Before passing: "+d.k);
		t.change(d);
		System.out.println("After passing: "+d.k);		
	}
}


//		  Example pass2
//														Test2 Class
//		+----------------+              +----------------------------+  
//		|    main(args)  |              |  +------------+			 |
//		| +------------+ |              |  | change(x)  |			 |
//		| |    +---+   | |      		|  | +--------+ |			 |
//		| |  t | *-+---+-+--------------+->| |  +---+ | |			 |
//		| |    +---+   | |				|  | | x|* *| | |			 |
//		| |		 	   | |				|  | |  ++-++ | |			 |
//		| |    +---+   | |				|  | +---+-+--+ |			 |
//		| |  d | *-+---+-+------+		|  +-----+-+----+  			 |
//		| |    +---+   | |	    |		+--------+-+-----------------+
//		| |			   | |		|				 x +---------------------+
//		| |    +---+   | |		|				 |		Data2 Class		 |
//		| |args| *-+---+-+-->	|		+--------+-------------------+   |
//		| |    +---+   | |	   	|		|  +-----V----+	+--------+	 |   |
//		| +------------+ |     	|		|  |  +-----+ |	|  +---+ |	 |   |
//		+----------------+		+-------+->| k| 0 1 | |	| k| 0 | |<--+---+
//			Main class					|  |  +-----+ |	|  +---+ |	 |
//										|  +----------+	+--------+	 |
//										+----------------------------+
