package com.web.springmvc.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "soustitre")

public class Soustitre implements Serializable{

@Id
@GeneratedValue
@Column(name="sstitreid")
private int sstitreid;

@Id
@Column(name="videoid")
private int videoid;

@Column(name="sousttitre")
private String sousttitre ;

@Column(name="positif")
private int positif;

@Column(name="negatif")
private int negatif;

public int getSstitreid() {
	return sstitreid;
}

public void setSstitreid(int sstitreid) {
	this.sstitreid = sstitreid;
}

public int getVideoid() {
	return videoid;
}

public void setVideoid(int videoid) {
	this.videoid = videoid;
}

public String getSousttitre() {
	return sousttitre;
}

public void setSousttitre(String sousttitre) {
	this.sousttitre = sousttitre;
}

public int getPositif() {
	return positif;
}

public void setPositif(int positif) {
	this.positif = positif;
}

public int getNegatif() {
	return negatif;
}

public void setNegatif(int negatif) {
	this.negatif = negatif;
}
}
