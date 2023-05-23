package com.ssd.hibernate.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Students")
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String sname;
	private String branch;
	
	
	public Students() {
		
	}
	public Students(int sid, String sname, String branch) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.branch = branch;
		
	}

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}





	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", branch=" + branch + "]";
	}
	
	
	
	
	

}
