package com.web.springmvc.service;

import java.util.List;

import com.web.springmvc.model.Video;

public interface VideoService {

	public void addVideo(Video a);
	public List<Video> listVideo();
	public void removeVideo(int id);
}
