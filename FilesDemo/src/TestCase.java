import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCase implements AutoCloseable{
	private BufferedWriter output;
	private int count;
	
	private TestCase() {}
	public TestCase(String fileName) throws IOException {
		output = new BufferedWriter(new FileWriter(fileName));
		count=1;
	}
	public void readTestCase(String fileName) {
		try (BufferedReader input = new BufferedReader(new FileReader(fileName))) {
			if (fileName.contains("in")) {
				output.write("Case=Case "+count);
				output.newLine();
				count++;
			}
			String line;
			boolean isFirstLine=true;
			while((line=input.readLine())!=null) {
				if (isFirstLine) {
					line = (fileName.contains("in")) ? ("input="+line) : ("output="+line);
					isFirstLine=false;
				}
				output.write(line);
				output.newLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		output.close();
	}
}
