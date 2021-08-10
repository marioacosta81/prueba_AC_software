package com.ac.software.prueba.car.center.model.exceptions;

public class CarCenterException extends Exception{
	
	
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public CarCenterException(String message) {
		super(message);
		this.message = message;
		
	}

	public String getMessage() {
		return message;
	}

	
	
	
	
	
	

}
