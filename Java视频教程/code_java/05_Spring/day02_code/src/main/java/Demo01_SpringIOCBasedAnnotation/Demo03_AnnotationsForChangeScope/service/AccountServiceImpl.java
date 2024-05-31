package Demo01_SpringIOCBasedAnnotation.Demo03_AnnotationsForChangeScope.service;

import Demo01_SpringIOCBasedAnnotation.Demo03_AnnotationsForChangeScope.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("accountService")
@Scope()
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }

}
