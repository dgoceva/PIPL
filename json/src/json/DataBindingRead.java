package json;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import json.domain.Student;

public class DataBindingRead {

	public DataBindingRead() {
		// TODO Auto-generated constructor stub
	}
	
	public static void jsonStudent() {
		ObjectMapper objectMapper = new ObjectMapper();
		
		String studentJSON = "{" +
				"\"studentID\" : 1," +
				"\"name\" : \"dani\"," +
				"\"avMark\" : 3.45" +
		"}";
		
		try {
			Student student = objectMapper.readValue(studentJSON, Student.class);
			System.out.println(student);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void jsonMap() {
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			Map<Student,Object> mapJSON = objectMapper.readValue(new File("jsonMap.json"), 
					HashMap.class);
			System.out.println(mapJSON);
			
			for(Entry<Student, Object> entry : mapJSON.entrySet()) {
				System.out.println("key:" + entry.getKey() + " value: "+entry.getValue());
			}
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		jsonStudent();
//		jsonMap();
	}

}
