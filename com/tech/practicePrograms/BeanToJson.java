package com.tech.practicePrograms;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class BeanToJson {

	/**
	 * @param args
	 */
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		
		//ObjectMapper objectMapper = new ObjectMapper();
		User aUser = new User();
		aUser.setName("a");
		List<String> hobbies = new ArrayList<String>() {
			{
			add("dancing");
			add("singing");
			add("playing");
			add("acting");
			}
		};
		
		aUser.setHobbies(hobbies);
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("/Users/vishal/old_mac/SpringSourceWorkspace/MyMessage_Related_Codes/Tech_Related/src/user.json"), aUser);
			System.out.println("Object to JSON" +(mapper).writeValueAsString(aUser));
			System.out.println("Json to Object" + mapper.readValue(new File ("/Users/vishal/old_mac/SpringSourceWorkspace/MyMessage_Related_Codes/Tech_Related/src/user.json"), User.class));
		} catch (JsonGenerationException e) {
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
}
	class User {
		private String name;
		private List<String> hobbies;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<String> getHobbies() {
			return hobbies;
		}
		public void setHobbies(List<String> hobbies) {
			this.hobbies = hobbies;
		}
		
		public String toString() {
//			return "User [age=" + age + ", name=" + name + ", " + "messages="
//					+ messages + "]";
			return "User [name=" +name + ", hobbies=" + hobbies + ", " + "]";
	}
	}
