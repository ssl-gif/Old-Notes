import dao.UserDaoImpl;
import domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DemoMain_Test {

    @Test
    public void test() throws IOException {

        // 1.读取mybatis的主配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);

        // 3.创建一个Dao接口的实现类对象
        UserDaoImpl userDaoImpl = new UserDaoImpl(factory);

        // 4.使用Dao接口的实现类对象调用接口中的方法
        List<User> userList = userDaoImpl.findAll();
        for (User user : userList) {
            System.out.println(user);
        }

        // 5.释放资源
        in.close();

    }

}
