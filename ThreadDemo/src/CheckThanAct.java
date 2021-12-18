import java.util.Map;

public class CheckThanAct {
	public void checkThanAct(Map<String, String> sharedMap) {
		if (sharedMap.containsKey("key")) {
			String value = sharedMap.remove("key");
			if (value == null) {
				System.out.println("Value for 'key' was null");
			}
		} else {
			sharedMap.put("key", "value");
		}
	}
}
