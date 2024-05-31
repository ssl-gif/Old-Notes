import dao.IUserDao;
import dao.UserDaoImpl;
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

public class DemoMain_Test {

    private InputStream in;
    private IUserDao userDao;

    @Before
    public void init() throws IOException {
        // 读取mybatis的主配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);

        // 使用工厂创建Dao接口的实现类对象
        userDao = new UserDaoImpl(factory);
    }

    @Test
    public void testFindAll() throws IOException {
        List<User> userList = userDao.findAll();
        for (User user : userList) {
            System.out.println(user);
        }

    }

    @Test
    public void testSaveUser() {
        User user = new User();
        user.setUsername("mybatis save user");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("北京市顺义区");
        System.out.println("保存操作之前：" + user);
        userDao.saveUser(user);
        System.out.println("保存操作之后：" + user);
    }

    @Test
    public void testUpdateUser() {
        User user = new User();
        user.setId(56);
        user.setUsername("mybatis update user");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("北京市顺义区");
        userDao.updateUser(user);
    }

    @Test
    public void testDeleteUser() {
        userDao.deleteUser(56);
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
    public void testFindTotal() {
        int count = userDao.findTotal();
        System.out.println(count);
    }

    @After
    public void destroy() throws IOException {
        // 释放资源
        in.close();
    }

}
