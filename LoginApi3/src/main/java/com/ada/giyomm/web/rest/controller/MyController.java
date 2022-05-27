package com.ada.giyomm.web.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ada.giyomm.web.rest.Dao.DaoLay;
import com.ada.giyomm.web.rest.controller.error.EmailAlreadyUsedException;
import com.ada.giyomm.web.rest.services.Services;
import com.ada.giyomm.web.rest.signin.Signin;


@RestController
public class MyController {
	
	@Autowired
	private Services Service;
	private DaoLay daolay;

		
	@PostMapping("/signup")
	@ResponseStatus(HttpStatus.CREATED)
		public Signin adduser(@RequestBody Signin signup) {
		
		Optional<Signin> existingUser = daolay.findOne(Signin.getEmail);
        if (existingUser.isPresent()) {
            throw new EmailAlreadyUsedException();
        }
			return this.Service.addUser(signup);
		
	}
	
	
	
	
	// get the userdata
		@GetMapping("/signup")
		public List<Signin> getCourses(){
			return this.Service.getUser();
			
		}
		
		
		@PostMapping("/login")
		@ResponseStatus(HttpStatus.CREATED)
		public Signin login(@RequestBody Signin signin) {

			return this.Service.login(signin);

	        
	    }
	
	
//	@DeleteMapping("/courses/{courseId}")
//	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
//		try {
//			this.courseService.deleteCourse(Long.parseLong(courseId));
//			return new ResponseEntity<>(HttpStatus.OK);
//		}
//		catch(Exception e) {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
	
}
