package com.web.springmvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fav")

public class Fav implements Serializable {
	@Id
	@Column(name="userid")
	private int userid;
	
	@Id
	@Column(name="videoid")
	private int videoid;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getVideoid() {
		return videoid;
	}

	public void setVideoid(int videoid) {
		this.videoid = videoid;
	}
	
	
	
}
