package com.podkidyshev.dao;


import com.podkidyshev.entity.Student;
import com.podkidyshev.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Optional;

public class StudentDAO {
    private final Session session;

    public StudentDAO() {
        this.session = HibernateSession.getSessionFactory().openSession();
    }

    public void create(Student student) {
        session.save(student);
    }

    public void update(Student student) {
        Transaction transaction = session.beginTransaction();
        session.merge(student);
        transaction.commit();
    }

    public void delete(Student student) {
        Transaction transaction = session.beginTransaction();
        session.delete(student);
        transaction.commit();
    }

    public List<Student> getAll() {
        List<Student> students;
        Transaction transaction = session.beginTransaction();
        students = session.createQuery("FROM Student").list();
        transaction.commit();
        return students;
    }

    public Optional<Student> getById(Long id) {
        Optional result;
        Transaction transaction = session.beginTransaction();
       //  Student student = ;
         result = session.createQuery("FROM Student s WHERE s.id = :id")
                 .setParameter("id", id).uniqueResultOptional();
        transaction.commit();
        return result;
    }
}
