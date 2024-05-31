import dao.IUserDao;
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
import java.util.Date;
import java.util.List;

public class DemoMain_Test_User {

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
    public void testFindAll() {
        List<User> userList = userDao.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testSaveUser() {
        User user = new User();
        user.setUsername("mybatis annotation save user");
        user.setAddress("北京市昌平区");
        user.setSex("男");
        user.setBirthday(new Date());
        userDao.saveUser(user);
    }

    @Test
    public void testUpdateUser() {
        User user = new User();
        user.setId(49);
        user.setUsername("mybatis annotation update user");
        user.setAddress("北京市海淀区");
        userDao.updateUser(user);
    }

    @Test
    public void testDeleteUser() {
        userDao.deleteUser(49);
    }

    @Test
    public void testFindUserById() {
        User user = userDao.findUserById(45);
        System.out.println(user);
    }

    @Test
    public void testFindUserByName() {
        List<User> users = userDao.findUserByName("王");
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindTotalUser() {
        int total = userDao.findTotalUser();
        System.out.println(total);
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
