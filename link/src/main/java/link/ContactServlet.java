package link;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/adress")
public class ContactServlet extends HttpServlet {

	public ContactServlet() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init in contact...");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do post in contact...");

		String name = req.getParameter("name");
		String eMail = req.getParameter("eMail");
		String mobile = req.getParameter("mobile");
		String comments = req.getParameter("comments");

		System.out.println(name);
		System.out.println(eMail);
		System.out.println(mobile);
		System.out.println(comments);

		Long convertNumber = Long.parseLong(mobile);

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
		
		if (convertNumber > 0) {
			writer.print("<span style='color:green;'>");
			writer.print("contact info of " + name + " is sent succussfully...");
		} else {
			writer.print("<span style='color:red;'>");
			writer.print("failed to send" + name + " invalid number..");
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
		
		if(comments.length() > 20) {
			writer.print("<span style='color:green;'>");
			writer.print("contact info of " + name + " is sent succussfully...");
		} else {
			writer.print("<span style='color:red;'>");
			writer.print("failed to send" + name + " invalid name..");
		}
		writer.print("<br>");
		writer.print("<br>");
		
		writer.print("<a href=\"index.html\">Back to home</a>");
		writer.print("<br>");
		writer.print("<br>");
		
		writer.print("<a href=\"contact.html\">Back to send</a>");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}

}
