import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.*;

public class FindDemo {
    public static void main() {
        Pattern pattern;
        Matcher matcher;
        List<Integer> startIdxs = new ArrayList<Integer>();
        List<Integer> endIdxs = new ArrayList<Integer>();
        String text = "I love you so much! However, I cannot marry you because you are not a human!";
        String searchString = "not";
        pattern = Pattern.compile(searchString, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
            startIdxs.add(matcher.start());
            endIdxs.add(matcher.end());
        }
        System.out.println(text);
        System.out.println("The word \""+searchString+"\" was found: " + count + " times");
        System.out.println("Starting pos: "+startIdxs);
        System.out.println("Ending pos: "+endIdxs);
        
    }
}
