import com.duing.dao.BookDao;
import com.duing.dao.CarDao;
import com.duing.dao.StudentDao;
import com.duing.domain.Car;
import org.junit.Test;

public class AppTest {
    CarDao dao = new CarDao();
    BookDao bookdao=new BookDao();
    StudentDao studentDao = new StudentDao();

    @Test
    public void test1(){
        Car car = dao.findOneWithGet(3);
        System.out.println("=========================");
        System.out.println(car.getClass().getName());
        System.out.println(car);
    }
    @Test
    public void test2(){
        Car car = dao.findOneWithLoad(1);
        System.out.println("==========================");
        System.out.println(car.getClass().getName());
        System.out.println(car);
    }
    @Test
    public void t3(){
        Car car = new Car(3,"红旗","军绿色");
        dao.save(car);
    }
    @Test
    public void t4(){
        Car car = new Car(1,"宝马","黄色");
        dao.update(car);
    }
    @Test
    public void t5(){
        Car car = new Car(4,"保时捷","红色");
        dao.update2(car);
    }
    @Test
    public void t6(){
        Car car = new Car(5, "捷豹", "粉红色");
        dao.saveOrUpdate1(car);
    }
    @Test
    public void t7(){
        Car car = new Car(5, "捷豹", "pick");
        dao.saveOrUpdate1(car);
    }
    @Test
    public void t8(){
        dao.saveOrUpdate2(5);
    }
    @Test
    public void t9(){
        dao.merge(5);
    }
    @Test
    public void t10(){
        dao.delete1();
    }
    @Test
    public void t11(){
        dao.delete2();
    }
    @Test
    public void t12(){
        bookdao.t1();
    }
    @Test
    public void t13(){
        studentDao.t1();
    }

}
