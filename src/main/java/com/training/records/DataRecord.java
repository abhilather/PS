package com.training.records;

public class DataRecord {
	String name;
	String hobby;
	
	
	public DataRecord(String name, String hobby) {
		this.name = name;
		this.hobby = hobby;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	public DataRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "name-" + name + ", hobby=" + hobby ;
	}
}
