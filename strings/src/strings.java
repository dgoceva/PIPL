import java.util.Arrays;

public class strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S1 = "hello, \"Java\"";
		char[] c1 = {'h','e','l','l','o'};
		
		// index of char in string
		System.out.println("1: "+S1.indexOf('h'));
		System.out.println("1: "+S1.indexOf('l'));
		System.out.println("2: "+S1.indexOf('x'));
		
		// convert string into char array
		System.out.println("3: "+S1.toCharArray());
		System.out.println("3: "+Arrays.toString(S1.toCharArray()));
		
		// create string using char array
		System.out.println("4: "+new String(c1));
		System.out.println("41: "+new String(S1));

		// find char at index in a string
		System.out.println("5: "+S1.charAt(0));
		
		// length of string
		System.out.println("6: "+S1.length());

		// EXAMPLE
		System.out.println("7: "+upper(S1));
		System.out.println("8: "+S1.toUpperCase());
		S1 += ", My friend";
		System.out.println(S1);

	}

	public static String upper(String s) {
		String u = "";
		for (int i=0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ('a' <= c && c <= 'z')
				c = (char)(c+'A'-'a');
//				s[i] = (char)(c+'A'-'a');
			u+=c;
		}
		return u;
	}
}
