package zju.ningkai.web.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import zju.ningkai.util.DBHelper;

/**
 * @waht 用户登录、注销控制器
 * @author ningkai
 *
 */
@Controller
@RequestMapping("/user")
public class LoginController {
	
	@RequestMapping("/")
	public String toLogin(HttpServletRequest request){
		return "login";
	
	}
	@RequestMapping("/dologin")
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
		int existence=helper.queryCount(sql, parameters);
		request.setAttribute("username", username);
		if(existence==1){
			return "/patients/index";
		}else{
			return "login";
		}
	}
	
	@RequestMapping("/dologout")
	public String doLogout(HttpServletRequest request){
		request.getSession().removeAttribute("username");
		return "login";
	
	}
	
	@RequestMapping("/doregister")
	public ModelAndView doRegister(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(request.getParameter("username"));
		String username=request.getParameter("username").trim();
		String password=request.getParameter("password").trim();
		String email=request.getParameter("name").trim();
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
		ModelAndView view = new ModelAndView();
		if(success==1){
			view.setViewName("login");
		} else{
			view.setViewName("register");
		}
		
		return view;
		
	}
	

}
