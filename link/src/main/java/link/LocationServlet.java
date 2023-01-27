package link;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/place")
public class LocationServlet extends HttpServlet {

	public LocationServlet() {
		System.out.println("Created  " + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init in location..");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do post in location..");

		String name = req.getParameter("name");
		String eMail = req.getParameter("eMail");
		String startingPoint = req.getParameter("startingPoint");
		String destination = req.getParameter("destination");
		String gender = req.getParameter("gender");

		System.out.println(name);
		System.out.println(eMail);
		System.out.println(startingPoint);
		System.out.println(destination);
		System.out.println(gender);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		
		if(name.length() > 3) {
			writer.print("<span style='color:green;'>");
			writer.print("contact info of " + name + " is sent succussfully...");
		} else {
			writer.print("<span style='color:red;'>");
			writer.print("failed to send" + name + " invalid name..");
		}
		writer.print("<br>");
		writer.print("<br>");
		
		if(eMail.length() > 10) {
			writer.print("<span style='color:green;'>");
			writer.print("contact info of " + name + " is sent succussfully...");
		} else {
			writer.print("<span style='color:red;'>");
			writer.print("failed to send" + name + " invalid email..");
		}
		writer.print("<br>");
		writer.print("<br>");
		
		if(startingPoint.length() > 5) {
			writer.print("<span style='color:green;'>");
			writer.print("contact info of " + name + " is sent succussfully...");
		} else {
			writer.print("<span style='color:red;'>");
			writer.print("failed to send" + name + " invalid startingPoint..");
		}
		writer.print("<br>");
		writer.print("<br>");
		
		if(destination.length() > 5) {
			writer.print("<span style='color:green;'>");
			writer.print("contact info of " + name + " is sent succussfully...");
		} else {
			writer.print("<span style='color:red;'>");
			writer.print("failed to send" + name + " invalid destination..");
		}
		writer.print("<br>");
		writer.print("<br>");
		
		if(gender.length() > 5) {
			writer.print("<span style='color:green;'>");
			writer.print("contact info of " + name + " is sent succussfully...");
		} else {
			writer.print("<span style='color:red;'>");
			writer.print("failed to send" + name + " invalid gender..");
		}
		writer.print("<br>");
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<a href=\"index.html\">back to home</a>");
		writer.print("<br>");
		writer.print("<br>");
		writer.print("<a href=\"location.html\">Back to send</a>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}

}
