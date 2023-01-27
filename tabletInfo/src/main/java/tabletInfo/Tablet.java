package tabletInfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3, urlPatterns = "/health")
public class Tablet extends HttpServlet {

	public Tablet() {
		System.out.println("created " + this.getClass().getSimpleName());
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Running init in tablet..");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do get in tablet...");
		
		String name = req.getParameter("tablet name");
		String color = req.getParameter("color");
		String size = req.getParameter("size");
		String price = req.getParameter("price");
		String shape = req.getParameter("shape");
		String capacity = req.getParameter("capacity");
		String weight = req.getParameter("weight");
		String withCover = req.getParameter("withCover");
		String tabCode = req.getParameter("tabCode");
		String safe = req.getParameter("safe");
		String whenTotake = req.getParameter("whenTotake");
		String taste = req.getParameter("taste");
		String users = req.getParameter("users");
		String ingredients = req.getParameter("ingredients");
		String quantity = req.getParameter("quantity");
		String company = req.getParameter("company");
		String place = req.getParameter("place");
		String cure = req.getParameter("cure");
		String available = req.getParameter("available");
		String forms = req.getParameter("forms");
		
		System.out.println(name);
		System.out.println(color);
		System.out.println(size);
		System.out.println(price);
		System.out.println(shape);
		System.out.println(capacity);
		System.out.println(weight);
		System.out.println(withCover);
		System.out.println(tabCode);
		System.out.println(safe);
		System.out.println(whenTotake);
		System.out.println(taste);
		System.out.println(users);
		System.out.println(ingredients);
		System.out.println(quantity);
		System.out.println(company);
		System.out.println(place);
		System.out.println(cure);
		System.out.println(available);
		System.out.println(forms);
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:Purple;'>");
		writer.print("tablet info "+ name +" is sent succussfully...");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}
}
