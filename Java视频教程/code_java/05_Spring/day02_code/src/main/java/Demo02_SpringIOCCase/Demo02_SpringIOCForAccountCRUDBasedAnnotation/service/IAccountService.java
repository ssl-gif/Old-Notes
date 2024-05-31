package Demo02_SpringIOCCase.Demo02_SpringIOCForAccountCRUDBasedAnnotation.service;

import Demo02_SpringIOCCase.Demo02_SpringIOCForAccountCRUDBasedAnnotation.domain.Account;

import java.util.List;

public interface IAccountService {

    List<Account> findAllAccount();

    Account findAccountById(Integer accountId);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Integer accountId);

}
