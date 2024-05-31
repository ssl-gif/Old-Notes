import dao.IAccountDao;
import domain.Account;
import domain.AccountUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DemoMain_Test {

    private InputStream in;
    private SqlSession sqlSession;
    private IAccountDao accountDao;

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
        accountDao = sqlSession.getMapper(IAccountDao.class);
    }

    @Test
    public void testFindAll() {
        List<Account> accountList = accountDao.findAll();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindAccountUser() {
        List<AccountUser> accountUserList = accountDao.findAccountUser();
        for (AccountUser accountUser : accountUserList) {
            System.out.println(accountUser);
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
