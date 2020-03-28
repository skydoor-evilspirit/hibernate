package com.duyi.dao;

import com.duyi.domain.Man;
import com.duyi.domain.Wife;
import com.duyi.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ManDao {

    public Session session = HibernateUtil.getSession();

    public void save(){
        Wife wife1 = new Wife(105L,"小雨点",14,null);
        Wife wife2 = new Wife(106L,"唐晓敏",16,null);
        Wife wife3 = new Wife(107L,"司徒冬夏",26,null);
        Wife wife4 = new Wife(108L,"病小姐",24,null);
        Man man1 = new Man(3L,"张狂",18);
        Man man2= new Man(4L,"夏宇",20);
        HashSet<Wife> set1 = new HashSet<>();
        set1.add(wife3);
        set1.add(wife4);
        HashSet<Wife> set2 = new HashSet<>();
        set2.add(wife1);
        set2.add(wife2);
        man1.setWifeSet(set1);
        man2.setWifeSet(set2);

        wife1.setMan(man2);
        wife2.setMan(man2);
        wife3.setMan(man1);
        wife4.setMan(man1);

        session.beginTransaction();
        session.save(man1);
        session.save(man2);
        session.getTransaction().commit();
    }
    public void save2(){
        Man man1 = new Man(5L,"丧尸强",18);
        Wife wife3 = new Wife(333L,"孔雀",26,null);
        Wife wife4 = new Wife(444L,"萧凤",24,null);
        HashSet<Wife> set1 = new HashSet<>();
        set1.add(wife3);
        set1.add(wife4);
        man1.setWifeSet(set1);

        session.beginTransaction();
        session.save(man1);
        session.getTransaction().commit();
    }
    public void find(){
        Query query = session.createQuery("from Man m left join fetch m.wifeSet");
//        Query query = session.createQuery("from Man");
        List<Man> list = query.list();
//        Criteria criteria = session.createCriteria(Man.class);
//        List<Man> list = criteria.list();
        HashSet<Man> set = new HashSet<>(list);
        for (Man man:set){
            System.out.println(man.getMname());
            Set<Wife> wifeSet = man.getWifeSet();
            for (Wife wife:wifeSet){
                System.out.println(man.getMname()+"的老婆是："+wife.getWname());
            }
        }
    }
















}
