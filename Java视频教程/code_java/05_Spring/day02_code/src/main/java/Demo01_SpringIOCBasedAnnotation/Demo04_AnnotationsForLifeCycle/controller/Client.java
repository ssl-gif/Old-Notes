package Demo01_SpringIOCBasedAnnotation.Demo04_AnnotationsForLifeCycle.controller;

import Demo01_SpringIOCBasedAnnotation.Demo04_AnnotationsForLifeCycle.service.AccountServiceImpl;
import Demo01_SpringIOCBasedAnnotation.Demo04_AnnotationsForLifeCycle.service.IAccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Demo04_bean.xml");
        IAccountService accountService = ac.getBean("accountService", AccountServiceImpl.class);
        accountService.saveAccount();
        ac.close();

    }
}
