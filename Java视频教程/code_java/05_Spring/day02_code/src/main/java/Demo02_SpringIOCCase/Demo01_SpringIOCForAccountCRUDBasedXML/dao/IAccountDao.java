package Demo02_SpringIOCCase.Demo01_SpringIOCForAccountCRUDBasedXML.dao;

import Demo02_SpringIOCCase.Demo01_SpringIOCForAccountCRUDBasedXML.domain.Account;

import java.util.List;

public interface IAccountDao {

    List<Account> findAllAccount();

    Account findAccountById(Integer accountId);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Integer accountId);

}
