package com.grade.web.serviceimpls;

import java.util.Random;

import com.grade.web.daoimpls.GradeDAOImpl;
import com.grade.web.daos.GradeDAO;
import com.grade.web.domains.GradeBean;
import com.grade.web.services.GradeService;

public class GradeServiceImpl implements GradeService{

	GradeDAO dao;
	public GradeServiceImpl() {
		dao = new GradeDAOImpl();
	}
	
	@Override
	public void createGrade(GradeBean param) {
		param.setHakbun(createHakbun(param));
		param.setSum(gradeSum(param));
		param.setAvg(gradeAvg(param));
		dao.insertHakbun(param);
	}
	
	@Override
	public String createHakbun(GradeBean param) {
		Random random = new Random();
		String hakbun = "2019-";
		hakbun += param.getSsn().substring(7,8) + String.format("%03d", random.nextInt(999)+1);
	//	System.out.println(hakbun);
		return hakbun;
	}

	@Override
	public int gradeSum(GradeBean param) {
		int sum = 0;
		sum = Integer.parseInt(param.getKor()) + Integer.parseInt(param.getEng()) 
			+ Integer.parseInt(param.getMath()) + Integer.parseInt(param.getSoc());
		return sum;
	}

	@Override
	public int gradeAvg(GradeBean param) {
	 	return gradeSum(param)/4;
	}
	
	@Override
	public boolean exist(GradeBean param) {
		boolean flag = false;

		return flag;
	}
}
