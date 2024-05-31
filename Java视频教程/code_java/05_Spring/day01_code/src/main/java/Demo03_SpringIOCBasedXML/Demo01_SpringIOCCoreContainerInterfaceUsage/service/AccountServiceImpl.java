package Demo03_SpringIOCBasedXML.Demo01_SpringIOCCoreContainerInterfaceUsage.service;

import Demo03_SpringIOCBasedXML.Demo01_SpringIOCCoreContainerInterfaceUsage.dao.AccountDaoImpl;
import Demo03_SpringIOCBasedXML.Demo01_SpringIOCCoreContainerInterfaceUsage.dao.IAccountDao;

// 账户的业务层实现类
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = new AccountDaoImpl();

    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }

}
