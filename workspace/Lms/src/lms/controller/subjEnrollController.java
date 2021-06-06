package lms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lms.service.LmsService;
import lms.vo.StudentVO;
import lms.vo.SubjectVO;

public class subjEnrollController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int count = Integer.parseInt(request.getParameter("count"));
		String prof = request.getParameter("prof");
		
		SubjectVO subj= new SubjectVO();
		subj.setId(id);
		subj.setName(name);
		subj.setCount(count);
		subj.setProf(prof);
		
		LmsService service = LmsService.getInstance();
		service.subjEnroll(subj);
		
		request.setAttribute("id", id);
		request.setAttribute("name", name);
		request.setAttribute("count", count);
		request.setAttribute("prof", prof);
		HttpUtil.forward(request, response ,"/result/EnrollResult.jsp");
		
	}


	}
