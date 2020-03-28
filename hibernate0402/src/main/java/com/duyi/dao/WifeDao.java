package com.duyi.dao;

import com.duyi.domain.Man;
import com.duyi.domain.Wife;
import com.duyi.util.HibernateUtil;
import org.hibernate.Session;

public class WifeDao {

    public Session session = HibernateUtil.getSession();

    public void save() {
        Man man1 = new Man(null, "蛮王", 16);
        Wife wife1 = new Wife(null, "艾希", 18, null);
        Wife wife2 = new Wife(null, "光辉", 18, null);
        wife1.setMan(man1);
        wife2.setMan(man1);
        session.beginTransaction();
        session.save(wife1);
        session.save(wife2);
        session.getTransaction().commit();




    }
}
