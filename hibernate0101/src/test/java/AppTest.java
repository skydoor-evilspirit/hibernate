import com.duing.dao.CarDao;
import com.duing.domain.Car;
import org.junit.Test;

public class AppTest {
    @Test
    public void test(){
        CarDao dao = new CarDao();
        Car car = new Car(1,"宝马","yellow");
        dao.save(car);
        System.out.println("保存成功");

    }
}
