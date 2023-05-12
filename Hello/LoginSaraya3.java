package com.saraya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login.do")
public class LoginSaraya3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//
//		PrintWriter out = response.getWriter();
//		out.println(" HI  Welcome to Saraya");
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Saraya Tech Servlet</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h2>Welcome TO STS </h2>");
//		out.println("</body>");
//		out.println("</html>");
		request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
		}

}
