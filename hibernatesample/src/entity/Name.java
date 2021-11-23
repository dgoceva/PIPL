package entity;

public class Name {

	private String firstName;
	private String seconName;
	private String lastName;

	public Name(String firstName, String seconName, String lastName) {
		super();
		this.firstName = firstName;
		this.seconName = seconName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((seconName == null) ? 0 : seconName.hashCode());
		return 20;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (seconName == null) {
			if (other.seconName != null)
				return false;
		} else if (!seconName.equals(other.seconName))
			return false;
		return true;
	}

	public String getSeconName() {
		return seconName;
	}

	public void setSeconName(String seconName) {
		this.seconName = seconName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", seconName=" + seconName
				+ ", lastName=" + lastName + "]";
	}

}
