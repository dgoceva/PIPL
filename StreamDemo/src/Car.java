
public class Car {
	private String brand;
	private double price;
	private int year;
	
	public Car(String brand, double price, int year) {
		super();
		this.brand = brand;
		this.price = price;
		this.year = year;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", year=" + year + "]";
	}
	
	
}
