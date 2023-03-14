package com.interfaces;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/interfaceDemo")
public class InterfaceDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public InterfaceDemo() {
        super();
    }
    
    ServletConfig config=null;
	
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
        System.out.println("Initialization complete");

	}

	public void destroy() {
        System.out.println("In destroy() method");
	}

	
	public ServletConfig getServletConfig() {
		return config;
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter pwriter=response.getWriter();
        pwriter.print("<html>");
        pwriter.print("<body>");
        pwriter.print("In the service() method<br>");
        pwriter.print("</body>");
        pwriter.print("</html>");

	}

}
