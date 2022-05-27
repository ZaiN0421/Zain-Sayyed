package com.ada.giyomm.web.rest.controller.error;

import java.net.URI;

public final class ErrorConstants {

	public static final String PROBLEM_BASE_URL = "https://www.jhipster.tech/problem";
	public static final URI EMAIL_ALREADY_USED_TYPE = URI.create(PROBLEM_BASE_URL + "/email-already-used");
	
	private ErrorConstants() {}
}
