import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (ReadFile file = new ReadFile(
				"C:\\Samples\\PIPL\\RegExDemo\\src\\PatternsDemo.txt")) {
			matches(file);
			System.out.println();
			compile(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	private static void matches(ReadFile file) {
		String pattern = ".*EXample.*";
		boolean find = false;
		for (String line : file.getText()) {
			if (Pattern.matches(pattern, line)) {
				System.out.println(line);
				find = true;
			}
		}
		if (!find) {
			System.out.println("No such pattern...");
		}
	}
	private static void compile(ReadFile file) {
		Pattern pattern = Pattern.compile(".*EXample.*", Pattern.CASE_INSENSITIVE);
		int count = 0;
		for (String line : file.getText()) {
			Matcher matcher = pattern.matcher(line);
			if (matcher.matches()) {
				System.out.println(line);
				count++;
			}
		}
		System.out.println("The pattern is found "+count+" times");
	}

}
