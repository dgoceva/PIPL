package json.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"name","id","desc"})
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonIgnoreProperties({"ignore","ignore2"})
public class Lecture {

	private long id;
	private String name;
	private String name2;
	@JsonProperty("description")
	private String desc;
	private VIDEO_MATERIALS video;
	private boolean enabled;
	//@JsonIgnore
	private String ignore;
	private String ignore2;
	
	public class QuizQuestion {
		private long id;
		private String question;
		private String answer;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getQuestion() {
			return question;
		}
		public void setQuestion(String question) {
			this.question = question;
		}
		public String getAnswer() {
			return answer;
		}
		public void setAnswer(String answer) {
			this.answer = answer;
		}
	}
	
//	@JsonIgnoreType
	public enum VIDEO_MATERIALS {ENABLED,DISABLED};
	
	public List<QuizQuestion> questions = new ArrayList<>();
	
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

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	
	public VIDEO_MATERIALS getVideo() {
		return video;
	}

	public void setVideo(VIDEO_MATERIALS video) {
		this.video = video;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getIgnore() {
		return ignore;
	}

	public void setIgnore(String ignore) {
		this.ignore = ignore;
	}

	public String getIgnore2() {
		return ignore2;
	}

	public void setIgnore2(String ignore2) {
		this.ignore2 = ignore2;
	}

	public List<QuizQuestion> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuizQuestion> questions) {
		this.questions = questions;
	}

	public Lecture() {
		// TODO Auto-generated constructor stub
	}

}
