
public class LetterMain {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		Letter letter = new Letter("Ivan Ivanov", "Sofia", "Petyr Petrov", "Burgas", 1);
		try (Letter letter = new Letter("Ivan Ivanov", "Sofia", "Petyr Petrov", "Burgas", 1);
){
			Dispatcher.add(letter);
//			Dispatcher.add(letter);
			letter.forSend();
			letter.toReturn();
				Letter temp = Dispatcher.get();
				temp.forSend();
				temp.toReturn();
				temp = Dispatcher.get();
				temp.forSend();
				temp.toReturn();			
//		} catch (AddLetterException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}catch (AddLetterException|NullPointerException e) {
			System.err.println("Error");
//		}finally {
//			letter = null;
		}

	}

}
