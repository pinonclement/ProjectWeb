package com.web.springmvc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.web.springmvc.model.User;

@Repository("UserDao")
public class UserDaoImpl implements UserDao{

	public void newUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	public User findUserByPseudo(String pseudo) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public void ChangePass(String password) {
		// TODO Auto-generated method stub
		
	}

	

}
