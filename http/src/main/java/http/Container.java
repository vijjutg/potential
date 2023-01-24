package http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 9, urlPatterns = "/method")
public class Container extends HttpServlet {

	public Container() {
		System.out.println("created  " + this.getClass().getSimpleName());
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Running init ....");
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do delete....");
		String data = "Dispaying data as do delete";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do get....");
		String data = "Dispaying data as do get";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do head....");
		String data = "Dispaying data as do head";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do options....");
		String data = "Dispaying data as do options";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do post....");
		String data = "Dispaying data as do post";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do put....");
		String data = "Dispaying data as do put";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
	}

	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do trace....");
		String data = "Dispaying data as do post";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
	}

}
