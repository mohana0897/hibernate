package hibernate.manytomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ans")
public class Ans {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	
	private String answers;
	
	public Ans() {
		
	}

	public Ans(int aid, String answers) {
		super();
		this.aid = aid;
		this.answers = answers;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Ans [aid=" + aid + ", answers=" + answers + "]";
	}
	
	

}
