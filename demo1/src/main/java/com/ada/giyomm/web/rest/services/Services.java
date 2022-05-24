package com.ada.giyomm.web.rest.services;

import java.util.List;

import com.ada.giyomm.web.rest.signup.Signup;

public interface Services {

	public Signup addUser(Signup signup);
	public List<Signup> getUser();
}
