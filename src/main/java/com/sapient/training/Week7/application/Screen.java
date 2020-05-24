package com.sapient.training.Week7.application;

public class Screen {
	
	private int len;
	private int bre;
	
	public Screen(int len, int bre) {
		this.len = len;
		this.bre = bre;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	public int getBre() {
		return bre;
	}
	public void setBre(int bre) {
		this.bre = bre;
	}
	
	@Override
	public String toString() {
		return len+"_" + bre;
	}
}
