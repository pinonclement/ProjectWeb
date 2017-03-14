package dao;

import java.util.List;

import model.Fav;
import model.User;
import model.Video;

public interface FavDao {
	
	void insert(Fav fav);
	
	void delete(Fav fav);
	
	
	List<User> findbyVideo();
	
	List<Video> findbyUser();
	

}
