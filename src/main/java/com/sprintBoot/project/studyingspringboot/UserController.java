package com.sprintBoot.project.studyingspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping("/courses")
	public List<User> retrieveAllCourses(){
		return Arrays.asList(
				new User(1, "Learn AWS", "Seminar"),
				new User(2, "Learn AWS", "Seminar")
				);
				
	}
}
