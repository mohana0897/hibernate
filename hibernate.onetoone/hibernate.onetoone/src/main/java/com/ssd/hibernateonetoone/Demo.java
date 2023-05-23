package com.ssd.hibernateonetoone;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Demo {
	
	public static void main(String[] args) {
		
		Transaction transaction = null;
		
		try (Session session = Hbutility.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();
			
//			Employee e1=new Employee();
//			e1.setEname("koti");
//			e1.setSal(10000.00);
//			
//			Address ad=new Address();
//			ad.setCity("vzm");
//			ad.setStreet("a2");
//			ad.setPin(563789);
//			ad.setEmployee(e1);
//			
//			e1.setAddress(ad);
//			
//			
//			Employee e2=new Employee();
//			e2.setEname("sai");
//			e2.setSal(20000.00);
//			
//			Address ad2=new Address();
//			ad2.setCity("rjy");
//			ad2.setStreet("pkm");
//			ad2.setPin(563489);
//			ad2.setEmployee(e2);
//			
//			e2.setAddress(ad2);
//			
//			
//			session.save(e1);
//			session.save(e2);
//			
//			transaction.commit();
			
			
			
			Query q=session.createQuery("FROM Address");
			List<Address> clist=q.getResultList();
			
			System.out.println(clist);
			
			
			transaction.commit();
		
		
		}catch (Exception e) {
			// TODO: handle exception
			if (transaction != null) {

				transaction.rollback();
			}
		}
		
		
	}

}
