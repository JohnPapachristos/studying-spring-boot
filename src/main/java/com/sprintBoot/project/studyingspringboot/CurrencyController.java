package com.sprintBoot.project.studyingspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

	@Autowired
	CurrencyServiceConfiguration currency;
	
	@RequestMapping("/currency")
	public CurrencyServiceConfiguration retrieveAll(){
		return currency;		
	}
}
