package dao;

import java.util.*;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Busdetails;
import pojo.Register;
import pojo.Travel;
import utils.HibernateUtils;

public class RedDao 
{
 public void registerUser(Register reg)
 {
	 //i am doing my redBus
	 //this is to check for changes
	 Session session = HibernateUtils.getSession();
	 Transaction tx = session.beginTransaction();
	 session.save(reg);
	 tx.commit();
	 session.close();
 }
 
 public boolean loginUser(Register reg)
 {
	 System.out.println("reg.mail"+reg.getEmail());
	 Session session  = HibernateUtils.getSession();
	 Transaction tx = session.beginTransaction();
//	 Query query = session.createQuery("from Register where email = '"+reg.getEmail()+"'");
	 Query query = session.createQuery("from Register where email=:email1 and password=:pass1 ");
	 query.setParameter("email1", reg.getEmail());
	 query.setParameter("pass1", reg.getPassword());
	 Register reg1 = (Register) query.uniqueResult();
	 tx.commit();
	 session.close();
	 if(reg1!= null)
	 {
		 System.out.println("in reg1 not null");
		 System.out.println("name is:"+reg1.getName());
		 return true;
	 }
	 System.out.println("name is:null");
	 return false;
 }
 public List<Busdetails> searchBus(Travel travel)
 {
	 
	 
	 Session session = HibernateUtils.getSession();
	 int id;
	 Transaction tx = session.getTransaction();
	 tx.begin();
	 Query query = session.createQuery("from Travel where sourc=:source and destination=:dest");
	 query.setParameter("source", travel.getSourc());
	 query.setParameter("dest", travel.getDestination());
	 Travel tr = (Travel) query.uniqueResult();
	 System.out.println("travel id is:"+tr.getTravelId());
	 
	 List<Busdetails> bus = session.createQuery("from Busdetails where travelId='"+tr.getTravelId()+"'").list();
	 Iterator<Busdetails>itr = bus.iterator();
	 while(itr.hasNext())
	 {
		 Busdetails busdetails = itr.next();
		 System.out.println("travelname is-"+busdetails.getTravelName());
		 System.out.println("travel time is-"+busdetails.getFare());
	 }
	 return bus;
 }
 
}
