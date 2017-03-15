package com.web.springmvc.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.web.springmvc.model.Note;
import com.web.springmvc.dao.NoteDao;

@Service
public class NoteServiceImpl implements NoteService {
	private NoteDao notedao;

	@Transactional
	public NoteDao getNotedao() {
		return notedao;
	}

	public void setNotedao(NoteDao notedao) {
		this.notedao = notedao;
	}

	@Transactional
	public void addnote(Note p) {
		this.notedao.insertNote(p);
		
	}

	@Transactional
	public List<Note> listNote(int sstitreid) {
		return this.notedao.findbySstritre(sstitreid);
	}

	@Transactional
	public void removeNote(int id, int sstitreid) {
		this.notedao.deleteNote(id, sstitreid);
		
	}

}
