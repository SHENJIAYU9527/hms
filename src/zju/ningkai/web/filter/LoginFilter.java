package zju.ningkai.web.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @what 用户登录状态验证过滤器
 * @author ningkai
 *
 */
@WebFilter
public class LoginFilter implements Filter {

	private FilterConfig config;

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest hRequest = (HttpServletRequest) request;
		HttpServletResponse hResponse = (HttpServletResponse) response;
		Object user = hRequest.getSession().getAttribute("username");
		// 过去用户请求URI
		String path = hRequest.getRequestURI();
		if(path.equals("/javaiseasy/")){
			chain.doFilter(request, response);
			return;
		}
		String noLoginPaths = config.getInitParameter("noLoginPaths");
		if (noLoginPaths != null && !noLoginPaths.equals("")) {
			String[] excludePaths = noLoginPaths.split(";");

			for (int i = 0; i < excludePaths.length; i++) {
				if (excludePaths[i] == null || "".equals(excludePaths[i]))
					continue;
				if (path.indexOf(excludePaths[i]) != -1) {
					chain.doFilter(request, response);
					return;
				}

			}
		}
		if (user == null) {
			System.out.println("用户未登录");
			hResponse.sendRedirect("/javaiseasy/user/login");
		}
		chain.doFilter(hRequest, hResponse);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		this.config=arg0;

		
	}

	
}
