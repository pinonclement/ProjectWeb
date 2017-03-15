package com.web.springmvc.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.web.springmvc.model.Video;
import com.web.springmvc.dao.VideoDao;

@Service 
public class VideoServiceImpl implements VideoService {
	private VideoDao videodao;
	
	
	@Transactional
	public VideoDao getVideodao() {
		return videodao;
	}

	@Transactional
	public void setVideodao(VideoDao videodao) {
		this.videodao = videodao;
	}


	@Transactional
	public void addVideo(Video a) {
		this.videodao.insert(a);	
	}
	
	
	@Transactional
	public List<Video> listVideo() {
		return this.videodao.getAllVideos();
	}
	@Transactional
	public void removeVideo(int id) {
		this.videodao.deleteVideo(id);	
	}

}
