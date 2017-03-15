package com.web.springmvc.service;

import java.util.List;
import com.web.springmvc.model.Fav;


public interface FavService {
	public void addFav(Fav v);
	public List<Fav> listFav(int id);
	public void removeFav(int id, int video);
}
