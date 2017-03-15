package com.web.springmvc.dao;

import java.util.List;

import com.web.springmvc.model.Video;

public interface VideoDao {
	
	void insert(Video video);
	
	Video getVideoById (int id);
	
	List<Video> getAllVideos ();
	
	void deleteVideo(int id);
	
	void update (Video video);
	

}
