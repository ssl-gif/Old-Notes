package Demo03_SpringIOCBasedXML.Demo03_SpringIOCDependencyInjection.service;

import Demo03_SpringIOCBasedXML.Demo03_SpringIOCDependencyInjection.dao.IAccountDao;

// 账户的业务层实现类：构造方法注入
public class AccountServiceImpl_01 implements IAccountService {

    private String name;
    private Integer age;
    private IAccountDao accountDao;

    public AccountServiceImpl_01(String name, Integer age, IAccountDao accountDao) {
        this.name = name;
        this.age = age;
        this.accountDao = accountDao;
    }

    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }

    @Override
    public String toString() {
        return "AccountServiceImpl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", accountDao=" + accountDao +
                '}';
    }

}
