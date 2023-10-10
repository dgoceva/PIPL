
public class BankMain {

	public BankMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bankObj = new Bank();
		Bank bankObj1 = new Bank(123,"Ivan",2500);
		Bank bankObj2 = new Bank(111,"Петър");
		PersonBank pObj = new PersonBank(444,"Lili",1231231234L);
		System.out.println(bankObj);
		System.out.println(bankObj1);
		System.out.println(bankObj2);
		System.out.println(pObj);
		
//		Bank.setPercent(3);
//		bankObj2.setAccount(333);
//		bankObj2.deposit(100);
//		bankObj1.withdraw(300);
//		System.out.println(bankObj);
//		System.out.println(bankObj1);
//		System.out.println(bankObj2);
	}

}
