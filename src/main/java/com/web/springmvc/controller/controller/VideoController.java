package com.web.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.springmvc.model.Video;
import com.web.springmvc.service.VideoService;

@Controller
public class VideoController {
	private VideoService videoservice;
	
	@Autowired(required=true)
	@Qualifier(value="videoService")
	public void setVideoService(VideoService a){
		this.videoservice=a;
	}
	
	@RequestMapping(value="/addVideo",method=RequestMethod.POST)
	public String addVideo(@ModelAttribute("video") Video a){
		if(a.getVideoid()==0)
			this.videoservice.addVideo(a);
		return "redirect:/video";
	}
	
	@RequestMapping(value="/videos",method=RequestMethod.GET)
	public String listVideo(Model model){
		model.addAttribute("video", new Video());
		model.addAttribute("listVideo", this.videoservice.listVideo());
		return "videos";
	}
	
	
	@RequestMapping("/remove/{videoid}")
	public String removeVideo(@PathVariable("videoid") int videoid){
		this.videoservice.removeVideo(videoid);
		return "redirect:/video";
	}
		
}

