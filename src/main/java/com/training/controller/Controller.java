package com.training.controller;

import com.training.exceptions.InvalidLengthOfNameException;
import com.training.service.Service;

public class Controller {
	Service currentService;
	
	public Controller(Service currentService) {
		this.currentService = currentService;
	}

	public Controller() {
		
	}
	
	public void insertRecord(String name, String hobby) throws InvalidLengthOfNameException{
		try {
			currentService.insertRecord(name, hobby);
		}catch(InvalidLengthOfNameException e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	
}
