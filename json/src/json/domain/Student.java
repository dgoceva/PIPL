package json.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

	@JsonProperty(value="studentID")
	private long id;
	private String name;
	private float avMark;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(long id, String name, float avMark) {
		super();
		this.id = id;
		this.name = name;
		this.avMark = avMark;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAvMark() {
		return avMark;
	}

	public void setAvMark(float avMark) {
		this.avMark = avMark;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", avMark=" + avMark + "]";
	}

}
