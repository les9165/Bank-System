package lms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lms.service.LmsService;

public class LoginController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String option = request.getParameter("option");
		
		LmsService s = LmsService.getInstance();
		boolean result = s.Studentlogin(id, pwd);
		String path = null;
		if(option.equals("professor"))
		{
			HttpSession session = request.getSession();
			session.setAttribute("id",id);
			path = "/ProfMenu.jsp";
			
		}else if(option.equals("student"))
		{
			path = "/StudentMenu.jsp";
		}
	
		HttpUtil.forward(request, response, path);
		
	}

	}


