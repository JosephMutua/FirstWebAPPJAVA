package com.FirstWebAPPJAVA;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{

	public void service (HttpServletRequest req, HttpServletResponse res) 
	
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num1"));
		
		int k = i+j;
	}

}
