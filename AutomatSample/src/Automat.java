
public abstract class Automat {

	private int id;
	private String address;
	private String owner;
	
	public Automat(int id, String address, String owner) {
		super();
		this.id = id;
		this.address = address;
		this.owner = owner;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Automat() {
		// TODO Auto-generated constructor stub
	}

	abstract boolean isWorking();
}
