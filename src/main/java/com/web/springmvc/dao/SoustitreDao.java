package com.web.springmvc.dao;

import java.util.List;

import com.web.springmvc.model.Soustitre;

public interface SoustitreDao {
	
	void insertSoustitre (Soustitre  soustitre);
	
	void deleteSoustitre (int sstitreid);
	
	void update  (Soustitre  soustitre);
	
	List<Soustitre> findbyVideos(int videoid);

	
	

}
