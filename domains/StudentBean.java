package com.grade.web.domains;

import java.io.Serializable;

public class StudentBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String hakbun, ssn, name;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "학생 정보 [학번=" + hakbun + ", 주민번호=" + ssn + ", 이름=" + name + "]";
	}
	
}

