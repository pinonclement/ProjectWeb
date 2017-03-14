package com.web.springmvc.dao;

import java.util.List;

import com.web.springmvc.model.Note;

public interface NoteDao {
	
	void insert(Note note);
	
	void delete(Note note);
	
	void update (Note note);
	
	List<Note> findbySstritre();
	


}
