package json;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import json.domain.Student;

public class DataBindingWrite {

	public DataBindingWrite() {
		// TODO Auto-generated constructor stub
	}

	public static void jsonStudent() {
		
		ObjectMapper objectMapper = new ObjectMapper();
		Student student = new Student();
		student.setId(1);
		student.setName("dani");
		student.setAvMark((float)3.45);
		
		try {
			System.out.println(objectMapper.writeValueAsString(student));
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(student));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void jsonMap() {
		ObjectMapper objectMapper = new ObjectMapper();

		Map<String,Object> mapJSON = new LinkedHashMap<>();
		mapJSON.put("key1", "value1");
		mapJSON.put("key2", "value3");
		mapJSON.put("key3", "value3");
		mapJSON.put("booleanTrue",true);
		mapJSON.put("booleanFalse",false);
		mapJSON.put("array", new String[] {"1","2","3"});
		mapJSON.put("arrayOfObjects",new Student[] {new Student(1,"dani",(float)3.45),
				new Student(2, "ivan",(float)5.35)});
		mapJSON.put("nestedObject",new Student(1,"dani",(float)4.44));
		mapJSON.put("integer",1);
		mapJSON.put("valueNull",null);
		mapJSON.put("list",Arrays.asList(1,2,3));
		mapJSON.put("date", LocalDateTime.now().toString());

		try {
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mapJSON));
			objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("jsonMap.json"),mapJSON);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		jsonStudent();
		jsonMap();
	}

}
