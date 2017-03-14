package com.web.springmvc.dao;



import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import model.Fav;
import model.User;
import model.Video;


@Repository("FavDao")
public class FavDaoImpl  implements FavDao{



	@Override
	public void delete(Fav fav) {
	
		
	}

	@Override
	public void insert(Fav fav) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public List<User> findbyVideo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Video> findbyUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
