package zju.ningkai.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @what 用于随访信息显示
 * @author ningkai
 *
 */
@Controller
@RequestMapping("/warning")
public class WarningController {
	
	@RequestMapping("/show")
	public String index(HttpServletRequest request){
		System.out.println("预警患者");
		return "/warning/index";
	
	}
	
	

}
