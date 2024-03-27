package com.javaes.oop.tv;

public class TV {
// 채널 범위 : 1-255
// 볼륨 범위 : 0-100
	// 상수
	private static final int MIN_channel = 1;
	private static final int MAX_channel = 255;
	private static final int MIN_volume = 0;
	private static final int MAX_volume = 100;
	
	// 필드
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
	      super();
	this.channel = channel;
	this.volume = volume;
	this.power = power;
	}
	
	public int getChannel() {
		  return channel;
	  }
//	  public void setChannel(int channel) {
//		  this.channel = channel; 
//	  }
	public int getVolume() {
		  return volume;
      }
//	  public void setVolume(int volume) {
//			  this.volume = volume; 
//      }
	public boolean isPower() {
		  return power;
  }
//      public void setPower(boolean power) {
//		  this.power = power; 
//  }
}
