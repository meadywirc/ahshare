package com.epsoft.ahshare.entity;

public class Pet {
	private String nickname;
	private String strain;
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	@Override
	public String toString() {
		return "Pet [nickname=" + nickname + ", strain=" + strain + "]";
	}
}
