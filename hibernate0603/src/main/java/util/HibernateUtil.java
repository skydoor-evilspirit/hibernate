package util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory factory;

    static{
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        factory = config.buildSessionFactory();
    }

    public static Session getSession(){
        return factory.openSession();
    }










}
