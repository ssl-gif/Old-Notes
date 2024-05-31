package dao;

import domain.Account;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

// 实体类Account对应的持久层接口
public interface IAccountDao {

    @Select("select * from account;")
    @Results(id = "accountMap", value = {
            @Result(id = true, property = "id", column = "aid"),
            @Result(property = "uid", column = "uid"),
            @Result(property = "money", column = "money"),
            @Result(property = "user", column = "uid", one = @One(select = "dao.IUserDao.findUserById", fetchType = FetchType.EAGER))})
    List<Account> findAll();

}
