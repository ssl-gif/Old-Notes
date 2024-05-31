package Demo02_SpringAOP.Demo05_SpringAOPForTransactionControl.service;

import Demo02_SpringAOP.Demo05_SpringAOPForTransactionControl.dao.IAccountDao;
import Demo02_SpringAOP.Demo05_SpringAOPForTransactionControl.domain.Account;

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
