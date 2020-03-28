package com.duing.dao;

import com.duing.domain.Car;
import com.duing.util.HibernateUtil;
import com.sun.deploy.security.BadCertificateDialog;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.*;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import sun.plugin2.message.helper.ProxyHelper;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class CarDao {
    Session session = HibernateUtil.getSession();

    public void select1() {
        NativeQuery query = session.createNativeQuery("select * from car");
        List<Object[]> list = query.list();
        for (Object[] car : list) {
            for (Object obj : car) {
                System.out.println(obj);
            }
        }
    }

    public void select2() {
        NativeQuery query = session.createNativeQuery("select * from car");
        query.addEntity(Car.class);
        List<Car> list = query.list();
        for (Car car : list) {
            System.out.println(car);
        }
    }

    public void select3() {
        NativeQuery query = session.createNativeQuery("select * from car where id=?");
        query.setParameter(1, 1);
        Object[] result = (Object[]) query.getSingleResult();
        for (Object obj : result) {
            System.out.println(obj);
        }
    }

    public void select4() {
        NativeQuery query = session.createNativeQuery("select * from car where id=?");
        query.setParameter(1, 1);
        query.addEntity(Car.class);
        Car car = (Car) query.getSingleResult();
        System.out.println(car);
    }

    public void select5() {
        NativeQuery query = session.createNativeQuery("select * from car");
        query.addEntity(Car.class);
        query.setFirstResult(2);
        query.setMaxResults(5);
        List<Car> list = query.list();
        System.out.println(list);
    }

    /**
     * qbc查询
     * 条件查询
     * 排序查询
     * 分组查询
     * 分页查询
     * 联合查询
     */
    public void select6() {
        Criteria criteria = session.createCriteria(Car.class);
//        criteria.add(Restrictions.eq("id",1L));
//        criteria.add(Restrictions.ne("id", 1L));
//        criteria.add(Restrictions.gt("id", 1L));
//        criteria.add(Restrictions.lt("id", 2L));
//        criteria.add(Restrictions.ge("id", 1L));
//        criteria.add(Restrictions.le("id", 1L));
//        criteria.add(Restrictions.like("color","%a%"));
//        criteria.add(Restrictions.between("price",200000F,300000F));
//        criteria.add(Restrictions.and(Restrictions.ge("price", 200000F),Restrictions.le("price",300000F)));
//        criteria.add(Restrictions.or(Restrictions.ge("price", 200000F),Restrictions.le("price",300000F)));

//        criteria.addOrder(Order.asc("id"));
//        criteria.addOrder(Order.desc("id"));

//        criteria.setProjection(Projections.projectionList()
//                .add(Projections.property("id"))
//                .add(Projections.property("name"))
//                .add(Projections.property("color")));
//        criteria.setProjection(Projections.projectionList()
//                .add(Projections.count("id"))
////                .add(Projections.property("name")));
//                .add(Projections.max("price")));
//        criteria.setProjection(Projections.projectionList()
//                .add(Projections.groupProperty("name"))
//        .add(Projections.count("id"))
//        .add(Projections.max("price")));
//
//        List<Object[]> list = criteria.list();
//        for (Object[] obj : list) {
//            System.out.println(obj[0]);
//            System.out.println(obj[1]);
//        }
//        criteria.setFirstResult(0);
//        criteria.setMaxResults(2);
//        List<Car> list = criteria.list();
//        for (Car car : list) {
//            System.out.println(car);
//        }
//        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Car.class);
//        detachedCriteria.setProjection(Projections.projectionList()
//                .add(Projections.max("price")));
//        criteria.add(Property.forName("price").eq(detachedCriteria));
//        List<Car> list = criteria.list();
//        for (Car car : list) {
//            System.out.println(car);
//        }
    }

    /**
     * hql查询
     */
    public void select7(){
        Query query = session.createQuery("from Car");
        List<Car> list = query.list();
        System.out.println(list);
    }
    public void select8(){
        Query query = session.createQuery("from Car where cno=?1");
        query.setParameter(1, 4L);
        Car car = (Car) query.getSingleResult();
        System.out.println(car);
    }
    public void select9(){
        Query query = session.createQuery("from Car where cno=:cno");
        query.setParameter("cno", 4L);
        Car car = (Car) query.getSingleResult();
        System.out.println(car);
    }
    public void select10(){
        Query query = session.createQuery("from Car where cno=:cno");
        query.setParameter("cno", 4L);
        Car car = (Car) query.getSingleResult();
        System.out.println(car);
    }
    public void select11(){
        Query query = session.createQuery("select count(id),avg(price) from Car");
        List<Object[]> list = query.list();
        for (Object[] obj:list){
            System.out.println(obj[0]);
            System.out.println(obj[1]);
        }
    }
    public void select12(){
        Query query = session.createQuery("from Car");
        query.setFirstResult(0);
        query.setMaxResults(2);
        List<Car> list = query.list();
        System.out.println(list);
    }
    public void update13(){
        session.beginTransaction();
        Query query = session.createQuery("update Car set price=price+999");
        int i = query.executeUpdate();
        session.getTransaction().commit();
        System.out.println(i);
    }

    /**
     * jpa查询
     */
    public void select14(){
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Car> query = builder.createQuery(Car.class);
        Root<Car> table = query.from(Car.class);
         query.select(table);
        List<Car> list = session.createQuery(query).list();
        System.out.println(list);

    }







}
