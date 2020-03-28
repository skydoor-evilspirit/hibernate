import com.duyi.dao.StudentDao;
import com.duyi.dao.TeacherDao;
import org.junit.Test;

public class AppTest {
    StudentDao studentDao=new StudentDao();
    TeacherDao teacherDao = new TeacherDao();
    @Test
    public void t1(){
        studentDao.save();
    }
    @Test
    public void t2(){
        teacherDao.save();
    }
    @Test
    public void t3(){
        studentDao.select();
    }






}
