import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
	private static List<Letter> data = null;
	
	static {
		data = new ArrayList<>();
	}
	
	public static void add(Letter letter) throws AddLetterException{
		if (contains(letter.getNumber())) {
			throw new AddLetterException("Duplicate data");
		}else {
			data.add(letter);
		}
		
	}
	
	public static Letter getData() {
		if (data.isEmpty())
			return null;
		Letter ret = data.get(0);
		data.remove(0);
		return ret;
	}
	
	public static boolean contains(int number) {
		for(Letter l : data) {
			if (number==l.getNumber())
				return true;
		}
		return false;
	}
	public Dispatcher() {
		// TODO Auto-generated constructor stub
	}

}
