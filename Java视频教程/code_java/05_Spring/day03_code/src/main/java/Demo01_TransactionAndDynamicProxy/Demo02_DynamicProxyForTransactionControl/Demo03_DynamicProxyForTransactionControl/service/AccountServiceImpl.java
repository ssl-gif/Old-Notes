package Demo01_TransactionAndDynamicProxy.Demo02_DynamicProxyForTransactionControl.Demo03_DynamicProxyForTransactionControl.service;

import Demo01_TransactionAndDynamicProxy.Demo02_DynamicProxyForTransactionControl.Demo03_DynamicProxyForTransactionControl.dao.IAccountDao;
import Demo01_TransactionAndDynamicProxy.Demo02_DynamicProxyForTransactionControl.Demo03_DynamicProxyForTransactionControl.domain.Account;

public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    // 实现转账的方法
    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        // 根据名称查询要转入、转出的账户
        Account sourceAccount = accountDao.findAccountByName(sourceName).get(0);
        Account targetAccount = accountDao.findAccountByName(targetName).get(0);
        // 设置转入、转出账户的金额
        sourceAccount.setMoney(sourceAccount.getMoney() - money);
        targetAccount.setMoney(targetAccount.getMoney() + money);
        // 更新转入、转出账户的金额
        accountDao.updateAccount(sourceAccount);
        accountDao.updateAccount(targetAccount);
    }

}
