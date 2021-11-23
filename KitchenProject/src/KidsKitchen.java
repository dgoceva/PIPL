import java.util.HashMap;
import java.util.Map;

public class KidsKitchen {
	private Map<Kid,Kitchen> kids = new HashMap<Kid,Kitchen>();
	
	public KidsKitchen() {
		// TODO Auto-generated constructor stub
	}

	public KidsKitchen(Map<Kid, Kitchen> kids) {
		super();
		this.kids = kids;
	}

	public void add(Kid kid, Kitchen kitchen) throws KidExistsException {
		Kitchen temp = kids.get(kid);
		if (temp != null) {
			throw new KidExistsException("Kid already is in kitchen "+kitchen);
		} else {
			kids.put(kid, kitchen);
		}
	}
}
