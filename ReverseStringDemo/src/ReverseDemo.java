import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse1();
		reverse2();
		reverse3();
		reverse4();
		reverse5();
		reverse6();
		reverse7();
	}

	// java program to reverse a word
	public static void reverse1() {
		String str = "Geeks", nstr = "";
		char ch;

		System.out.print("Original word: ");
		System.out.println("Geeks"); // Example word

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i); // extracts each character
			nstr = ch + nstr; // adds each character in front of the existing string
		}
		System.out.println("Reversed word: " + nstr);
	}

	// Java program to ReverseString using ByteArray.
	public static void reverse2() {
		String input = "GeeksforGeeks";

		// getBytes() method to convert string
		// into bytes[].
		byte[] strAsByteArray = input.getBytes();

		byte[] result = new byte[strAsByteArray.length];

		// Store result in reverse order into the
		// result byte[]
		for (int i = 0; i < strAsByteArray.length; i++)
			result[i] = strAsByteArray[strAsByteArray.length - i - 1];

		System.out.println(new String(result));
	}

	// Java program to ReverseString using StringBuilder
	public static void reverse3() {
		String input = "Geeks for Geeks";

		StringBuilder input1 = new StringBuilder();

		// append a string into StringBuilder input1
		input1.append(input);

		// reverse StringBuilder input1
		input1.reverse();

		// print reversed String
		System.out.println(input1);
	}

	// Java program to Reverse a String by
	// converting string to characters one
	// by one
	public static void reverse4() {
		String input = "GeeksForGeeks";

		// convert String to character array
		// by using toCharArray
		char[] try1 = input.toCharArray();

		for (int i = try1.length - 1; i >= 0; i--)
			System.out.print(try1[i]);
	}

	// Java program to Reverse a String using swapping
	// of variables
	public static void reverse5() {
		String input = "Geeks For Geeks";
		char[] temparray = input.toCharArray();
		int left, right = 0;
		right = temparray.length - 1;

		for (left = 0; left < right; left++, right--) {
			// Swap values of left and right
			char temp = temparray[left];
			temparray[left] = temparray[right];
			temparray[right] = temp;
		}

		for (char c : temparray)
			System.out.print(c);
		System.out.println();
	}

	// Java program to Reverse a String using ListIterator
	public static void reverse6() {
		String input = "Geeks For Geeks";
		char[] hello = input.toCharArray();
		List<Character> trial1 = new ArrayList<>();

		for (char c : hello)
			trial1.add(c);

		Collections.reverse(trial1);
		ListIterator li = trial1.listIterator();
		while (li.hasNext())
			System.out.print(li.next());
		System.out.println();

		for(char ch : trial1) {
			System.out.print(ch);
		}
		System.out.println();
		
		for(int i=0;i<trial1.size();++i) {
//			System.out.print(trial1[i]);
			System.out.print(trial1.get(i));
		}
		System.out.println();
		
		Object[] trial2 = trial1.toArray();
		for(int i=0;i<trial2.length;++i) {
			System.out.print((char)trial2[i]);
		}
		System.out.println();
	}

	// Java program to demonstrate conversion from
	// String to StringBuffer and reverse of string
	public static void reverse7() {
		String str = "Geeks";

		// conversion from String object to StringBuffer
		StringBuffer sbr = new StringBuffer(str);
		// To reverse the string
		sbr.reverse();
		System.out.println(sbr);
	}
}
