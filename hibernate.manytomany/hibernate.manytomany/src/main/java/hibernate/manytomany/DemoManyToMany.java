package hibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class DemoManyToMany {
	
public static void main(String[] args) {
		
		Transaction transaction = null;
		
		try (Session session = Hbuntility.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();
			
			Que q=new Que();
			q.setQue("diff type of colors?");
			
			Ans A=new Ans();
			A.setAnswers("Orange");
			
			Ans A1=new Ans();
			A1.setAnswers("Red");
			
			Ans A2=new Ans();
			A2.setAnswers("Blue");
			
			List<Ans> Anslist=new ArrayList();
			Anslist.add(A);
			Anslist.add(A1);
			Anslist.add(A2);
			
			q.setAns(Anslist);
			
			session.save(q);
			session.save(A);
			session.save(A1);
			session.save(A2);
			
			transaction.commit();
			
			
			
		}catch (Exception e) {
			if (transaction != null) {

				transaction.rollback();
			}
		}
		
		
		
	}

}
