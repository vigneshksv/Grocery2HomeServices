package com.startupprojects.grocery2home.users;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	@RequestMapping("/users/{id}")
	public Optional<User> getUser(@PathVariable int id) {
		return userService.getUser(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/users")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/users")
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/users/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}

}
