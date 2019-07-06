package br.com.alessanderleite;

import org.springframework.security.core.AuthenticationException;

public class InvalidJwtAuthenticationException extends AuthenticationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2892336578845206549L;

	public InvalidJwtAuthenticationException(String e) {
		super(e);
	}

}
