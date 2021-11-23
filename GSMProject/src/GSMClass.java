import java.util.Scanner;

public class GSMClass {
	private String brand;
	private double price;
	private int year;
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public GSMClass() {
		this("",0,2000);
	}

	public GSMClass(String brand, double price, int year) {
//		super();
		this.brand = brand;
		this.price = price;
		this.year = year;
	}

//	@Override
	public String toString() {
		return "GSMClass [brand=" + brand + ", price=" + price + ", year=" + year + "]";
	}
	
	public static GSMClass input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Brand: ");
		String brand = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Year: ");
		int year = sc.nextInt();
		return new GSMClass(brand,price,year);
	}
	
	public void read() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Brand: ");
		brand = sc.next();
		System.out.print("Price: ");
		price = sc.nextDouble();
		System.out.print("Year: ");
		year = sc.nextInt();
	}
}
