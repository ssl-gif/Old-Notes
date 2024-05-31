package Demo01_TransactionAndDynamicProxy.Demo01_TransferCaseWithTransaction.dao;

import Demo01_TransactionAndDynamicProxy.Demo01_TransferCaseWithTransaction.domain.Account;

import java.util.List;

public interface IAccountDao {

    List<Account> findAccountByName(String name);

    void updateAccount(Account account);

}
