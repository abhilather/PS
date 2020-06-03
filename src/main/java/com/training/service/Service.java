package com.training.service;

import com.training.dao.DAO;
import com.training.exceptions.InvalidLengthOfNameException;
import com.training.interfaces.IService;
import com.training.records.*;

public class Service implements IService{

	private DAO dao;
	

	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}

	
	public Service() {
	}

	public void insertRecord(String name, String hobby) throws InvalidLengthOfNameException {
		// TODO Auto-generated method stub
		if(name.length()>=4){
			dao.add(new DataRecord(name, hobby));
			
		}else {
			throw new InvalidLengthOfNameException("Length of name must be greater than or equal to 4");
		}
	}

}
