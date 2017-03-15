package com.web.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.springmvc.model.Fav;
import com.web.springmvc.service.FavService;

@Controller
public class FavController {

	private FavService favservice;
	
	@Autowired(required=true)
	@Qualifier(value="favService")
	public void setFavService(FavService a){
		this.favservice=a;
	}
	
	@RequestMapping(value="/fav/add",method=RequestMethod.POST)
	public String addFav(@ModelAttribute("fav") Fav a){
		this.favservice.addFav(a);
		return "redirect:/fav";
	}
	@RequestMapping("/remove/{idFav}")
	public String removeFav(@PathVariable("idFav") int idFav, int video){
		this.favservice.removeFav(idFav, video);
		return "redirect:/fav";
	}
	
	@RequestMapping(value="/Favs",method=RequestMethod.GET)
	public String ListFav(Model model, int id){
		model.addAttribute("fav", new Fav());
		model.addAttribute("listFavs", this.favservice.listFav(id));
		return "fav";
		}
	}
