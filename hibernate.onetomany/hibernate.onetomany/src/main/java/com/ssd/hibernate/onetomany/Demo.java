package com.ssd.hibernate.onetomany;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class Demo {
	
public static void main(String[] args) {
		
		Transaction transaction = null;
		
		try (Session session = Hbutility.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();
			
		
//			College clg=new College();
//			clg.setCollagename("Aditya");
//			
//			Students st1=new Students();
//			st1.setSname("sai");
//			st1.setBranch("civil");
//
//			Students st2=new Students();
//			st2.setSname("koti");
//			st2.setBranch("eee");
//			
//			List<Students> slist=new ArrayList<>();
//			slist.add(st2);
//			slist.add(st1);
//			
//			clg.setStudents(slist);
//			
//			session.persist(clg);
//			session.persist(st1);
//			session.persist(st2);
			
			
			Query q=session.createQuery("FROM College");
			List<College> clist=q.getResultList();
			
			System.out.println(clist);
			
			
			transaction.commit();
			
			
			
		}catch (Exception e) {
			if (transaction != null) {

				transaction.rollback();
			}
		}
		
		
		
	}

}
