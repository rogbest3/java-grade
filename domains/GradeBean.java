package com.grade.web.domains;

import java.io.Serializable;

public class GradeBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private String kor, eng, math, soc;
	private int sum, avg;
	
	
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


	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	public int getAvg() {
		return avg;
	}


	public void setAvg(int avg) {
		this.avg = avg;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "성적 정보 [ 국어=" + kor + ", "
						+ "영어=" + eng + ", "
						+ "수학=" + math + ", "
						+ "사회=" + soc + "]";
	}
	
	
}
