package lms.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lms.service.LmsService;
import lms.vo.SubjectVO;

public class ListController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LmsService service = LmsService.getInstance();
		ArrayList<SubjectVO> list = service.subjList();
		
		request.setAttribute("list", list);
		HttpUtil.forward(request, response, "/result/ListResult(s).jsp");
	}

	}


