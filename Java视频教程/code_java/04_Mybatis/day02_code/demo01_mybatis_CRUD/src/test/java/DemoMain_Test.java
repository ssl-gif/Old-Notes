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
        user.setId(52);
        user.setUsername("mybatis update user");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("北京市顺义区");
        userDao.updateUser(user);
    }

    @Test
    public void testDeleteUser() {
        userDao.deleteUser(52);
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

    @After
    public void destroy() throws IOException {
        // 提交事务
        sqlSession.commit();
        // 释放资源
        sqlSession.close();
        in.close();
    }

}
