package com.pt.pires.domain.exceptions;

public class InvalidNotificationTaskException extends VehicleManagerException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 34104380598859175L;

	@Override
	public String getLocalizedMessage() {
		return "Invalid notification";
	}

}
