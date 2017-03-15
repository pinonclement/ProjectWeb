package com.web.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.springmvc.model.Note;
import com.web.springmvc.service.NoteService;

@Controller
public class NoteController {
	private NoteService noteservice;
	
	@Autowired(required=true)
	@Qualifier(value="noteService")
	public void setNoteService(NoteService a){
		this.noteservice=a;
	}
	
	@RequestMapping(value="/note",method=RequestMethod.GET)
	public String listNote(Model model, @PathVariable("idSoustitre") int idSoustitre){
		model.addAttribute("note", new Note());
		model.addAttribute("listNote", this.noteservice.listNote(idSoustitre));
		return "note";
	}
	
	@RequestMapping(value="/note/add", method=RequestMethod.POST)
	public String addNote(@ModelAttribute("note") Note a){
		this.noteservice.addnote(a);
		return "redirect:/note";
	}
	
	@RequestMapping("/remove/{idSoustitre}")
	public String removeNote(@PathVariable("idSoustitre") int idSousTitre, int iduser){
		this.noteservice.removeNote(idSousTitre, iduser);
		return "redirect:/note";
	}
	
}
