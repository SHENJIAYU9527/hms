package zju.ningkai.web.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @what 医生工作总结模块
 * @author ningkai
 *
 */
@Controller
@RequestMapping("/summary")
public class SummaryController {
	
	@RequestMapping("/show")
	public String showSummary(HttpServletRequest request){
		System.out.println("工作总结");
		return "/summary/index";
	
	}
	

}
