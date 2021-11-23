// more pass by reference
// what happens if you make an alias?

class Data3 {
	int k;
}

class Test3 {
	void change(Data3 x, Data3 y) {
		y = x;
		System.out.println("Before change (x): "+x.k);
		System.out.println("Before change (y): "+y.k);
		y.k++;
		System.out.println("After change (x): "+x.k);		
		System.out.println("After change (y): "+y.k);		
	}
}

public class pass3 { 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t = new Test3();
		Data3 d1 = new Data3();
		Data3 d2 = new Data3();
		
		d1.k = 1;
		d2.k = 3;
		
		System.out.println("Before passing (x): "+d1.k);
		System.out.println("Before passing (y): "+d2.k);
		
		t.change(d1,d2);
		
		System.out.println("After passing (x): "+d1.k);		
		System.out.println("After passing (y): "+d2.k);		
	}
}


//		  Example pass3
//														Test3 Class
//										+----------------------------+
//										|  +------------+			 |
//										|  | change(x,y)|			 |
//										|  | +--------+ |			 |
//									+---+->| |  +--+  | |			 |
//		+----------------+          |   |  | | x|*-+--+-+---+		 |  
//		|    main(args)  |          |   |  | |  +--+  | |	|		 |
//		| +------------+ |          |   |  | |	+--+  | |	|		 |	
//		| |    +---+   | |      	|	|  | | y|**+--+-+---+--------+-----------+ 
//		| |  t | *-+---+-+----------+   |  | |  ++-+  | |  	|		 |			 |
//		| |    +---+   | |				|  | +---+----+ |	|		 |			 |
//		| |		 	   | |				|  +-----+------+  	|		 |			 |
//		| |    +---+   | |				+--------+----------+--------+			 |
//		| |  d1| *-+---+-+------+				 |			|					 |
//		| |    +---+   | |	    |				 |			|					 |
//		| |			   | |		|				 |			|					 |
//		| |    +---+   | |		|		         |			|					 |
//		| |  d2| *-+---+-+------+--+			 |  		|					 X
//		| |    +---+   | |	    |  |			 +---+	+---+					 |
//		| |			   | |		|  |				 |	|						 |
//		| |    +---+   | |		|  |				 |	|	Data3 Class			 |
//		| |args| *-+---+-+-->	|  |		+--------+--+--------------------+   |
//		| |    +---+   | |	   	|  |		|  +-----V--V--+	+---------+	 |   |
//		| +------------+ |     	|  |		|  |  +------+ |	|  +----+ |	 |   |
//		+----------------+		+--+--------+->| k|0 1 2 | |	| k| 0 3| |<-+---+
//			Main class			   |		|  |  +------+ |	|  +----+ |	 |
//								   |		|  +-----------|	+---------+	 |
//								   |		|  						 ^		 |
//								   |		+------------------------+-------+
//								   +---------------------------------+				