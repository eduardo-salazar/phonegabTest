package com.test.local;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class PruebaLocal2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
