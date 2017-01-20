package zju.ningkai.service;

import zju.ningkai.domain.User;

public interface UserService {
	
	
	User login(String userId,String password);
	
	int isExist(String userId);
	
	int delete(String userId);
	
	int update(User user);
	
	int add(User user);
	
	
	

}
