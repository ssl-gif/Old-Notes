package Demo02_SpringIOCCase.Demo04_SpringIOCOtherAnnotation.dao;

import Demo02_SpringIOCCase.Demo04_SpringIOCOtherAnnotation.domain.Account;

import java.util.List;

public interface IAccountDao {

    List<Account> findAllAccount();

    Account findAccountById(Integer accountId);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Integer accountId);

}
