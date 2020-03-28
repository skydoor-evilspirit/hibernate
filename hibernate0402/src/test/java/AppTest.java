import com.duyi.dao.ManDao;
import com.duyi.dao.WifeDao;
import org.junit.Test;

public class AppTest {
    ManDao dao = new ManDao();
    WifeDao wifeDao = new WifeDao();

    @Test
    public void t1(){
        dao.save();
    }
    @Test
    public void t2(){
        dao.save2();
    }
    @Test
    public void t3(){
        dao.find();
    }
    @Test
    public void t4(){
        wifeDao.save();
    }
}
