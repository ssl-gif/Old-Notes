package Demo03_SpringIOCBasedXML.Demo02_SpringIOCBeanObjectsManagement.factory;

import Demo03_SpringIOCBasedXML.Demo02_SpringIOCBeanObjectsManagement.service.AccountServiceImpl;

// 模拟一个工厂类，该类中的普通方法可以返回AccountServiceImpl对象
public class InstanceFactory {

    public AccountServiceImpl getAccountService() {
        return new AccountServiceImpl();
    }

}
