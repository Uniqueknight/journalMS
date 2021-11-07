import com.example.journalMS.dao.impl.journalDaoImpt;
import com.example.journalMS.dao.impl.loginAdminImpt;
import com.example.journalMS.dao.impl.userInfoDaoImpt;
import com.example.journalMS.domain.admin;
import com.example.journalMS.domain.journal;
import com.example.journalMS.domain.user;
import com.example.journalMS.domain.userInfo;
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


    @Test
    public void jadd(){
        journal jour = new journal("fefe","eff","efef","fefe","wfewef","wfefew");
        new journalDaoImpt().save(jour);
    }
    @Test
    public void jget(){
        journal jour = new journal("fefe","eff","efef","fefe","wfewef","wfefew");
        System.out.println(new journalDaoImpt().get("fefe"));
    }

    @Test
    public void jup(){
        journal jour = new journal("fefe","CHANGE","efef","fefe","wfewef","wfefew");
        new journalDaoImpt().update("fefe",jour);
    }
    @Test
    public void jde(){
        new journalDaoImpt().delete("fefe");
    }


    @Test
    public void uiadd(){
        userInfo info = new userInfo("fefe","eff","efef","fefe","wfewef","wfefew","ewfwef");
        new userInfoDaoImpt().save(info);
    }
    @Test
    public void uiget(){
        userInfo info = new userInfo("fefe","eff","efef","fefe","wfewef","wfefew","ewfwef");
        System.out.println(new userInfoDaoImpt().get("fefe"));
    }

    @Test
    public void uiup(){
        userInfo info = new userInfo("fefe","CHANGE","efef","fefe","wfewef","wfefew","ewfwef");
        new userInfoDaoImpt().update("fefe",info);
    }
    @Test
    public void uide(){
        new userInfoDaoImpt().delete("fefe");
    }








}
