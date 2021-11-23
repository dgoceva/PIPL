import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Unzipper {

	public static void unzip(String zipName, String folder) {
		byte[] buffer = new byte[1024];
		
		File output = new File(folder);
		if (!output.exists()) {
			output.mkdir();
		}
		
		try {
			ZipInputStream zip = new ZipInputStream(new FileInputStream(zipName));
			ZipEntry zEntry = zip.getNextEntry();
			
			while(zEntry!=null) {
				String name = zEntry.getName();
				File fOutput = new File(folder+File.separator+name);
				
				System.out.println("file unzip : "+name);
				
				new File(fOutput.getParent()).mkdir();
				
				FileOutputStream fos = new FileOutputStream(fOutput);
				int len;
				while((len=zip.read(buffer))>0) {
					fos.write(buffer,0,len);
				}
				fos.close();
				zEntry = zip.getNextEntry();
			}
			
			zip.closeEntry();
			zip.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
