package com.filter;

import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;

import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginFilter")
public class LoginFilter implements Filter{
       
   
    public LoginFilter() {
     
    }

	
	public void destroy() {
	}


	protected void doFilter(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		
		LoginFilter chain = null;
		if(userId!=null)
			chain.doFilter(request,response);
	}


	@Override
	public boolean accept(Object entry) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
        // TODO Auto-generated method stub
}


	

}
