package dao;

import domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements IUserDao {

    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public List<User> findAll() {
        SqlSession sqlSession = factory.openSession();
        List<User> userList = sqlSession.selectList("dao.IUserDao.findAll");
        sqlSession.close();
        return userList;
    }

    @Override
    public void saveUser(User user) {
        SqlSession sqlSession = factory.openSession();
        sqlSession.insert("dao.IUserDao.saveUser", user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void updateUser(User user) {
        SqlSession sqlSession = factory.openSession();
        sqlSession.update("dao.IUserDao.updateUser", user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteUser(Integer userId) {
        SqlSession sqlSession = factory.openSession();
        sqlSession.delete("dao.IUserDao.deleteUser", userId);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public User findById(Integer userId) {
        SqlSession sqlSession = factory.openSession();
        User user = sqlSession.selectOne("dao.IUserDao.findById", userId);
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> findByName(String username) {
        SqlSession sqlSession = factory.openSession();
        List<User> userList = sqlSession.selectList("dao.IUserDao.findByName", username);
        sqlSession.close();
        return userList;
    }

    @Override
    public int findTotal() {
        SqlSession sqlSession = factory.openSession();
        int count = sqlSession.selectOne("dao.IUserDao.findTotal");
        sqlSession.close();
        return count;
    }
}
