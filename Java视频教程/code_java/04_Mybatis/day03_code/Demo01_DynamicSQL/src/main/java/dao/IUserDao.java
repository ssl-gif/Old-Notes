package dao;

import domain.QueryVo;
import domain.User;

import java.util.List;

// 实体类User对应的持久层接口
public interface IUserDao {

    List<User> findAll();

    User findById(Integer userId);

    List<User> findByName(String username);

    List<User> findByQueryVo(QueryVo vo);

    List<User> findByCondition(User user);

    List<User> findInIds(QueryVo vo);

}
