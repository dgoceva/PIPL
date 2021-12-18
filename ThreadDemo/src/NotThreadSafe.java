
public class NotThreadSafe {
	StringBuilder builder = new StringBuilder();
	
	public void add(String text) {
		if (builder.isEmpty()) {
			builder.append(text);
		}
	}

	@Override
	public String toString() {
		return "NotThreadSafe [builder=" + builder + "]";
	}
	
}
