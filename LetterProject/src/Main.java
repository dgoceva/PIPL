import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dispatcher data;
		try {
			Dispatcher.add(new Letter(5,"Ivan","Pleven","Sofia",
					"Varna"));
			Dispatcher.add(readLetter());
			
			
			Letter letter = Dispatcher.getData();
			letter.forSend();
			System.out.println();
			letter.toReturn();
			System.out.println();
		}catch(AddLetterException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	private static Letter readLetter() {
		String sName,sAddress,rName,rAddress;
		int number;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input number: ");
		number = sc.nextInt();
		sc.nextLine();
		System.out.print("Input sender name: ");
		sName = sc.nextLine();
		System.out.print("Input sender address: ");
		sAddress = sc.nextLine();
		System.out.print("Input receiver name: ");
		rName = sc.nextLine();
		System.out.print("Input receiver address: ");
		rAddress = sc.nextLine();
		
		return new Letter(number,sName,sAddress,rName,rAddress);
	}

}
