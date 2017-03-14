package com.web.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.web.springmvc.model.Fav;
import com.web.springmvc.model.User;
import com.web.springmvc.model.Video;

@Repository("VideoDao")
public class VideoDaoImpl extends AbstractDao<Integer,Video> implements VideoDao {

	public void insert(Video video) {
		persist(video);
	}

	public Video getVideoById(int videoid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("videoid", videoid));
		return (Video) criteria.uniqueResult();
	}

	public void deleteVideo(int videoid) {
		Query query = getSession().createSQLQuery("delete from Video where videoid = :videoid");
		query.setInteger("videoid", videoid);
		query.executeUpdate();
		
	}

	public void update(Video video) {
		// TODO Auto-generated method stub
		
	}

	

}
