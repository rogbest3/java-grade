package com.grade.web.services;

import com.grade.web.domains.GradeBean;

public interface GradeService {
	
	public void createGrade(GradeBean param);
	public String createHakbun(GradeBean param);
	public int gradeSum(GradeBean param);
	public int gradeAvg(GradeBean param);
	public boolean exist(GradeBean param);
}
