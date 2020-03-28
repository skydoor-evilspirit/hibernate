package com.duyi.dao;

import com.duyi.domain.Student;
import com.duyi.domain.Teacher;
import com.duyi.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentDao {

    public void save(){
        Student student1 = new Student(null,"张狂");
        Student student2 = new Student(null,"夏宇");
        Teacher teacher1 = new Teacher(null,"语文老师",10000);
        Teacher teacher2 = new Teacher(null,"数学老师",20000);
        Teacher teacher3 = new Teacher(null,"英语老师",30000);
        Teacher teacher4 = new Teacher(null,"历史老师",40000);

        //将老师赋值给学生,保存学生的同时保存学生
        HashSet<Teacher> set1 = new HashSet<>();
        set1.add(teacher1);
        set1.add(teacher4);
        HashSet<Teacher> set2 = new HashSet<>();
        set2.add(teacher1);
        set2.add(teacher2);
        set2.add(teacher3);
        set2.add(teacher4);
        student1.setTs(set1);
        student2.setTs(set2);

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(student1);
        session.save(student2);
        session.getTransaction().commit();
    }
    public void select(){
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("from Student");
        List<Student> list = query.list();
        HashSet<Student> set = new HashSet<>(list);
        for (Student s:set){
            System.out.println(s.getSname());
            Set<Teacher> ts = s.getTs();
            for (Teacher t:ts){
                System.out.println(s.getSname()+"的老师是"+t.getTname());
            }
            System.out.println("=========================");
        }
    }



}
