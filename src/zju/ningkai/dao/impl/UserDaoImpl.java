package zju.ningkai.dao.impl;

import zju.ningkai.dao.UserDao;
import zju.ningkai.domain.User;
import zju.ningkai.util.DBHelper;

public class UserDaoImpl implements UserDao {


	

	@Override
	public User find(String name, String password) {
		DBHelper helper=new DBHelper();
		String sql="SELECT * FROM [dbo].[user] WHERE userid=? AND password=?";
		Object[] parameters = { name,password };
		User user=null;
		if(helper.queryEntity(new User(), sql, parameters).size()!=0){
			user=helper.queryEntity(new User(), sql, parameters).get(0);
		}
		
		return user;
	}

	@Override
	public int add(User user) {
		DBHelper helper=new DBHelper();
		String sql="INSERT INTO [user] (userid,username,password,auth,status) VALUES(?, ?, ?, 0, 0)";
		Object[] parameters={user.getUserId(),user.getUserName(),user.getPassword()};
		int success=helper.update(sql, parameters);
		return success;

	}

	@Override
	public User find(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int isExist(String userId) {
		DBHelper helper=new DBHelper();
		String sql="SELECT count(*) FROM [dbo].[user] WHERE userid=?";
		Object[] parameters={userId};
		int existence=helper.queryCount(sql, parameters);
		return existence;
	}

}
