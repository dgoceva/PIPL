package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import json.domain.Lecture;
import json.domain.Lecture.QuizQuestion;
import json.domain.Lecture.VIDEO_MATERIALS;

public class DataBindingWriteAnnotations {

	public DataBindingWriteAnnotations() {
		// TODO Auto-generated constructor stub
	}

	public static void jsonLecture() {
		
		ObjectMapper objectMapper = new ObjectMapper();
		Lecture lecture = new Lecture();
		lecture.setId(1);
		lecture.setName("JSON Format");
		lecture.setDesc("This is Lecture form JSON format, how to read/write it.");
		lecture.setEnabled(true);
		lecture.setIgnore("");
		lecture.setIgnore2("ignore");
		
		QuizQuestion question = lecture.new QuizQuestion();
		question.setId(1);
		question.setQuestion("What is JSON?");
		question.setAnswer("JSON is a data interchange format");
		
		lecture.getQuestions().add(question);
		lecture.setVideo(VIDEO_MATERIALS.ENABLED);
		
		try {
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(lecture));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main() {
		jsonLecture();
	}

}
