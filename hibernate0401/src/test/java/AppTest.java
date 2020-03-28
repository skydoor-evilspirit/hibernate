import com.duyi.dao.PeopleDao;
import org.junit.Test;

public class AppTest {
    public PeopleDao dao=new PeopleDao();

    @Test
    public void t1(){
        dao.save();
    }

    @Test
    public void t2(){dao.update();}
    @Test
    public void t3(){dao.delete();}
    @Test
    public void t4(){
        dao.select();
    }
}
