package com.ada.giyomm.web.rest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ada.giyomm.web.rest.signup.Signup;


@Repository
public interface DaoLay extends JpaRepository<Signup, Long>{
	

}
