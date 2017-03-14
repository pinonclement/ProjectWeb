package com.web.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.web.springmvc.model.User;


@Repository("UserDao")
public class UserDaoImpl extends AbstractDao <Integer,User> implements UserDao{

	public void insert(User user) {
		persist(user);
	}

	public void deleteUser(int userid) {
		Query query = getSession().createSQLQuery("delete from User where userid = :userid");
		query.setInteger("userid", userid);
		query.executeUpdate();
		
	}

	public User findUserByPseudo(String pseudo) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("pseudo", pseudo));
		return (User) criteria.uniqueResult();
	}

	public List<User> findAllUser() {
		Criteria criteria = createEntityCriteria();
		return (List<User>) criteria.list();
	}

	public void ChangePass(String password) {
		// TODO Auto-generated method stub
		
	}

	

}
