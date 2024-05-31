package Demo01_SpringIOCBasedAnnotation.Demo04_AnnotationsForLifeCycle.service;

import Demo01_SpringIOCBasedAnnotation.Demo04_AnnotationsForLifeCycle.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化对象...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁对象...");
    }

}
