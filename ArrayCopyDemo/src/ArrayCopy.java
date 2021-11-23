
public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] source = {'h','e','l','l','o',' ','w','o','r','l','d'};
		char[] dest = new char[source.length];
		
		System.arraycopy(source,0,dest,0,source.length);
		System.out.println(new String(dest));
		System.out.println(dest);
	}

}
