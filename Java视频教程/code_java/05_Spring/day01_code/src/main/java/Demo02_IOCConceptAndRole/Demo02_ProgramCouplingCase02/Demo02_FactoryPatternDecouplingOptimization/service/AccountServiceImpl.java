package Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo02_FactoryPatternDecouplingOptimization.service;

import Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo02_FactoryPatternDecouplingOptimization.dao.IAccountDao;
import Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo02_FactoryPatternDecouplingOptimization.dao.AccountDaoImpl;

// 账户的业务层实现类
public class AccountServiceImpl implements IAccountService {

    /*
    Question：这里为什么不能使用 private IAccountDao accountDao = (AccountDaoImpl) BeanFactory.getBean("accountDao"); 来获取对象？
    Answer：在BeanFactory的静态代码块中，当AccountServiceImpl对象创建的时候，AccountDaoImpl还没创建出来，如果这个时候再调用BeanFactory
            就不会执行静态代码块了，而是直接调用getBean()方法从容器中获取对象，但此时容器中并没有AccountDaoImpl对象，所以会产生空指针异常
    */
    private IAccountDao accountDao = new AccountDaoImpl();

    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }

}
