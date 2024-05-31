package Demo01_TransactionAndDynamicProxy.Demo02_DynamicProxyForTransactionControl.Demo03_DynamicProxyForTransactionControl.service;

public interface IAccountService {

    // 添加转账方法：sourceName-转出账户名称、targetName-转入账户名称、money-转账金额
    void transfer(String sourceName, String targetName, Float money);

}
