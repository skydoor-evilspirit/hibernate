package com.duyi.dao;

import com.duyi.domain.Student;
import com.duyi.domain.Teacher;
import com.duyi.util.HibernateUtil;
import org.hibernate.Session;

import java.util.HashSet;

public class TeacherDao {
    public void save(){
        Student student1 = new Student(null,"张狂");
        Student student2 = new Student(null,"夏宇");
        Teacher teacher = new Teacher(null,"语文老师",10000);
        HashSet<Student> set = new HashSet<>();
        set.add(student1);
        set.add(student2);
        teacher.setSs(set);
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(teacher);
        session.getTransaction().commit();

    }
}
