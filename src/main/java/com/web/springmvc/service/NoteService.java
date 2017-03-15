package com.web.springmvc.service;

import java.util.List;
import com.web.springmvc.model.Note;

public interface NoteService {
	public void addnote(Note p);
	public List<Note> listNote(int id);
	public void removeNote(int id, int iduser);
}
