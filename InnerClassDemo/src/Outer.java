
public class Outer {

	private int num=3;
	
	public class Inner {
		public int data(){
			return num;
		}
	}
	public Outer() {
		// TODO Auto-generated constructor stub
	}

}

class TestOuter1{  
	  static int data=30;  
	  
	  static class Inner{  
	   void msg(){System.out.println("data is "+data);} 
	   static void msg1() {System.out.println("static data: "+data);}  
	  }  
	}  