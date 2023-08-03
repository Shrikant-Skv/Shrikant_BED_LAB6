package com.greatlearning.studentmgmt.exception;

public class StudentException extends Exception {
	 // Explicitly define the serialVersionUID field
	private static final long serialVersionUID = 1L;
	
	public StudentException(String message) {
		super(message);
	}
}
