package com.web.springmvc.controller;
import com.web.springmvc.dao.*;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.springmvc.video.*;
import com.web.springmvc.dao.VideoDao;
import com.web.springmvc.model.Video;
import com.web.springmvc.video.AppManagedDownload;
import com.web.springmvc.video.YouTubeTest;


@Controller
@RequestMapping("/")

public class AppController {

	@Autowired
	VideoDao dao;
	
	@Autowired
	MessageSource messageSource;
	@RequestMapping(value = { "/"}, method = RequestMethod.GET)

		public String listVideo(ModelMap model) {

			List<Video> videos = dao.getAllVideos();
			model.addAttribute("videos", videos);		
			AppManagedDownload.main(new String[] { "http://www.youtube.com/watch?v=fcriZ9PECf0"});
	
		return "hello";
	}

}
