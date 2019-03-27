package p2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.print.DocFlavor.STRING;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Second")
public class SecondCookie extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter()	;
	Cookie[] cArray=request.getCookies();
	pw.println("The cookie is " +cArray[0].getValue());
	String s=request.getParameter("str1");
	pw.println("The value "+s);
	String s1=request.getParameter("str2");
	pw.println("The value "+s1);
	pw.println("<form action='Third'>");
	pw.println("<input type='hidden' name='h1' value='"+s+"'>");
	pw.println("<input type='submit' value='submit'>");
	pw.println("</form>");
	
	}

	

}
