package com.sapient.training.Week7.application;

public class Mobile {
	
	private Camera camera;
	private Speaker speaker;
	private Screen screen;
	
	
	
	public Camera getCamera() {
		return camera;
	}
	
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	
	public Speaker getSpeaker() {
		return speaker;
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public Screen getScreen() {
		return screen;
	}
	
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	
	public Mobile(Speaker speaker, Screen screen, Camera camera) {
		this.speaker = speaker;
		this.screen = screen;
		this.camera = camera;
	}
	public Mobile() {
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return speaker.toString() + 
		camera.toString() +
		screen.toString();
		
	}

	
	
}
