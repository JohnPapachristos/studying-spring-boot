package com.sprintBoot.project.studyingspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping("/users")
	public List<User> retrieveAllUsers(){
		return Arrays.asList(
				new User(1, "John", "Papachristos"),
				new User(2, "Georgre", "Papachristos"),
				new User(3, "Kostas", "Papachristos")
				);
				
	}
}
