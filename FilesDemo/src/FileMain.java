import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileMain {
	private final static String path=
			"C:\\Lectures";
	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
//		problemTestCase();
		examTestCase();
	}

	static void problemTestCase() throws IOException, Exception {
		File dir = new File(path);
		FilenameFilter zipFilter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				String lowercaseName = name.toLowerCase();
				if (lowercaseName.endsWith(".zip")) {
					return true;
				} else {
					return false;
				}
			}
		};		
		String[] dirList = dir.list(zipFilter);
		int count=1;
		for (String fileName : dirList) {
			Unzipper.unzip(path+File.separator+fileName, 
					path+File.separator+"Temp"+count);
		
			File folder = new File(path+File.separator+"Temp"+count);
			String[] list = folder.list();
			try (TestCase cases = new TestCase(path+File.separator+"TestCases"+count+".txt")) {
				for (String name : list) {
					System.out.println("Reading: "+name);
					cases.readTestCase(path+File.separator+"Temp"+count+File.separator+name);
				}			
			}
			count++;
		}
	}
	
	static void examTestCase() throws IOException, Exception {
		for (int count=1;count<7;count++) {
			System.out.println(path+File.separator+"Temp"+count);
			File folder = new File(path+File.separator+"Temp"+count);
			String[] list = folder.list();
			if (list!=null) {
				try (TestCase cases = new TestCase(path+File.separator+"TestCases"+count+".txt")) {
					for (String name : list) {
						System.out.println("Reading: "+name);
						cases.readTestCase(path+File.separator+"Temp"+count+File.separator+name);
					}			
				}
			}
		}
	}
}
