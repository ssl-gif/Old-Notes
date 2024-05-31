import dao.IUserDao;
import domain.QueryVo;
import domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DemoMain_Test {

    private InputStream in;
    private SqlSession sqlSession;
    private IUserDao userDao;

    @Before
    public void init() throws IOException {
        // 读取mybatis的主配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);

        // 使用工厂生产SqlSession对象
        sqlSession = factory.openSession();

        // 使用SqlSession对象创建Dao接口的代理对象
        userDao = sqlSession.getMapper(IUserDao.class);
    }

    @Test
    public void testFindAll() throws IOException {
        List<User> userList = userDao.findAll();
        for (User user : userList) {
            System.out.println(user);
        }

    }


    @Test
    public void testFindById() {
        User user = userDao.findById(48);
        System.out.println(user);
    }

    @Test
    public void testFindByName() {
        List<User> userList = userDao.findByName("王");
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindByQueryVo() {
        QueryVo vo = new QueryVo();
        User user = new User();
        user.setUsername("%王%");
        vo.setUser(user);
        List<User> userList = userDao.findByQueryVo(vo);
        for (User user1 : userList) {
            System.out.println(user1);
        }
    }

    @Test
    public void findByCondition() {
        User user = new User();
        user.setUsername("老王");
        user.setSex("女");
        List<User> userList = userDao.findByCondition(user);
        for (User user1 : userList) {
            System.out.println(user1);
        }
    }

    @Test
    public void findInIds() {
        QueryVo vo = new QueryVo();
        List<Integer> list = new ArrayList<>();
        list.add(41);
        list.add(42);
        list.add(46);
        vo.setIds(list);
        User user = new User();
        user.setUsername("老王");
        vo.setUser(user);
        List<User> userList = userDao.findInIds(vo);
        for (User user1 : userList) {
            System.out.println(user1);
        }
    }

    @After
    public void destroy() throws IOException {
        // 提交事务
        sqlSession.commit();
        // 释放资源
        sqlSession.close();
        in.close();
    }

}
