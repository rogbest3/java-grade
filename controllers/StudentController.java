package com.grade.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.web.domains.StudentBean;
import com.grade.web.serviceimpls.StudentServiceImpl;
import com.grade.web.services.StudentService;
import com.grade.web.pool.Constans;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/student.do")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		switch (request.getParameter("action")) {
		case "move":
			request.getRequestDispatcher
					(String.format("WEB-INF/views/%s/%s.jsp", 
					"student", request.getParameter("dest")))
					.forward(request, response);
			break;

		case "login" :
			System.out.println("login 진입");
			
			break;

		case "register" :	//hakbun ssn name
			System.out.println("register 진입");
			String hakbun = request.getParameter("hakbun");
			String ssn = request.getParameter("ssn");
			String name = request.getParameter("name");
			StudentBean param = new StudentBean();
			param.setHakbun(hakbun);
			param.setName(name);
			param.setSsn(ssn);
			StudentService service = new StudentServiceImpl();
			System.out.println(param);
			
			request.getRequestDispatcher
					(String.format("WEB-INF/views/%s/%s.jsp",
					"student", request.getParameter("dest")))
					.forward(request, response);
			
			break;
		}
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
