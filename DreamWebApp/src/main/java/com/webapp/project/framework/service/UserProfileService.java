package com.webapp.project.framework.service;

import java.util.List;

import com.webapp.project.framework.model.UserProfile;


public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
