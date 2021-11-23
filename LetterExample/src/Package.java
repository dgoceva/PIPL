
public class Package extends Letter {
	private double weight;

	public Package() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Package(String senderName, String senderAddress, String receiverName, String receiverAddress,
			int letterNumber, double weigth) {
		super(senderName, senderAddress, receiverName, receiverAddress, letterNumber);
		// TODO Auto-generated constructor stub
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public void forSend() {
		super.forSend();
		System.out.println("Weight: "+weight);
	}
	
	@Override
	public void toReturn() {
		super.toReturn();
		System.out.println("Weight: "+weight);		
	}
}
