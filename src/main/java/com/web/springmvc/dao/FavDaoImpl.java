package com.web.springmvc.dao;



import java.util.List;

import org.springframework.stereotype.Repository;

import com.web.springmvc.model.Fav;
import com.web.springmvc.model.User;
import com.web.springmvc.model.Video;



@Repository("FavDao")
public class FavDaoImpl  implements FavDao{

	public void insert(Fav fav) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Fav fav) {
		// TODO Auto-generated method stub
		
	}

	public List<User> findbyVideo() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Video> findbyUser() {
		// TODO Auto-generated method stub
		return null;
	}


}
