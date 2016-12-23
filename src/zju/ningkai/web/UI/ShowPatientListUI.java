package zju.ningkai.web.UI;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginUI
 * @author ningkai
 * @since 2016-10-26
 */

@WebServlet("/search")
public class ShowPatientListUI extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowPatientListUI() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username=(String) request.getAttribute("username");
		response.setContentType("text/html");
		request.getRequestDispatcher("/pages/patients/index.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
