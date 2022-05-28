package com.example.CompanyRegistration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ComLayer extends JpaRepository<ComRegEntity, String>{
	

}
