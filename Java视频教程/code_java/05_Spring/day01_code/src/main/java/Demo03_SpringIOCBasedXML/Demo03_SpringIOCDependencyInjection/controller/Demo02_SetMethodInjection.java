package Demo03_SpringIOCBasedXML.Demo03_SpringIOCDependencyInjection.controller;

import Demo03_SpringIOCBasedXML.Demo03_SpringIOCDependencyInjection.service.AccountServiceImpl_02;
import Demo03_SpringIOCBasedXML.Demo03_SpringIOCDependencyInjection.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo02_SetMethodInjection {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("Demo09_bean.xml");

        // set方法注入
        IAccountService accountService = ac.getBean("accountService", AccountServiceImpl_02.class);
        System.out.println(accountService);
        accountService.saveAccount();

    }
}
