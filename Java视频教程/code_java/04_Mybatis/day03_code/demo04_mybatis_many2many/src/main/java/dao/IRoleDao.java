package dao;

import domain.Role;

import java.util.List;

// 实体类Role对应的持久层接口
public interface IRoleDao {

    List<Role> findAll();

}
