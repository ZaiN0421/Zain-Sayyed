package com.ada.giyomm.web.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ada.giyomm.web.rest.Dao.DaoLay;
import com.ada.giyomm.web.rest.signup.Signup;

@Service
public class ServicesImp implements Services {

	@Autowired
	private DaoLay daolayer;

	@Override
	public Signup addUser(Signup signup) {
		
		daolayer.save(signup);
		return signup;
		
		
	}

	@Override
	public List<Signup> getUser() {
		// TODO Auto-generated method stub
		return daolayer.findAll();
	}
	
	

	
}
