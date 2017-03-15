package com.web.springmvc.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.web.springmvc.dao.SoustitreDao;
import com.web.springmvc.model.Soustitre;

@Service
public class SoustitreServiceImpl implements SoustitreService {

	private SoustitreDao soustitredao;
	
	@Transactional
	public SoustitreDao getSoustitredao() {
		return soustitredao;
	}
	public void setSoustitredao(SoustitreDao soustitredao) {
		this.soustitredao = soustitredao;
	}
	@Transactional
	public void addSoustitre(Soustitre soustitre) {
		this.soustitredao.insertSoustitre(soustitre);
		
	}
	@Transactional
	public List<Soustitre> listSoustitre(int id) {
		return this.soustitredao.findbyVideos(id);
	}
	@Transactional
	public void removeSoustitre(int id) {
		this.soustitredao.deleteSoustitre(id);
		
	}


}
