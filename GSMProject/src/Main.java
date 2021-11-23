import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GSMClass gsm = new GSMClass();
		GSMClass[] gsms = new GSMClass[5];
		for (int i=0;i<gsms.length;++i) {
			gsms[i] = new GSMClass();
			gsms[i].read();
		}
//		print(gsms);
		GSMStore store = new GSMStore(gsms);
		store.print();
//		List<GSMClass> range = getPriceRange(gsms, 100, 1000);
//		print(range.toArray());
	}
	
	private static GSMClass input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Brand: ");
		String brand = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Year: ");
		int year = sc.nextInt();
		return new GSMClass(brand,price,year);
	}
	
	private static void print(Object[] gsms) {
		System.out.println(Arrays.toString(gsms));
	}
	
	public static List<GSMClass> getPriceRange(GSMClass[] all, double x, double y){
		ArrayList<GSMClass> gsms = new ArrayList<GSMClass>();
		
		for(GSMClass gsm : all) {
			if (gsm.getPrice()>=x && gsm.getPrice()<=y) {
				gsms.add(gsm);
			}
		}
//		gsms.remove(2);
		return gsms;
	}
}
