package com.sapient.training.Week7.application;

public class Speaker {

	private int vol_levels;
	private String speaker_type;

	public Speaker(int vol_levels, String speaker_type) {
		this.vol_levels = vol_levels;
		this.speaker_type = speaker_type;
	}
	
	public int getVol_levels() {
		return vol_levels;
	}
	public void setVol_levels(int vol_levels) {
		this.vol_levels = vol_levels;
	}
	public String getSpeaker_type() {
		return speaker_type;
	}
	public void setSpeaker_type(String speaker_type) {
		this.speaker_type = speaker_type;
	}
	
	@Override
	public String toString() {
		return vol_levels+"_" + speaker_type;
	}
	
}
