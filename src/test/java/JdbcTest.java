import com.example.journalMS.dao.impl.loginAdminImpt;
import com.example.journalMS.domain.admin;
import com.example.journalMS.domain.user;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import com.example.journalMS.dao.impl.loginUserImpt;

public class JdbcTest {


    @Before
    public void bfrun(){

    }


    @Test
    public void savetest(){
        new loginAdminImpt().save(new admin("QQQQ","QQQQ","QQQQQ"));
    }

    @Test
    public void updatetest(){
        new loginAdminImpt().update("QQQQ",new admin("QWWWWQfwefwef","wefwef","QQQQsdvQ"));
    }

    @Test
    public void gettest(){
        admin n =  new loginAdminImpt().get("QWWWWQfwefwef");
        System.out.print(n);
    }

    @Test
    public void getAll(){
        admin n =  new loginAdminImpt().get("QWWWWQfwefwef");
        System.out.print(n);
    }


    @Test
    public void addTestAdm(){
        new loginAdminImpt().save(new admin("wwww","asda","qqq"));
    }














}
