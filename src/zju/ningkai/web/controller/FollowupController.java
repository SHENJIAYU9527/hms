package zju.ningkai.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import zju.ningkai.domain.Patient;
import zju.ningkai.service.PatientsService;
import zju.ningkai.service.impl.PatientsServiceImpl;

/**
 * @what 用于随访信息显示
 * @author ningkai
 *
 */
@Controller
@RequestMapping("/followup")
public class FollowupController {

	@RequestMapping("/phone")
	public String index(HttpServletRequest request) {

		return "/followup/index";
	}

	@RequestMapping("/flist")
	@ResponseBody
	public String dueFU(@RequestParam String doctor, @RequestParam int followupType) throws IOException {
		List<Patient> patients = new ArrayList<Patient>();
		ObjectMapper objectMapper = new ObjectMapper();
		PatientsService s_followup = new PatientsServiceImpl();
		long start=new Date().getTime();
		patients = s_followup.getFollowups(doctor, followupType);
		long end=new Date().getTime();
		System.out.println("费时："+(end-start)/1000+"秒");
		String jsonString = objectMapper.writeValueAsString(patients);
		System.out.println(jsonString);
		return jsonString;
	}

}
