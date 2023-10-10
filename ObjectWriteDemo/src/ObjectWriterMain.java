import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectWriterMain implements AutoCloseable{

	public ObjectWriterMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book result;
		Book book = new Book(123,"Topic sample","Name1, Name2");
		try (ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("book.obj"))){
			out.writeObject(book);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("book.obj"))){
			result = (Book)in.readObject();
			System.out.println(result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
	}

}
