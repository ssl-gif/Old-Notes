package Demo02_SpringAOP.Demo05_SpringAOPForTransactionControl.dao;

import Demo02_SpringAOP.Demo05_SpringAOPForTransactionControl.domain.Account;

import java.util.List;

public interface IAccountDao {

    List<Account> findAccountByName(String name);

    void updateAccount(Account account);

}
