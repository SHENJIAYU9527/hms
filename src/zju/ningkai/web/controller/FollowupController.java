package zju.ningkai.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import zju.ningkai.domain.Patient;
import zju.ningkai.domain.User;
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

	@RequestMapping("/patients")
	@ResponseBody
	public String dueFU(@RequestParam String doctor,@RequestParam int followupType) throws IOException {
		List<Patient> patients=new ArrayList<Patient>();
		ObjectMapper objectMapper = new ObjectMapper();
		PatientsService s_followup=new PatientsServiceImpl();
		patients=s_followup.getFollowups(doctor, followupType);
		String jsonString = objectMapper.writeValueAsString(patients);
		System.out.println(jsonString);
		return jsonString;
	}

	

}
