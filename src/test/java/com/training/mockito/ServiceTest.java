package com.training.mockito;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.training.dao.DAO;
import com.training.exceptions.InvalidLengthOfNameException;
import com.training.records.DataRecord;
import com.training.service.Service;

class ServiceTest {

	Service myService;
	@Mock
	DAO dao;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		myService = new Service();
		myService.setDao(dao);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void addShouldCreateANewRecord() throws InvalidLengthOfNameException {
		myService.insertRecord("abcd", "abcd");
		Mockito.verify(dao).add(Mockito.any(DataRecord.class));
	}
	
	@Test
	void addShouldThrowInvalidLengthOfNameException() {
		Assertions.assertThrows(InvalidLengthOfNameException.class, () -> myService.insertRecord("jm", "anyhobby"));	}

}
