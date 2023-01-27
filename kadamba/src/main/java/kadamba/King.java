package kadamba;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/state")
public class King extends HttpServlet {
	
	public King() {
		System.out.println("created " + this.getClass().getSimpleName());
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Running init in king..");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do get in king...");
		
		String name = req.getParameter("king name");
		String region = req.getParameter("region");
		String noOfQueens = req.getParameter("noOfQueens");
		String dob = req.getParameter("date of birth");
		String dod = req.getParameter("date of death");
		
		System.out.println(name);
		System.out.println(region);
		System.out.println(noOfQueens);
		System.out.println(dob);
		System.out.println(dod);
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:red;'>");
		writer.print("king info "+ name +" is sent succussfully...");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}

}
