import java.util.ArrayList;

class Author_Percent {
	Author authorName;
	int percent;

	public Author_Percent(String Name, String Address, String Tel, int percent) {
		
		this.authorName = new Author (Name,Address,Tel,1);
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Author_Percent [authorName=" + authorName + ", percent="
				+ percent + "]";
	}
	
}

public class ColectivePaper extends Paper {

	private ArrayList<Author_Percent> authors;
	

	public ArrayList<Author_Percent> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<Author_Percent> authors) {
		this.authors = authors;
	}

	public ColectivePaper(String Title, String Annotation, String[] Keys,
			String Text, Author_Percent[]authors) throws Exception {
		super(Title, Annotation, Keys, Text);
		// TODO Auto-generated constructor stub
		int total = 0;
		this.authors = new ArrayList<Author_Percent>();
		for (int i=0;i<authors.length;i++) {
			this.authors.add(authors[i]);
			total += authors[i].percent;
		}
		if (total != 100) 
			throw new Exception ("Error in percents");
	}
	
	public String getAuthor(int number) throws Exception {
		if (number < 0 || number > authors.size()) {
			throw new Exception("Index out of range");
		}
		return authors.get(number).authorName.Name;
	}
	public String getAuthor() throws Exception {
		return getAuthor(0);
	}
	
	public void changeStatus(Organizer reviewer, String pass, STAGE Status) 
		throws Exception {
		
		switch (Stage) {
		case NEW:
			if (isFoundName(reviewer.Name)) {
				throw new Exception("Duplicate names");
			}	
			this.reviewer = reviewer;
			Stage = STAGE.INPROCESS;
			break;
		case INPROCESS:
			if (this.reviewer.Name.equals(reviewer.Name) &&
					this.reviewer.verifyPass(pass))
				Stage = Status;
			else
				throw new Exception ("The reviewer data is not correct");
			break;
		default:
			throw new Exception ("Wrong Paper Status");	
		}
	}
	
	private boolean isFoundName(String name) {
		for(int i=0;i<authors.size();i++) {
			if (name.equals(authors.get(i).authorName.Name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "ColectivePaper [authors=" + authors + "]";
	}

}
