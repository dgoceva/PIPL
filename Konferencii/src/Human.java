
public class Human {
	protected String Name;
	protected String Address;
	protected String Tel;
	
//	public String getName() {
//		return Name;
//	}
//	public void setName(String value) {
//		Name = value;
//	}
//	public String getAddress() {
//		return Address;
//	}
//	public void setAddress(String value) {
//		Address = value;
//	}
//	public String getTel() {
//		return Tel;
//	}
//	public void setTel(String value) {
//		Tel = value;
//	}
	
	public Human(String Name,String Address, String Tel) {
		this.Name = Name;
		this.Address = Address;
		this.Tel = Tel;
	}

	@Override
	public String toString() {
		return "Human [Name=" + Name + ", Address=" + Address + ", Tel=" + Tel
				+ "]";
	}
	
}
