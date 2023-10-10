import java.io.IOException;


public class Main {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Root.RootMain();
		Root2.Root2Main();
		ScanXan.ScanXanMain();
		ScanSum.ScanSumMain("usnumbers.txt");
		ScanSum.ScanSumMain(null);
	}

}

