import java.io.Serializable;

public class Book implements Serializable{

	private int id;
	private String topic;
	private String authors;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String topic, String authors) {
		super();
		this.id = id;
		this.topic = topic;
		this.authors = authors;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", topic=" + topic + ", authors=" + authors + "]";
	}

	
}
