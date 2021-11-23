import java.util.ArrayList;

public class Dispatcher {
	private static ArrayList<Letter> letters;

	static {
		letters = new ArrayList<>();
	}

	public Dispatcher() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static boolean hasLetter(int letterNumber) {
		for(Letter letter:letters) {
			if (letter.getLetterNumber()==letterNumber) {
				return true;
			}
		}
		return false;
	}
	
	public static void add(Letter letter) throws AddLetterException {
		if (hasLetter(letter.getLetterNumber())) {
			throw new AddLetterException("THis letter already exists");
		}
		letters.add(letter);
	}

	public static Letter get() {
		try {
			Letter temp = letters.get(0);
			letters.remove(0);
			return temp;
		} catch (IndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.err.println("No letters");
		}
		return null;
	}

}
