package day_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import day_5.entities.concretes.User;

public class UserDb {

	List<User> users = new ArrayList<>();
	Map<String,String> verificationCodes = new HashMap<>();
	Map<Integer,Map<String,String>> authUsers = new HashMap<>();
	
	public void createUser(User user, String verificationCode) {
		users.add(user);
		verificationCodes.put(user.getEmail(), verificationCode);
	}
	
	public void createUser(User user) {
		users.add(user);
	}
	
	public User getUser(String email) {
		for (User user : users) {
			if(user.getEmail().equals(email)) return user;
		}
		return null;
	}
	
	public User getUserWithId(int id) {
		for (User user : users) {
			if(user.getId() == id ) return user;
		}
		return null;
	}
	
	public String getUserValidationCode(String email) {
		return verificationCodes.get(email);
	}
	
	public void createAuthUser(int id,Map<String,String> data) {
		authUsers.put(id, data);
	}
	
	public int getAuthUser(String unique_id) {
		for (Entry<Integer, Map<String, String>> authUser:authUsers.entrySet()) {
			if(authUser.getValue().get("unique_id").equals(unique_id)) {
				return authUser.getKey();
			}
		}
		return -1;
	}
	
	public int lastId() {
		return users.get(users.size()-1).getId();
	}
	
	public void printall() {
		System.out.println("\nusers");
		for (User user : users) {
					System.out.println(user.getId() + ". " + user.getFirstName() + " , " + user.getLastName() + " , " +  user.getEmail() + " , " + user.getPassword() + " , " + user.getVerification());
		}
		System.out.println("\nAuthusers");
		for (Entry<Integer, Map<String, String>> authUser:authUsers.entrySet()) {
			System.out.println(authUser.getKey() + " - " + authUser.getValue());
		}
	}
}
