package webSeriesInfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/film")
public class WebSeries extends HttpServlet {

	public WebSeries() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init in web series..."); 
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do get in web series...");
		
		String name = req.getParameter("Webseries name");
		String lang = req.getParameter("Language");
		String episodes = req.getParameter("Episodes");
		String ott = req.getParameter("Ott Platform");
		String budget = req.getParameter("Budget");
		
		System.out.println(name);
		System.out.println(lang);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:green;'>");
		writer.print("Webseries info "+ name +" is sent succussfully...");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}
	
}
