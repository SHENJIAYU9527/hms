package zju.ningkai.web.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zju.ningkai.util.DBHelper;

/**
 * @waht 用户登录、注销控制器
 * @author ningkai
 *
 */
@Controller
@RequestMapping("/user")
public class LoginController {
	
	@RequestMapping("/login")
	public String doLogin(HttpServletRequest request){
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String username=request.getParameter("loginname").trim();
		String password=request.getParameter("loginpass").trim();
		DBHelper helper=new DBHelper();
		String sql="select count(*) from userinfo where username=? and password=?";
		Object[] parameters={username,password};
		System.out.println("in login Controller");
		int existence=helper.queryCount(sql, parameters);
		request.setAttribute("username", username);
		if(existence==1){
			return "/patients/index";
		}else{
			return "login";
		}
	}
	
	@RequestMapping("/logout")
	public String doLogout(HttpServletRequest request){
		request.getSession().removeAttribute("username");
		System.out.println("here in doLogout controller");
	
		return "login";
	
	}
	
	

}
