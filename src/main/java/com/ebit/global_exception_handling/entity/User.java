package com.ebit.global_exception_handling.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private int userid;
	private String Username;
	private String gamil;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userid, String username, String gamil) {
		super();
		this.userid = userid;
		Username = username;
		this.gamil = gamil;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getGamil() {
		return gamil;
	}

	public void setGamil(String gamil) {
		this.gamil = gamil;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", Username=" + Username + ", gamil=" + gamil + "]";
	}

}
