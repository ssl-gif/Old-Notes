package dao;

import domain.User;

import java.util.List;

// 实体类User对应的持久层接口
public interface IUserDao {

    List<User> findAll();

    User findById(Integer userId);

}
