package com.teamsankya.lotproject.dto;

public class LotIdException extends RuntimeException {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "LotId should not be null";
	}

}
