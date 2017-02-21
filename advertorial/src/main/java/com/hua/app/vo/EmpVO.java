package com.hua.app.vo;

public class EmpVO  extends BaseVO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5534945607013510533L;
	
	//员工编号
	private String eno;
	//部门编号
	private String dno;
	//员工姓名
	private String ename;
	//员工工作
	private String job;
	//员工薪水
	private String salary;
	
	public String getEno() {
		return eno;
	}
	public void setEno(String eno) {
		this.eno = eno;
	}
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	

}
