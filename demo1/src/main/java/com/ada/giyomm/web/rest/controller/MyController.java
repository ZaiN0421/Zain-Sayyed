package com.ada.giyomm.web.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ada.giyomm.web.rest.services.Services;
import com.ada.giyomm.web.rest.signup.Signup;


@RestController
public class MyController {
	
	@Autowired
	private Services Service;

		
	@PostMapping("/signup")
	@ResponseStatus(HttpStatus.CREATED)
		public Signup addCourse(@RequestBody Signup signup) {
		
			return this.Service.addUser(signup);
		
	}
	
	
	// get the userdata
		@GetMapping("/signup")
		public List<Signup> getCourses(){
			return this.Service.getUser();
			
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
