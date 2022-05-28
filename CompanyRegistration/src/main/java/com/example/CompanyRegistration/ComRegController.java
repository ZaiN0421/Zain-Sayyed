package com.example.CompanyRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ComRegController {

	@Autowired
	private ComRegService Service;
	
	@PostMapping("/comreg")
	@ResponseStatus(HttpStatus.CREATED)
		public ComRegEntity adduser(@RequestBody ComRegEntity comreg) {
     
			return this.Service.addCompany(comreg);
		
	}
	
	
}
