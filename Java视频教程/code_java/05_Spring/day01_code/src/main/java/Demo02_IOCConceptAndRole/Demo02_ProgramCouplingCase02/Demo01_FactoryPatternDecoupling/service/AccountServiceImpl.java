package Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo01_FactoryPatternDecoupling.service;

import Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo01_FactoryPatternDecoupling.BeanFactory;
import Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo01_FactoryPatternDecoupling.dao.AccountDaoImpl;
import Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo01_FactoryPatternDecoupling.dao.IAccountDao;

// 账户的业务层实现类
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = (AccountDaoImpl) BeanFactory.getBean("accountDao");

    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }

}
