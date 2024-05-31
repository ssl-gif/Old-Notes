package Demo01_TransactionAndDynamicProxy.Demo00_TransferCase.dao;

import Demo01_TransactionAndDynamicProxy.Demo00_TransferCase.domain.Account;

import java.util.List;

public interface IAccountDao {

    List<Account> findAccountByName(String name);

    void updateAccount(Account account);

}
