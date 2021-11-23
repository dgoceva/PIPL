package client;

import org.hibernate.Session;

import entity.Person;
import util.HibernateUtil;

public class Test {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Person person = new Person("Daniel", 22);

		session.save(person);

		session.getTransaction().commit();
		session.close();
	}

}
