package dao;

import domain.Account;

import java.util.List;

// 实体类User对应的持久层接口
public interface IAccountDao {

    List<Account> findAll();

    List<Account> findByUid(Integer Uid);

}
