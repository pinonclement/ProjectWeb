package com.web.springmvc.service;

import java.util.List;
import com.web.springmvc.model.Soustitre;

public interface SoustitreService {
	
	public void addSoustitre(Soustitre soustitre); 
	public List<Soustitre> listSoustitre(int id);
	public void removeSoustitre(int id);
	
}
