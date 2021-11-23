
public class ConferenceMain {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Author_Percent a1 = new Author_Percent("Ime1","Adres1","T1",100);
		ColectivePaper p1 = new ColectivePaper("Proba","Anotacia", new String[]{"K1","K2"},"Tekst",
				new Author_Percent[]{a1});
		System.out.println(p1);
	}

}
