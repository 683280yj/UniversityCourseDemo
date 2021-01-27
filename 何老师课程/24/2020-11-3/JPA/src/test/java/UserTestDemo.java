import com.chinasoft.jpa.domain.AppConfiguration;
import com.chinasoft.jpa.domain.domain.User;
import com.chinasoft.jpa.domain.respository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppConfiguration.class)
//@ContextConfiguration(classes = {UserTestDemo.class})
public class UserTestDemo {
    @Autowired
    private UserRepository userDao;

    @Test
    public void test() {
//        User u = new User();
//        userDao.save(u);
//        System.out.println(userDao.findAll().size());
        //查询
//        List<User> list=userDao.findAll();
//        for (int i=0;i<list.size();i++){
//            User u=list.get(i);
//            System.out.println("id:"+u.getUserId()+"name:"+u.getUserNick());
//        }
        //增加
//        User u = new User();
//        u.setUserNick("aaa");
//        userDao.save(u);
        //按id查找
//        long id=4;
//        User u =userDao.getOne(id);
//        System.out.println(u.getUserNick());
        //按id查找
//        User u = new User();
//        u.setUserId(3);
//        Example <User> example = Example.of(u);
//        Optional <User> productOptional = userDao.findOne(example);
//        User k= productOptional.get();
//        System.out.println(k.getUserNick());
       //删除
//        long id=4;
//        User u =userDao.getOne(id);
//        userDao.delete(u);
        //修改
        long id=3;
        User u =userDao.getOne(id);
        u.setUserNick("kkkk");
        userDao.save(u);
    }
}
