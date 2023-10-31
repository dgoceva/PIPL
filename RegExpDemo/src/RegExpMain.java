import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpMain {

	public RegExpMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Pattern email = Pattern.compile("^(\\S+)@(\\S+)\\.(\\S{2,3})$");
		String str;
		Matcher match;
		do {
			System.out.println("Input email: ");
			str = sc.nextLine();
			if (!str.isEmpty()) {
				match = email.matcher(str);
				System.out.println(match.matches());
			}
		} while(!str.isEmpty());
	}

}
