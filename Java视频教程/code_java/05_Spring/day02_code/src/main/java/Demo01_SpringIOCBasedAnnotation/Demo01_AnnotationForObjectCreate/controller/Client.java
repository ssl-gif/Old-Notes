package Demo01_SpringIOCBasedAnnotation.Demo01_AnnotationForObjectCreate.controller;

import Demo01_SpringIOCBasedAnnotation.Demo01_AnnotationForObjectCreate.dao.AccountDaoImpl;
import Demo01_SpringIOCBasedAnnotation.Demo01_AnnotationForObjectCreate.dao.IAccountDao;
import Demo01_SpringIOCBasedAnnotation.Demo01_AnnotationForObjectCreate.service.AccountServiceImpl;
import Demo01_SpringIOCBasedAnnotation.Demo01_AnnotationForObjectCreate.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("Demo01_bean.xml");

        IAccountService accountService = ac.getBean("accountService", AccountServiceImpl.class);
        accountService.saveAccount();

        IAccountDao accountDao = ac.getBean("accountDao", AccountDaoImpl.class);
        accountDao.saveAccount();

    }
}
