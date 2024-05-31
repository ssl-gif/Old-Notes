import dao.IUserDao;
import domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
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

        // 3.使用工厂生产SqlSession对象
        SqlSession sqlSession = factory.openSession();

        // 4.使用SqlSession对象创建Dao接口的代理对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        // 5.使用Dao接口的代理对象调用接口中的方法
        List<User> userList = userDao.findAll();
        for (User user : userList) {
            System.out.println(user);
        }

        // 6.释放资源
        sqlSession.close();
        in.close();

    }

}
