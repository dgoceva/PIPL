import java.util.Scanner;
import java.util.regex.*;

public class LookingAtDemo {
    public static void main() {
        boolean flag;
        Scanner sc = new Scanner(System.in);
        Pattern pattern;
        Matcher matcher;
        do {            
            String namePattern = "David";
            pattern = Pattern.compile(namePattern);
            
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            matcher = pattern.matcher(name);
            
            flag = matcher.lookingAt();
            if (!flag) System.out.println("Invalid Input!");
        } while (!flag);
        System.out.println("Valid input");
    }
}
