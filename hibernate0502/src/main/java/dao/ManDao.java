package dao;

import domain.Man;
import domain.Wife;

import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ManDao {

    public void save(){
        Wife wife1 = new Wife(null,"xyd",16,null);
        Wife wife2 = new Wife(null,"xqz",17,null);
        Wife wife3 = new Wife(null,"lqy",26,null);

        HashSet<Wife> set = new HashSet<>();
        set.add(wife1);
        set.add(wife2);
        set.add(wife3);

        Man man = new Man(null,"dzh","cxy",set);
        wife1.setMan(man);
        wife2.setMan(man);
        wife3.setMan(man);

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(man);
        session.getTransaction().commit();
    }

    public void select(){
        Session session = HibernateUtil.getSession();
//        Man man1 = session.get(Man.class, 1L);
        Query query = session.createQuery("from Man m left join fetch m.wifes");
        List<Man> list = query.list();
        HashSet<Man> set = new HashSet<>(list);
        for (Man man:set){
            Set<Wife> wifes = man.getWifes();
            System.out.println(man.getMname());
            for (Wife w:wifes) {
                System.out.println(man.getMname() + "的老婆是" +w.getWname());
            }
        }




    }

}
