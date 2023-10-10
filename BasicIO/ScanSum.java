import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class ScanSum {
	public static void ScanSumMain(String source) throws IOException {
		Scanner s = null;
		double sum = 0;
		try {
			if (source == null) {
				s = new Scanner(System.in);
			} else {
				s = new Scanner(new BufferedReader(new FileReader(source)));
			}
			s.useLocale(Locale.US);

			while (s.hasNext()) {
				if (s.hasNextDouble()) {
					sum += s.nextDouble();
				} else {
					s.next();
				}
			}
		} finally {
			s.close();
		}

		System.out.println(sum);
	}
}
