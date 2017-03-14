package com.web.springmvc.dao;

import java.util.List;

import com.web.springmvc.model.Fav;
import com.web.springmvc.model.User;
import com.web.springmvc.model.Video;



public interface FavDao {
	
	void insert(Fav fav);
	
	void delete(Fav fav);
	
	
	List<User> findbyVideo();
	
	List<Video> findbyUser();
	

}
