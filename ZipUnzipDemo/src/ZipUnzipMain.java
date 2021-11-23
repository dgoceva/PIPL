import java.io.File;

import zip.unzip.ZipUnzip;

public class ZipUnzipMain {

    private static final String OUTPUT_ZIP_FILE = "Folder.zip";
    private static final String SOURCE_FOLDER = "C:\\PIK3\\ZipUnzipDemo"; // SourceFolder path

	   public static void main(String[] args) {
	        ZipUnzip appZip = new ZipUnzip();
	        appZip.setSourceFolder(SOURCE_FOLDER);
	        appZip.generateFileList(new File(SOURCE_FOLDER));
	        appZip.zipIt(OUTPUT_ZIP_FILE);
	    }


}
