package com.ada.giyomm.web.rest.controller.error;

public class EmailAlreadyUsedException extends RuntimeException {

	
	
	private static final long serialVersionUID = 1L;

		public EmailAlreadyUsedException() {
	        super("Email is already in use!");
	    

	}

}
