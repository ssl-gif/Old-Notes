package Demo02_SpringIOCCase.Demo01_SpringIOCForAccountCRUDBasedXML.service;

import Demo02_SpringIOCCase.Demo01_SpringIOCForAccountCRUDBasedXML.dao.IAccountDao;
import Demo02_SpringIOCCase.Demo01_SpringIOCForAccountCRUDBasedXML.domain.Account;

import java.util.List;

public class AccountServiceImpl implements IAccountService{

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    @Override
    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public void deleteAccount(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }

}
