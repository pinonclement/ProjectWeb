package com.web.springmvc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name="user")

public class User implements Serializable {
	@Id
	@GeneratedValue
	@Column(name="userid")
	private int userid;
	
	@Column(name="motdepasse")
	private String motdepasse;


	@Column(name="pseudo")
	private String pseudo;

	@Column(name="IsAdmin")
	private boolean isadmin;
	
	@Column(name="dateinscription")
	private Date dateinscription;
	

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getMotdepasse() {
		return motdepasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String email) {
		this.pseudo = email;
	}

	public boolean getIsadmin() {
		return isadmin;
	}

	public void setIsadmin(boolean isadmin) {
		this.isadmin = isadmin;
	}

	public Date getDateinscription() {
		return dateinscription;
	}

	public void setDateinscription(Date dateinscription) {
		this.dateinscription = dateinscription;
	}
	


}
