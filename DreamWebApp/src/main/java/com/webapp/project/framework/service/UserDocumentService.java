package com.webapp.project.framework.service;

import java.util.List;

import com.webapp.project.framework.model.UserDocument;

public interface UserDocumentService {

	UserDocument findById(int id);

	List<UserDocument> findAll();
	
	List<UserDocument> findAllByUserId(int id);
	
	void saveDocument(UserDocument document);
	
	void deleteById(int id);
}
