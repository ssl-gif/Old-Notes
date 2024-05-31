package dao;

import domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

// 实体类User对应的持久层接口
public interface IUserDao {

    @Select("select * from user;")
    List<User> findAll();

}
