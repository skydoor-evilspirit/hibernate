package com.duing.dao;

import com.duing.domain.Student;
import com.duing.util.HibernateUtil;
import org.hibernate.Session;

public class StudentDao {
    public void t1(){
        Student student = new Student(null,"张三","nan");
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
    }
}
