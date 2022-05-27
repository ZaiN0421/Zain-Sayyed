package com.ada.giyomm.web.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ada.giyomm.web.rest.Dao.DaoLay;
import com.ada.giyomm.web.rest.signin.Signin;


@Service
public class ServicesImp implements Services {

	@Autowired
	private DaoLay daolayer;

	@Override
	public Signin addUser(Signin signup) {
		
		daolayer.save(signup);
		return signup;
		
		
	}

	@Override
	public List<Signin> getUser() {
		// TODO Auto-generated method stub
		return daolayer.findAll();
	}

	@Override
	public Signin login(Signin signin) {
		Signin user = daolayer.findOneByEmailIdIgnoreCaseAndPassword(signin.getEmail(), signin.getPassword());

        // response
        if(user == null){
            
        }
        
        
     Signin s = new Signin(); 
		
		Signin sign = daolayer.findOneByEmailIdIgnoreCaseAndPassword(signin.getEmail(),signin.getPassword());
		
		if(sign == null){
           
             System.out.println("Failed");
        }
		else {
			System.out.println("Login");
		}
		return s;
		
	}

	
	
	

	
}
