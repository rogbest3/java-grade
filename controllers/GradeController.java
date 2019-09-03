package com.grade.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.web.domains.GradeBean;
import com.grade.web.serviceimpls.GradeServiceImpl;
import com.grade.web.services.GradeService;


@WebServlet("/grade.do")
public class GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("전송 ok");
		//ssn, name, kor, eng, math, soc
		String ssn = request.getParameter("ssn");
		String name = request.getParameter("name");
		String kor = request.getParameter("kor");
		String eng = request.getParameter("eng");
		String math = request.getParameter("math");
		String soc = request.getParameter("soc");
		System.out.println(ssn);
		GradeBean param = new GradeBean();
		param.setEng(eng);
	//	param.setHakbun(hakbun);
		param.setKor(kor);
		param.setMath(math);
		param.setName(name);
		param.setSoc(soc);
		param.setSsn(ssn);
		GradeService service = new GradeServiceImpl();
	//	System.out.println(param.getSsn());
		service.createGrade(param);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
