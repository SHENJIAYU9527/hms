package zju.ningkai.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zju.ningkai.util.DBHelper;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public DoLogin() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		String username=request.getParameter("loginname").trim();
		String password=request.getParameter("loginpass").trim();
		DBHelper helper=new DBHelper();
		String sql="select count(*) from userinfo where username=? and password=?";
		Object[] parameters={username,password};
		int existence=helper.queryCount(sql, parameters);
		String warning ="";
		if(existence==1){
			request.setAttribute("username", username);
			request.getRequestDispatcher("/search").forward(request, response);
		}else{
			warning="用户名或密码有误！";
			request.setAttribute("username", username);
			request.setAttribute("warning", warning);
			request.getRequestDispatcher("/Login").forward(request, response);
		}
		
	
		
	
		
	}

}
