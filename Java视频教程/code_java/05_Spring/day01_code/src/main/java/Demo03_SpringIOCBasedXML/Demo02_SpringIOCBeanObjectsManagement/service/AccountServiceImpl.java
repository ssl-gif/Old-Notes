package Demo03_SpringIOCBasedXML.Demo02_SpringIOCBeanObjectsManagement.service;

import Demo03_SpringIOCBasedXML.Demo02_SpringIOCBeanObjectsManagement.dao.AccountDaoImpl;
import Demo03_SpringIOCBasedXML.Demo02_SpringIOCBeanObjectsManagement.dao.IAccountDao;

// 账户的业务层实现类
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = new AccountDaoImpl();

    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }

    public void init() {
        System.out.println("初始化对象...");
    }

    public void destroy() {
        System.out.println("销毁对象...");
    }

}
