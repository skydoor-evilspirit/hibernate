package com.duing.dao;

import com.duing.domain.Car;
import com.duing.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CarDao {

    Session session = HibernateUtil.getSession();

    public Car findOneWithGet(long id){
        Car car = session.get(Car.class, id);
        return car;
    }
    public Car findOneWithLoad(long id){
        Car car = session.load(Car.class, id);
        return car;
    }
    public void save(Car car){
        session.beginTransaction();
        session.save(car);
        session.getTransaction().commit();
    }
    public void update(Car car){
        session.beginTransaction();
        session.update(car);
        session.getTransaction().commit();
    }
    public void update2(Car car){
        session.beginTransaction();
        session.save(car);
        session.getTransaction().commit();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        session.beginTransaction();
        car.setColor("紫色");
        session.getTransaction().commit();
    }
    public void saveOrUpdate1(Car car){
        session.beginTransaction();
        session.saveOrUpdate(car);
        session.getTransaction().commit();
    }
    public void saveOrUpdate2(long id){
        Car car1 = session.get(Car.class, id);
        System.out.println(car1);
        Car car2 = new Car(id, "吉普", "乳白色");
        session.beginTransaction();
        session.saveOrUpdate(car2);
        session.getTransaction().commit();
    }
    public void merge(long id){
        Car car1 = session.get(Car.class, id);
        System.out.println(car1);
        Car car2 = new Car(id, "吉普", "乳白色");
        session.beginTransaction();
        session.merge(car2);
        session.getTransaction().commit();
    }
    public void delete1(){
        Car car = new Car();
        car.setId(5);
        session.beginTransaction();
        session.delete(car);
        session.getTransaction().commit();
    }
    public void delete2() {
        Car car = new Car(4,"奇瑞QQ","大红色");
        session.beginTransaction();
        session.update(car);
        session.getTransaction().commit();

        session.beginTransaction();
        session.delete(car);
        session.getTransaction().commit();
    }
    public void save(){

    }

}
