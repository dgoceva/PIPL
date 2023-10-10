
public class Package extends Letter {

	private double weigth;
	
	public Package() {
		// TODO Auto-generated constructor stub
		weigth = 0;
	}

	public Package(int number, String senderName, 
			String senderAddress, String receiverName, 
			String receiverAddress, double weigth) {
		super(number, senderName, senderAddress, receiverName, receiverAddress);
		// TODO Auto-generated constructor stub
		this.weigth = weigth;
	}
	
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	
	@Override
	public void forSend() {
		super.forSend();
		printWeigth();
	}
	@Override
	public void toReturn() {
		super.toReturn();
		printWeigth();
	}
	private void printWeigth() {
		System.out.println(", Weigth: "+weigth);
	}
}
