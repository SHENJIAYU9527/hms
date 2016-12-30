package zju.ningkai.web.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import zju.ningkai.util.DBHelper;

/**
 * @what 用于患者信息显示
 * @author ningkai
 *
 */
@Controller
@RequestMapping("/patients")
public class PatientListController {
	
	@RequestMapping("/show")
	public String showPatientList(HttpServletRequest request){
		System.out.println("患者列表");
		return "/patients/index";
	
	}
	@RequestMapping("/newpatients")
	public String getPatients_3(HttpServletRequest request){
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
	@RequestMapping("/patients_1")
	public String getPatients_1(HttpServletRequest request){
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
	@RequestMapping("/patients_2")
	public String getPatients_2(HttpServletRequest request){
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
	@RequestMapping("/patients_0")
	public String getpatients_0(HttpServletRequest request){
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
	@RequestMapping("/patients_end")
	public String getPatients_end(HttpServletRequest request){
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
	
	@RequestMapping("/patients_all")
	public String getPatients_all(HttpServletRequest request){
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
	
	@RequestMapping("/delatais")
	public String getPatientDetails (HttpServletRequest request){
		request.getSession().removeAttribute("username");
		return "login";
	
	}
	
	

}
