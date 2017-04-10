package com.webapp.project.framework.dao;

import java.util.List;

import com.webapp.project.framework.model.User;


public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
	void save(User user);
	
	String saveTeacher(User user);
	
	String saveStudent(User user);
	
	String saveParent(User user);
	
	void deleteBySSO(String sso);
	
	List<User> findAllUsers();

}

