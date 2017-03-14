package com.web.springmvc.dao;

import java.util.List;

import com.web.springmvc.model.Note;

public interface NoteDao {
	
	void insertNote(Note note);
	
	void deleteNote(int userid, int sstitreid);
	
	List<Note> findbySstritre(int sstitreid);
	


}
