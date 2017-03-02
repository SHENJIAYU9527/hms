package zju.ningkai.web.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import zju.ningkai.domain.Patient_1;
import zju.ningkai.service.PatientsService;
import zju.ningkai.service.impl.PatientsServiceImpl;
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
		return "/patients/index";
	
	}
	@RequestMapping("/plist")
	@ResponseBody
	public String getPatients(@RequestParam String doctor, @RequestParam int type) throws IOException {
		List<Patient_1> patients = new ArrayList<Patient_1>();
		ObjectMapper objectMapper = new ObjectMapper();
		PatientsService patientsService = new PatientsServiceImpl();
		long start=new Date().getTime();
		patients = patientsService.getPatients(doctor, type);
		long end=new Date().getTime();
		System.out.println("费时："+(end-start)+"毫秒");
		String jsonString = objectMapper.writeValueAsString(patients);
		System.out.println(jsonString);
		return jsonString;
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
