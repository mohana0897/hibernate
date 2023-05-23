package hibernate.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="que")
public class Que {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int qid;
	private String que;
	
	@ManyToMany
	@JoinTable (name="que_Ans", 
	joinColumns = {@JoinColumn(name="qid")} ,
	inverseJoinColumns  ={@JoinColumn(name="aid")})
	private List<Ans> ans;
	
	public Que() {
		
	}

	public Que(int qid, String que, List<Ans> ans) {
		super();
		this.qid = qid;
		this.que = que;
		this.ans = ans;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQue() {
		return que;
	}

	public void setQue(String que) {
		this.que = que;
	}

	public List<Ans> getAns() {
		return ans;
	}

	public void setAns(List<Ans> ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Que [qid=" + qid + ", que=" + que + ", ans=" + ans + "]";
	}
	
	

}
