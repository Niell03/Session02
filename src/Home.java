

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Home")
public class Home extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("uname");
		String pass=request.getParameter("upass");
		out.print("Welcome user to home"+name+""+pass);
		
		out.print("<form action='About'>");
		out.print("<input type='hidden' name='uname' value='"+name+"'>");
		out.print("<br><br><input type='hidden' name='upass' value='"+pass+"'>");
		out.print("<input type='submit' value='click'>");
		out.print("</form>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
