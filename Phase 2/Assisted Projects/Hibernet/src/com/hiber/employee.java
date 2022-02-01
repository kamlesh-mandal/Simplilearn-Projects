package com.hiber;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee {
	@Id
	int empno;
	@Column
	String ename;
	String Eemail;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEemail() {
		return Eemail;
	}
	public void setEemail(String eemail) {
		Eemail = eemail;
	}
	/*public String toString{
		return ;*/
	}
}
