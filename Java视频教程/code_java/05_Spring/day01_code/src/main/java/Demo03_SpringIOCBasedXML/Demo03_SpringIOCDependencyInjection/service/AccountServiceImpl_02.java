package Demo03_SpringIOCBasedXML.Demo03_SpringIOCDependencyInjection.service;

import Demo03_SpringIOCBasedXML.Demo03_SpringIOCDependencyInjection.dao.IAccountDao;

// 账户的业务层实现类：set方法注入
public class AccountServiceImpl_02 implements IAccountService {

    private String name;
    private Integer age;
    private IAccountDao accountDao;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAccountDao(IAccountDao accountDao) {
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
