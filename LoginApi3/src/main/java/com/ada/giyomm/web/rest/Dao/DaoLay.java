package com.ada.giyomm.web.rest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ada.giyomm.web.rest.signin.Signin;


@Repository
public interface DaoLay extends JpaRepository<Signin, Long>{



	//Signup findOneByEmailIdIgnoreCaseAndPassword(String email, String password);

	Signin findOneByEmailIdIgnoreCaseAndPassword(String email, String password);
	

}
