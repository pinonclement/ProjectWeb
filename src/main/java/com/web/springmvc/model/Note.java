package com.web.springmvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="note")
public class Note implements Serializable{
	@Id
	@Column(name="userid")
	private int userid;
	
	@Id
	@Column(name="sstritreid")
	private int sstritreid;
	
	@Column(name="note")
	private int note;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getSstritreid() {
		return sstritreid;
	}

	public void setSstritreid(int sstritreid) {
		this.sstritreid = sstritreid;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}
	
	
}
