import org.junit.Test;

public class AppTest {
    @Test
    public void t1() {
        try {
            Class.forName("com.duyi.util.HibernateUtil");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



}
