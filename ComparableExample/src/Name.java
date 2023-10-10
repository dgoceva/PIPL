import java.util.Objects;

public class Name implements Comparable<Name> {

	private String firstName;
	
	@Override
	public String toString() {
		return firstName;
	}

	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Name(String firstName) {
		super();
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName);
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
		return Objects.equals(firstName, other.firstName);
	}

	@Override
	public int compareTo(Name o) {
		// TODO Auto-generated method stub
		return firstName.compareTo(o.getFirstName());
	}

}
