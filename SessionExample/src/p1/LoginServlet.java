package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	String str1=request.getParameter("txtname");
	String str2=request.getParameter("txtpass");
	if(str2.equals("1234"))
	{
		HttpSession ses=request.getSession();
		out.println("Session Id:"+ses.getId() +"IsNew"+ses.isNew());
		out.println("Session info:"+ses.getMaxInactiveInterval());
		ses.setAttribute("user", str1);
		ses.setAttribute("SID", ses.getId());
		RequestDispatcher rd=request.getRequestDispatcher("ProductPage.html");
		rd.forward(request, response);
	}
	}

	

}
