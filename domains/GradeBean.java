package com.grade.web.domains;

import java.io.Serializable;

public class GradeBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private String hakbun, ssn, name;
	private String kor, eng, math, soc;
	private int sum, avg;
	
	
	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public String getSoc() {
		return soc;
	}

	public void setSoc(String soc) {
		this.soc = soc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "성적 정보 [ 학번=" + hakbun + ","
						+ "주민번호=" + ssn + ", "
						+ "이름=" + name + ", "
						+ "국어=" + kor + ", "
						+ "영어=" + eng + ", "
						+ "수학=" + math + ", "
						+ "사회=" + soc + "]";
	}
	
	
}
