package Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Model.Student;

public class StudentDoa {
	 private SessionFactory factory;

	public StudentDoa() {
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
	}

	@SuppressWarnings("deprecation")
	public void saveStudent(Student student) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();
	}
	public void deleteStudent(int rollNumber) {
		Session session=factory.openSession();
		Transaction tx= session.beginTransaction();
		Student student = session.get(Student.class, rollNumber);
		session.delete(student);
		tx.commit();
		session.clear();
	}
	public Student showStudent(int rollNumber) {
		Session session = factory.openSession();
		Student student = session.get(Student.class,rollNumber);
		session.close();
		return student;
		
	}
	public void updateStudent(Student student) {
		Session session= factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(student);
		tx.commit();
		session.close();
	}

}
