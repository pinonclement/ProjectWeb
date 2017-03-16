package com.web.springmvc.service;

import org.springframework.transaction.annotation.Transactional;
import com.web.springmvc.dao.UserDao;
import com.web.springmvc.model.User;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userdao;
	
	
	@Transactional
	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	@Transactional
	public void addUser(User a) {
		this.userdao.insert(a);
	}
	
	@Transactional
	public List<User> listSoustitre() {
		return this.userdao.findAllUser();
	}
	@Transactional
	public void removeUser(int id) {
		this.userdao.deleteUser(id);
		
	}
	
}
