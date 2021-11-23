package picture;

import java.util.*;

/*
 * Задача 1: Създайте клас „Картина”, в който се описва името на картината, нейният автор, цена, 
 * година на създаване и уникален номер. 
 * Дефинирайте конструктори по подразбиране (данните се четат от клавиатурата) и чрез подадени параметри. 
 * Направете необходимите get и set методи. 
 * Напишете метод, който отпечатва информацията за картината в подходящ вид в конзолата.
 */

public class Picture {
	private String name;
	private String author;
	private float price;
	private short year;
	private static int idGen = 1;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	
	public int getId() {
		return id;
	}
	
	public Picture() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input picture name: ");
		name = sc.next();
		System.out.print("Input picture author: ");
		author = sc.next();
		System.out.print("Input picture price: ");
		price = sc.nextFloat();
		System.out.print("Input picture year: ");
		year = (short)sc.nextInt();
		id  = idGen++;
		sc.close();
	}
	
	public Picture(String name, String author, float price, short year) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Picture [name=" + name + ", author=" + author + ", price="
				+ price + ", year=" + year + ", id=" + id + "]";
	}
	
	public void print() {
		System.out.println(this);
	}
}
