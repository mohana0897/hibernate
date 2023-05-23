package com.ssd.hibernate.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "college")
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String collagename;
	
	@OneToMany(cascade = CascadeType.ALL)
	
	private List<Students> students;
	
	public College() {
}

	public College(int cid, String collagename, List<Students> students) {
		super();
		this.cid = cid;
		this.collagename = collagename;
		this.students = students;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCollagename() {
		return collagename;
	}

	public void setCollagename(String collagename) {
		this.collagename = collagename;
	}

	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "College [cid=" + cid + ", collagename=" + collagename + ", students=" + students + "]";
	}
	
	
	
	
	

}
