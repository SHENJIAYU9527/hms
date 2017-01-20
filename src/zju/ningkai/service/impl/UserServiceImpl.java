package zju.ningkai.service.impl;

import zju.ningkai.dao.UserDao;
import zju.ningkai.dao.impl.UserDaoImpl;
import zju.ningkai.domain.User;
import zju.ningkai.service.UserService;

public class UserServiceImpl implements UserService {

	


	@Override
	public User login(String userId, String password) {
		UserDao dao=new UserDaoImpl();
		User user=dao.find(userId, password);
		return user;
	}

	@Override
	public int delete(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(User user) {
		UserDao dao=new UserDaoImpl();
		int success=dao.add(user);
		return success;
	}

	@Override
	public int isExist(String userId) {
		UserDao dao=new UserDaoImpl();
		int isExist=dao.isExist(userId);
		return isExist;
	}

}
