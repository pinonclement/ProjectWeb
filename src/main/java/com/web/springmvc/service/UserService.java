package com.web.springmvc.service;

import java.util.List;

import com.web.springmvc.model.User;

public interface UserService {
	
	public void addUser(User a);
	public List<User> listSoustitre();
	public void removeUser(int id);
	
}
