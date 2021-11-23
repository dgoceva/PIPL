
public class Letter implements AutoCloseable{
	private String senderName;
	private String senderAddress;
	private String receiverName;
	private String receiverAddress;
	private int letterNumber;
	
	public Letter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSenderName() {
		return senderName;
	}
	public String getSenderAddress() {
		return senderAddress;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public String getReceiverAddress() {
		return receiverAddress;
	}
	public int getLetterNumber() {
		return letterNumber;
	}
	public Letter(String senderName, String senderAddress, String receiverName, String receiverAddress,
			int letterNumber) {
		super();
		this.senderName = senderName;
		this.senderAddress = senderAddress;
		this.receiverName = receiverName;
		this.receiverAddress = receiverAddress;
		this.letterNumber = letterNumber;
	}
	
	public void toReturn() {
		System.out.println("Sender: "+senderName+", Address: "+senderAddress);
	}
	public void forSend() {
		System.out.println("Receiver: "+receiverName+", Address: "+receiverAddress);
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
