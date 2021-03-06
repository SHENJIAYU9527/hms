package zju.ningkai.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import zju.ningkai.domain.User;
import zju.ningkai.service.UserService;
import zju.ningkai.service.impl.UserServiceImpl;

/**
 * @what 用于用户登录和注销
 * @author ningkai
 *
 */
@Controller
@RequestMapping("/user")
public class LoginController {

	@RequestMapping("/login")
	public String toLogin(HttpServletRequest request) {
		return "login";

	}

	@RequestMapping("/dologin")
	public String doLogin(HttpServletRequest request) {
		UserService service = new UserServiceImpl();
		String username = request.getParameter("loginname").trim();
		String password = request.getParameter("loginpass").trim();
		
		User user = service.login(username, password);
	
		String url = "login";
		if (user != null) {
			url = "/patients/index";
			request.getSession().setAttribute("userid", username);
			request.getSession().setAttribute("username", user.getUserName());
		}
		return url;

	}

	@RequestMapping("/dologout")
	public String doLogout(HttpServletRequest request) {
		request.getSession().removeAttribute("username");
		return "login";

	}

	@RequestMapping("/doregister")
	public ModelAndView doRegister(HttpServletRequest request, HttpServletResponse response) {

		String userId = request.getParameter("username").trim();
		String password = request.getParameter("password").trim();
		String username = request.getParameter("name").trim();
		UserService service = new UserServiceImpl();
		User user = new User();
		user.setUserId(userId);
		user.setUserName(username);
		user.setPassword(password);
		int existence = service.isExist(userId);
		int success = 0;
		if (existence == 0) {
			success = service.add(user);
		}
		ModelAndView view = new ModelAndView();
		if (success == 1) {
			view.setViewName("login");
		} else {
			view.setViewName("register");
		}

		return view;

	}

}
