import com.chinasoft.jpa.AppConfiguration;
import com.chinasoft.jpa.domain.User;
import com.chinasoft.jpa.respository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppConfiguration.class)
public class DemoTest {
    @Autowired
    private UserRepository userDao;
    @Test
    public void test() {
     //User u=new User();
     // u.setUserNick("admin");
      //userDao.save(u);
     // User u=userDao.findAll();
       // System.out.println(userDao.findAll().size());
     List<User> list=userDao.findAll();
     for(int i=0;i<list.size();i++){
         User u=list.get(i);
         System.out.println(u.getUserNick());
     }
    }

}
