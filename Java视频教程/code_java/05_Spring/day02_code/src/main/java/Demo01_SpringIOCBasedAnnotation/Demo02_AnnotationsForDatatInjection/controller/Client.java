package Demo01_SpringIOCBasedAnnotation.Demo02_AnnotationsForDatatInjection.controller;

import Demo01_SpringIOCBasedAnnotation.Demo02_AnnotationsForDatatInjection.service.AccountServiceImpl;
import Demo01_SpringIOCBasedAnnotation.Demo02_AnnotationsForDatatInjection.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("Demo02_bean.xml");

        IAccountService accountService = ac.getBean("accountService", AccountServiceImpl.class);
        accountService.saveAccount();

    }
}
