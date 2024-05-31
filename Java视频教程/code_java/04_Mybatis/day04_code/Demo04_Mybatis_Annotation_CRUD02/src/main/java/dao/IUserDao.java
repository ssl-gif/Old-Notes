package dao;

import domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

// 实体类User对应的持久层接口
public interface IUserDao {

    @Select("select * from user;")
    @Results(id = "userMap", value = {@Result(id = true, column = "id", property = "userId"), @Result(column = "username", property = "userName"), @Result(column = "birthday", property = "userBirthday"), @Result(column = "sex", property = "userSex"), @Result(column = "address", property = "userAddress")})
    List<User> findAll();

    @Select("select * from user where id=#{id};")
    @ResultMap(value = {"userMap"})
    User findUserById(Integer userId);

    @ResultMap("userMap")
    @Select("select * from user where username like #{username};")
    List<User> findUserByName(String username);

}
