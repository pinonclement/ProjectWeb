package com.web.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.springmvc.service.SoustitreService;
import com.web.springmvc.model.Soustitre;

@Controller
public class SoustitreController {
	private SoustitreService soustitreservice;
	
	@RequestMapping(value="/soustitre",method=RequestMethod.GET)
	public String listSoustitre(Model model,@PathVariable("idVideo") int idVideo){
		model.addAttribute("soustitre",new Soustitre());
		model.addAttribute("listSoustitre",this.soustitreservice.listSoustitre(idVideo));
		return "soustitre";
	}
	
	//ajout
	@RequestMapping(value="/soustitre/add",method=RequestMethod.POST)
	public String addSoustitre(@ModelAttribute("soustitre")Soustitre a){
		this.soustitreservice.addSoustitre(a);
		return "redirect:/soustitre";
	}
	
	
}
