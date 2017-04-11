package com.webapp.project.framework.service;

import java.util.List;

import com.webapp.project.framework.model.User;


public interface UserService {
	
	User findById(int id);
	
	User findBySSO(String sso);
	
	void saveUser(User user);
	
	String saveTeacher(User user);
	
	String saveStudent(User user);
	
	String saveParent(User user);
	
	void updateUser(User user);
	
	void deleteUserBySSO(String sso);

	List<User> findAllUsers(); 
	
	boolean isUserSSOUnique(Integer id, String sso);

}