import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (ReadFile file = new ReadFile(
				"D:\\Lectures\\PIK3\\Demos\\RegExDemo\\src\\PatternsDemo.txt")) {
//			matches(file);
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
		String pattern = ".*Example.*";
		for (String line : file.getText()) {
			if (Pattern.matches(pattern, line))
				System.out.println(line);
		}
	}
	private static void compile(ReadFile file) {
		Pattern pattern = Pattern.compile(".*EXample.*", Pattern.CASE_INSENSITIVE);
		for (String line : file.getText()) {
			Matcher matcher = pattern.matcher(line);
			if (matcher.matches())
				System.out.println(line);
		}		
	}

}
