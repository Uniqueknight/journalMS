import com.example.journalMS.dao.impl.jourUserDaoImpt;
import com.example.journalMS.dao.impl.journalDaoImpt;
import com.example.journalMS.domain.journal;
import com.example.journalMS.domain.payment;
import com.example.journalMS.domain.userInfo;
import com.example.journalMS.service.impl.uCenterServiceImpt;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JdbcAdTest {

    @Before
    public void beforeDo(){
        journalDaoImpt journalDaoImpt = new journalDaoImpt();
        jourUserDaoImpt jourUserDaoImpt = new jourUserDaoImpt();

    }

    @Test
    public void testJourUserSelect(){
        journalDaoImpt journalDaoImpt = new journalDaoImpt();
        jourUserDaoImpt jourUserDaoImpt = new jourUserDaoImpt();
        uCenterServiceImpt uCenterServiceImpt = new uCenterServiceImpt();
        List<journal> root = uCenterServiceImpt.getUserJournal("root");
        System.out.println(root);

    }

    @Test
    public void testAddJournal(){
        new uCenterServiceImpt().addJournal("r32","root");

        System.out.println();;
    }

    @Test
    public void testDeleteJournal(){
        new uCenterServiceImpt().deleteJournal("r32","root");
    }

    @Test
    public void testChangeUserInfo(){
        userInfo userInfo = new userInfo("test", "testChange", "ew", "ew", "ew", "ew", "ew");
        new uCenterServiceImpt().changeUserInfo(userInfo);
    }

    @Test
    public void testPayment(){
        List<payment> root = new uCenterServiceImpt().getPayment("root");
        System.out.println(root);
    }

}
