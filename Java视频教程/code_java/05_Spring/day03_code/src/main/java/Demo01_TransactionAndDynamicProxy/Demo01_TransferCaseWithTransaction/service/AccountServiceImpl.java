package Demo01_TransactionAndDynamicProxy.Demo01_TransferCaseWithTransaction.service;

import Demo01_TransactionAndDynamicProxy.Demo01_TransferCaseWithTransaction.domain.Account;
import Demo01_TransactionAndDynamicProxy.Demo01_TransferCaseWithTransaction.dao.IAccountDao;
import Demo01_TransactionAndDynamicProxy.Demo01_TransferCaseWithTransaction.utils.TransactionManager;

public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    private TransactionManager transactionManager;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    // 实现转账方法
    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        try {
            // ①.开启事务
            transactionManager.startTransaction();
            // ②.根据名称查询要转出、转入的账户
            Account sourceAccount = accountDao.findAccountByName(sourceName).get(0);
            Account targetAccount = accountDao.findAccountByName(targetName).get(0);
            // ③.设置转出、转入账户的金额
            sourceAccount.setMoney(sourceAccount.getMoney() - money);
            targetAccount.setMoney(targetAccount.getMoney() + money);
            // ④.更新转出、转入账户的金额
            accountDao.updateAccount(sourceAccount);
            accountDao.updateAccount(targetAccount);
            // ⑤.提交事务
            transactionManager.commitTransaction();
        } catch (Exception e) {
            // ⑥.回滚事务
            transactionManager.rollbackTransaction();
            e.printStackTrace();
        } finally {
            // ⑦.释放资源
            transactionManager.release();
        }
    }

}
