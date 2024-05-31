package Demo03_SpringIOCBasedXML.Demo03_SpringIOCDependencyInjection.controller;

import Demo03_SpringIOCBasedXML.Demo03_SpringIOCDependencyInjection.service.AccountServiceImpl_01;
import Demo03_SpringIOCBasedXML.Demo03_SpringIOCDependencyInjection.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo01_ConstructorInjection {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("Demo08_bean.xml");

        // 构造函数注入：type属性
        IAccountService accountService01 = ac.getBean("accountService01", AccountServiceImpl_01.class);
        System.out.println(accountService01);
        accountService01.saveAccount();

        // 构造函数注入：index属性
        IAccountService accountService02 = ac.getBean("accountService02", AccountServiceImpl_01.class);
        System.out.println(accountService02);
        accountService02.saveAccount();

        // 构造函数注入：name属性
        IAccountService accountService03 = ac.getBean("accountService03", AccountServiceImpl_01.class);
        System.out.println(accountService03);
        accountService03.saveAccount();

    }
}
