
public class ContinueWithLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Sample for searchning demo";
		String sub = "forr";
		int max = text.length() - sub.length();
		boolean found = false;
		
		next:
		for (int i=0;i<max;i++) {
			int n = sub.length();
			int k=i,l=0;
			
			while (n-- != 0) {
				if (text.charAt(k++) != sub.charAt(l++)) {
					continue next;
				}
			}
			found = true;
			break next;
		}
		System.out.println(found);
	}

}
