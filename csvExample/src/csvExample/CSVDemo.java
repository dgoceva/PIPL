package csvExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CSVDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		csvReadScanner("C:\\Samples\\PIPL\\csvExample\\username.csv");
		csvRead("C:\\Samples\\PIPL\\csvExample\\username-password-recovery-code.csv");
	}
	
	public static void csvReadScanner(String fname) {
		try (Scanner csv = new Scanner(new File(fname))){
			csv.useDelimiter(";");
			while (csv.hasNext()) {
				System.out.print(csv.next()+" ");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void csvRead(String fname) {
		try (BufferedReader csv =  new BufferedReader(new FileReader(fname))){
			String line;
			while ((line = csv.readLine()) != null) {
				String[] data = line.split(";");
				System.out.println(Arrays.toString(data));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
