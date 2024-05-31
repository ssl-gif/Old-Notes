package Demo01_TransactionAndDynamicProxy.Demo02_DynamicProxyForTransactionControl.Demo03_DynamicProxyForTransactionControl.factory;

import Demo01_TransactionAndDynamicProxy.Demo02_DynamicProxyForTransactionControl.Demo03_DynamicProxyForTransactionControl.service.IAccountService;
import Demo01_TransactionAndDynamicProxy.Demo02_DynamicProxyForTransactionControl.Demo03_DynamicProxyForTransactionControl.utils.TransactionManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 用于生产accountService的代理对象的工厂
public class BeanFactory {

    private IAccountService accountService;

    private TransactionManager transactionManager;

    public void setAccountService(IAccountService accountService) {
        this.accountService = accountService;
    }

    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public IAccountService getAccountServiceProxy() {

        IAccountService accountServiceProxy = (IAccountService) Proxy.newProxyInstance(accountService.getClass().getClassLoader(), accountService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                try {
                    transactionManager.startTransaction();
                    method.invoke(accountService, args);
                    transactionManager.commitTransaction();
                } catch (Exception e) {
                    transactionManager.rollbackTransaction();
                    throw new RuntimeException(e);
                } finally {
                    transactionManager.release();
                }
                return null;
            }
        });

        return accountServiceProxy;

    }

}
