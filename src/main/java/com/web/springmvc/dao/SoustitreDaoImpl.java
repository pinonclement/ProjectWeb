package com.web.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.web.springmvc.model.Note;
import com.web.springmvc.model.Soustitre;
@Repository("SoustitreDao")
public class SoustitreDaoImpl extends AbstractDao<Integer,Soustitre> implements SoustitreDao {

	public void insertSoustitre(Soustitre soustitre) {
		persist(soustitre);
		
	}

	public void deleteSoustitre(int sstitreid) {
		Query query = getSession().createSQLQuery("delete from Soustitre where sstitreid = :sstitreid ");
		query.setInteger("sstitreid", sstitreid);
		query.executeUpdate();
		
	}

	public void update(Soustitre soustitre) {
		// TODO Auto-generated method stub
		
	}

	public List<Soustitre> findbyVideos(int videoid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("videoid", videoid));
		return (List<Soustitre>) criteria.list();
	}

		
	


}
