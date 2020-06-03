package com.training.mockito;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.training.controller.Controller;
import com.training.exceptions.InvalidLengthOfNameException;
import com.training.service.Service;

public class ControllerTest {
	
	@Mock
	Controller controller;
	Service currentService;
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		controller = new Controller(currentService);
		
	}
	
	
	@AfterEach
		void tearDown() throws Exception {
	}

	@Test
	public void insertRecordShouldCallInsertRecordMethod() throws InvalidLengthOfNameException{
		Mockito.doNothing().when(currentService).insertRecord(Mockito.anyString(), Mockito.anyString());
		controller.insertRecord("jm", "hobby");	
		Mockito.verify(currentService).insertRecord(Mockito.anyString(), Mockito.anyString());
	}
	
	
	@Test
	public void insertRecordShouldThrowAInvalidLengthOfNameException() throws InvalidLengthOfNameException {
		Mockito.doThrow(InvalidLengthOfNameException.class).when(currentService).insertRecord(Mockito.anyString(), Mockito.anyString());
		Assertions.assertThrows(InvalidLengthOfNameException.class, () -> controller.insertRecord("jm", "anyhobby"));
	}
	
	
	
}
