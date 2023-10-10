package helloWorld;


public class HelloWorldMain {

			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		main1();
//		main2();
		main3();
	}

	public static void main1() {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
	}
	
	public static void main2() {
		// TODO Auto-generated method stub
		MoneyClass money = new MoneyClass();
		money.print();
	}
	
	public static void main3() {
		// TODO Auto-generated method stub
		ArrayClass arr = new ArrayClass();
		arr.inputArray();
		arr.sumArray();
		arr.print();
		System.out.println(ArrayClass.getMAXLEN());
		System.out.println(arr.getMAXLEN());
		arr.generateArray();
		arr.printArray();
	}

}
