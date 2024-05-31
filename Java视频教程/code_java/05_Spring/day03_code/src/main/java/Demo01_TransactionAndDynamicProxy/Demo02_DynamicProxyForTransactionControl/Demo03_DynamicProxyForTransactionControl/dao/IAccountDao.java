package Demo01_TransactionAndDynamicProxy.Demo02_DynamicProxyForTransactionControl.Demo03_DynamicProxyForTransactionControl.dao;

import Demo01_TransactionAndDynamicProxy.Demo02_DynamicProxyForTransactionControl.Demo03_DynamicProxyForTransactionControl.domain.Account;

import java.util.List;

public interface IAccountDao {

    List<Account> findAccountByName(String name);

    void updateAccount(Account account);

}
