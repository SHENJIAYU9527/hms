package zju.ningkai.dao;

import zju.ningkai.domain.User;

public interface UserDao {
	/**
	 * 根据用户名和用户密码查找用户
	 * @param name
	 * @param password
	 * @return
	 */
	User find(String name,String password);
	/**
	 * 添加用户
	 * @param user
	 */
	int add(User user);
	/**
	 * 根据用户名查询用户
	 * @param name
	 * @return
	 */
	User find(String name);
	/**
	 * 判断用户是否已经存在
	 * @param userId
	 * @return
	 */
	int isExist(String userId);
	

}
