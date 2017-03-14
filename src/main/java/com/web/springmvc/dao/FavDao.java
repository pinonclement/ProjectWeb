package com.web.springmvc.dao;

import java.util.List;

import com.web.springmvc.model.Fav;
import com.web.springmvc.model.User;
import com.web.springmvc.model.Video;



public interface FavDao {
	
	void insert(Fav fav);
	
	void delete(int userid, int idvideo);
	
	
	List<Fav> findbyVideo(int idvideo);
	
	List<Fav> findbyUser(int iduser);
	

}
