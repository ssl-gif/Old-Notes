package dao;

import domain.QueryVo;
import domain.User;

import java.util.List;

// 实体类User对应的持久层接口
public interface IUserDao {

    List<User> findAll();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Integer userId);

    User findById(Integer userId);

    List<User> findByName(String username);

    int findTotal();

    List<User> findByQueryVo(QueryVo vo);

}
