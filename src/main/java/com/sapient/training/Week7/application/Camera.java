package com.sapient.training.Week7.application;

public class Camera {
	private String manufacturer;
	private int no_of_mg_pixels;
	
	public Camera(String mf, int pix) {
		this.manufacturer = mf;
		this.no_of_mg_pixels = pix;
	}
	
	public int getNo_of_mg_pixels() {
		return no_of_mg_pixels;
	}
	public void setNo_of_mg_pixels(int no_of_mg_pixels) {
		this.no_of_mg_pixels = no_of_mg_pixels;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	@Override
	public String toString() {
		return manufacturer+"_" + no_of_mg_pixels;
	}
}
