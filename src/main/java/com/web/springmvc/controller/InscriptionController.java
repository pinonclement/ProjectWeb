package com.web.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.web.springmvc.model.User;
import com.web.springmvc.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import javax.servlet.http.HttpServlet;  



@Controller
public class InscriptionController extends HttpServlet {   
	private UserService userservice;
	
	
	//for add
	@RequestMapping(value="/user/add",method=RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User a){
		if(a.getUserid()==0) //nouveau utilisateur, add it => on peut supprimer la condition si on génére auto un id
			this.userservice.addUser(a);
		return "redirect:/user";
	}
	
	@RequestMapping("/remove/{id}")
	public String removeUser(@PathVariable("id") int id){
		this.userservice.removeUser(id);
		return "redirect:/user";
	}
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public String listUser(Model model){
		model.addAttribute("user", new User());
		model.addAttribute("listUser",this.userservice.listSoustitre());
		return "user";
	}

}
