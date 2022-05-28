package com.example.CompanyRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ComRegServiceImpl implements ComRegService {
	
	@Autowired
	private ComLayer comlayer;

	public ComRegEntity addCompany(ComRegEntity comreg) {
		comlayer.save(comreg);
		return comreg;
		
	}

	

}
