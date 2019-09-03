package com.grade.web.daoimpls;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.grade.web.daos.GradeDAO;
import com.grade.web.domains.GradeBean;
public class GradeDAOImpl implements GradeDAO {
	public static final String  FILE_PATH = String.format("C:%sUsers%suser%seclipse-jee%sjee-grade%sWebContent%sresources%stxt%s", 
			File.separator,File.separator,File.separator,File.separator,
			File.separator,File.separator,File.separator,File.separator);
	
	@Override
	public void insertHakbun(GradeBean param) {
		try {
			File file = new File(FILE_PATH + "hakbun.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(param.toString());
			writer.newLine();
			writer.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
