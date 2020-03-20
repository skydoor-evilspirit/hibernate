package com.duing.dao;

import com.duing.domain.Book;
import com.duing.util.HibernateUtil;
import org.hibernate.Session;

import java.io.Serializable;

public class BookDao {

    public void t1(){
        Book book = new Book();
        book.setName("斗破苍器");
        book.setLabel("玄幻");
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Serializable id = session.save(book);
        session.getTransaction().commit();
        System.out.println(id);
    }





}
