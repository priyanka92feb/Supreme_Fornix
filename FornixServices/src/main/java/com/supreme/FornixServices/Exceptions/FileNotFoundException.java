package com.supreme.FornixServices.Exceptions;

public class FileNotFoundException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Please provide input file";
	}
	

}
