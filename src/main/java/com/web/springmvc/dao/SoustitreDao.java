package com.web.springmvc.dao;

import java.util.List;

import com.web.springmvc.model.Soustitre;

public interface SoustitreDao {
	
	void insert (Soustitre  soustitre);
	
	void delete (Soustitre  soustitre);
	
	void update  (Soustitre  soustitre);
	
	List<Soustitre> findbyVideos();

	
	

}
