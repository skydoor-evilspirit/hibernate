import dao.ManDao;
import org.junit.Test;
import util.HibernateUtil;

public class AppTest {

    private ManDao dao = new ManDao();

    @Test
    public void t1(){
        dao.save();
    }
    @Test
    public void t2(){
        dao.select();
    }


}
