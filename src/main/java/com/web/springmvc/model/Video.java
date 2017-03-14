package com.web.springmvc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "videos")

public class Video implements Serializable {

@Id
@GeneratedValue
@Column(name="videoid")
private int videoid;

@Column(name="nom")
private String nom;

@Column(name="durée")
private int durée;

@Column(name="datediffusion")
private Date datediffusion;

@Column(name="issubtitled")
private boolean issubtitled;

@Column(name="videoname")
private String videoname;

@Column(name="japanname")
private String japanname;

@Column(name="link")
private String link;

@Column(name="arc")
private String arc;

public String getJapanname() {
	return japanname;
}

public void setJapanname(String japanname) {
	this.japanname = japanname;
}

public int getVideoid() {
	return videoid;
}

public void setVideoid(int videoid) {
	this.videoid = videoid;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public int getDurée() {
	return durée;
}

public void setDurée(int durée) {
	this.durée = durée;
}

public Date getDatediffusion() {
	return datediffusion;
}

public void setDatediffusion(Date datediffusion) {
	this.datediffusion = datediffusion;
}

public boolean isIssubtitled() {
	return issubtitled;
}

public void setIssubtitled(boolean issubtitled) {
	this.issubtitled = issubtitled;
}

public String getVideoname() {
	return videoname;
}

public void setVideoname(String videoname) {
	this.videoname = videoname;
}

public String getLink() {
	return link;
}

public void setLink(String link) {
	this.link = link;
}

public String getArc() {
	return arc;
}

public void setArc(String arc) {
	this.arc = arc;
}
}

