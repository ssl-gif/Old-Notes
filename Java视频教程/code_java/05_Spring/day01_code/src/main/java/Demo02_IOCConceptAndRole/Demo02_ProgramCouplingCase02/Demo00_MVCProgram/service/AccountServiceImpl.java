package Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo00_MVCProgram.service;

import Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo00_MVCProgram.dao.IAccountDao;
import Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo00_MVCProgram.dao.AccountDaoImpl;

// 账户的业务层接口实现类
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = new AccountDaoImpl();

    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }

}
