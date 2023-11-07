import java.util.regex.*;

public class FindDemo {
    public static void main() {
        Pattern pattern;
        Matcher matcher;
        String text = "I love you so much! However, I cannot marry you because you are not a human!";
        String searchString = "not";
        pattern = Pattern.compile(searchString, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(text);
        System.out.println("The word \""+searchString+"\" was found: " + count + " times");

    }
}
