package zju.ningkai.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zju.ningkai.util.DBHelper;

/**
 * @what 用户注册控制器
 * @author ningkai
 * @since 2016-10-26
 */
@WebServlet("/doRegister")
public class DoRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DoRegister() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username=request.getParameter("username").trim();
		String password=request.getParameter("password").trim();
		String email=request.getParameter("email").trim();
		DBHelper helper=new DBHelper();
		String sql="select count(*) from userinfo where username=?";
		Object[] parameters={username};
		int existence=helper.queryCount(sql, parameters);
		int success=0;
		if(existence==0){
			String sql_insert="insert into userinfo (username,password,auth,status,email)values(?,?,0,0,?)";
			Object[] parameters2={username,password,email};
			success=helper.update(sql_insert, parameters2);
		}
		if(success==1){
			request.getRequestDispatcher("/Login").forward(request, response);
		} else{
			request.getRequestDispatcher("/register").forward(request, response);
		}
		
	}

}
