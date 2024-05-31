package Demo01_SpringIOCBasedAnnotation.Demo03_AnnotationsForChangeScope.controller;

import Demo01_SpringIOCBasedAnnotation.Demo03_AnnotationsForChangeScope.dao.AccountDaoImpl;
import Demo01_SpringIOCBasedAnnotation.Demo03_AnnotationsForChangeScope.dao.IAccountDao;
import Demo01_SpringIOCBasedAnnotation.Demo03_AnnotationsForChangeScope.service.AccountServiceImpl;
import Demo01_SpringIOCBasedAnnotation.Demo03_AnnotationsForChangeScope.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("Demo03_bean.xml");

        IAccountService accountService01 = ac.getBean("accountService", AccountServiceImpl.class);
        IAccountService accountService02 = ac.getBean("accountService", AccountServiceImpl.class);
        System.out.println(accountService01 == accountService02); // true，说明accountService是单例对象

        IAccountDao accountDao01 = ac.getBean("accountDao", AccountDaoImpl.class);
        IAccountDao accountDao02 = ac.getBean("accountDao", AccountDaoImpl.class);
        System.out.println(accountDao01 == accountDao02); // false，说明accountDao是多例对象

    }
}
