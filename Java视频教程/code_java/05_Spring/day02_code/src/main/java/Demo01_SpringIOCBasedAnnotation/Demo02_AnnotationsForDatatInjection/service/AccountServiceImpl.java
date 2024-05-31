package Demo01_SpringIOCBasedAnnotation.Demo02_AnnotationsForDatatInjection.service;

import Demo01_SpringIOCBasedAnnotation.Demo02_AnnotationsForDatatInjection.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Autowired
    public void init(IAccountDao accountDao) {
        System.out.println(accountDao);
    }

    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }

}
