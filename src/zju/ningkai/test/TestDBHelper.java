package zju.ningkai.test;

import java.util.ArrayList;

import zju.ningkai.util.DBHelper;

public class TestDBHelper {

	public static void main(String[] args) {
		DBHelper dbHelper = new DBHelper();
		
//		String sql = "update userinfo set username=? where seq=?";
//		Object[] params = { "duNingkai",1 };
//		int success = dbHelper.update(sql, params);
//		System.out.println(success);
		
//		String sql2 = "insert into userinfo values (?,?,?,?,?,?,?,?)";
//		Object[] params2 = { "kai", "宁凯", "456789", 0, "13777859767", "hust_ningkai@163.com", "华中科技大学", 0 };
//		int success2 = dbHelper.update(sql2, params2);
//		System.out.println(success2);
//		
//		String sql3="select * from userinfo";
//		
		//List<User> userList=dbHelper.query2(new User(), sql3, null);
//		for(User user:userList){
//			System.out.println(user);
//		}
		String sql="select username from userinfo where seq =?";
		Object[] params = {1};
		ArrayList<String> usernames=dbHelper.queryString(sql,params);
		System.out.println(usernames.get(0));
		
		
	
	}

}
