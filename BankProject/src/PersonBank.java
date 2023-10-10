
public class PersonBank extends Bank {

	private long egn;
	
	public PersonBank() {
		// TODO Auto-generated constructor stub
	}

	public PersonBank(int account, String name, double suma, long egn) {
		super(account, name, suma);
		// TODO Auto-generated constructor stub
		this.egn = egn;
	}

	public PersonBank(int account, String name,long egn) {
		this(account, name, 0, egn);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "["+account+","+getName()+","+getSum()+","+egn+"]";
	}
}
