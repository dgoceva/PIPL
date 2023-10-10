
public class Bank {
	protected int account;
	private String name;
	private double sum;
	
	private static double percent=2; 
	
	static {
		percent = 1.5;
	}
//	public static Bank(double data) {
//		percent = data;
//	}
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	
	public Bank(int account,String name,double suma) {
		sum = suma;
		this.account = account;
		this.name = name;
	}

	public Bank(int account, String name) {
		this(account,name,0);
	}
	
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSum() {
		return sum;
	}

	public static double getPercent() {
		return percent;
	}

	public static void setPercent(double percent) {
		Bank.percent = percent;
	}
	
	@Override
	public String toString() {
		return "Bank [percent="+percent+" account=" + account + ", name=" + name + ", sum=" + sum + "]";
	}
	
	public void deposit(double sum) {
		this.sum += sum;
	}
	
	public void withdraw(double sum) {
		if (this.sum>=sum) {
			this.sum -= sum;
		}
	}
	public void updateSum() {
		sum += sum*percent;
	}
}
