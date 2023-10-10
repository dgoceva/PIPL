
public class Letter {

	private String senderName;
	private String senderAddress;
	private String receiverName;
	private String receiverAddress;
	private int number;
	
	public Letter() {
		// TODO Auto-generated constructor stub
	}
	
	public Letter(int number, String senderName, 
			String senderAddress, String receiverName,
			String receiverAddress) {
		this.number = number;
		this.senderName = senderName;
		this.senderAddress = senderAddress;
		this.receiverName = receiverName;
		this.receiverAddress = receiverAddress;
	}
	
	public int getNumber() {
		return number;
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

	public void forSend() {
		System.out.print("Receiver Name: "+receiverName+
				", Receiver Address: "+receiverAddress);
	}
	public void toReturn() {
		System.out.print("Sender Name: "+senderName+
				", Sender Address: "+senderAddress);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Letter other = (Letter) obj;
		if (number != other.number)
			return false;
		return true;
	}
	
}
