package Demo01_SpringIOCBasedAnnotation.Demo01_AnnotationForObjectCreate.service;

import Demo01_SpringIOCBasedAnnotation.Demo01_AnnotationForObjectCreate.dao.AccountDaoImpl;
import Demo01_SpringIOCBasedAnnotation.Demo01_AnnotationForObjectCreate.dao.IAccountDao;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;

// @Component("accountService")
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = new AccountDaoImpl();

    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }

}
