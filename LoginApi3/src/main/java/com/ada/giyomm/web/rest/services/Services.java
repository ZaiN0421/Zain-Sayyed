package com.ada.giyomm.web.rest.services;

import java.util.List;

import com.ada.giyomm.web.rest.signin.Signin;

public interface Services {

	public Signin addUser(Signin signup);
	public List<Signin> getUser();
	public Signin login(Signin signin);
}
