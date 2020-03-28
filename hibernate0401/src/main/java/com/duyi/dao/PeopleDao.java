package com.duyi.dao;

import com.duyi.domain.Card;
import com.duyi.domain.People;
import com.duyi.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.io.Serializable;
import java.util.List;

public class PeopleDao {
    public void save(){
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        People people = new People(null,"张XX",18);
        Card card = new Card(null,"陕西省宝鸡市凤翔县","66666662");
        card.setPeople(people);
        people.setCard(card);
        session.save(people);
        session.getTransaction().commit();
    }
    public void update(){
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        People people = new People(1L,"王麻子",20);
        Card card = new Card(1L,"我是地址","6666",people);
        people.setCard(card);
        session.update(people);
        session.getTransaction().commit();
    }
    public void delete(){
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        People people = new People(2L,"王麻子",20);
        Card card = new Card(2L,"我是地址","6666",people);
        people.setCard(card);
        session.delete(people);
        session.getTransaction().commit();
    }
    public void select(){
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("from People");
        List<People> list = query.list();
        for (People p:list){
            System.out.println(p.getName());
            System.out.println(p.getCard().getAddress());
            System.out.println("=========================");
        }
    }
}
