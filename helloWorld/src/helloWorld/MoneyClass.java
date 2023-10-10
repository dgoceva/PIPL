package helloWorld;

import java.util.Scanner;

public class MoneyClass {
	public static final double PERCENT = 0.02;

	private double money;
	
	public MoneyClass() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input money: ");
		money = sc.nextDouble();
		sc.close();
		calculate();
	}
	
	public void print() {
		System.out.println("New amount: "+money);
	}
	
	private void calculate() {
		money*=(1+PERCENT);
	}
}
