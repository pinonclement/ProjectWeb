package com.web.springmvc.dao;

import com.web.springmvc.model.Video;

public interface VideoDao {
	
	void newVideo (Video video);
	
	 Video getVideoById ( int id);
	
	void deleteVideo(int id);
	
	void update (Video video);
	

}
