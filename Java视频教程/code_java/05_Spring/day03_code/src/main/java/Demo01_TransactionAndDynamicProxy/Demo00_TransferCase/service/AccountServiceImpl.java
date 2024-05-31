package Demo01_TransactionAndDynamicProxy.Demo00_TransferCase.service;

import Demo01_TransactionAndDynamicProxy.Demo00_TransferCase.dao.IAccountDao;
import Demo01_TransactionAndDynamicProxy.Demo00_TransferCase.domain.Account;

public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    // 实现转账方法
    @Override
    public void transfer(String sourceName, String targetName, Float money) {

        // ①.根据名称查询要转出、转入的账户
        Account sourceAccount = accountDao.findAccountByName(sourceName).get(0);
        Account targetAccount = accountDao.findAccountByName(targetName).get(0);

        // ②.设置转出、转入账户的金额
        sourceAccount.setMoney(sourceAccount.getMoney() - money);
        targetAccount.setMoney(targetAccount.getMoney() + money);

        // ③.更新转出、转入账户的金额
        accountDao.updateAccount(sourceAccount);
        accountDao.updateAccount(targetAccount);

    }

}
