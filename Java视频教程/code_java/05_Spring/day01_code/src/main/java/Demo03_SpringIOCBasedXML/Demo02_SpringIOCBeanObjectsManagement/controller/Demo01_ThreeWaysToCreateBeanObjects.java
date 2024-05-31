package Demo03_SpringIOCBasedXML.Demo02_SpringIOCBeanObjectsManagement.controller;

import Demo03_SpringIOCBasedXML.Demo02_SpringIOCBeanObjectsManagement.service.AccountServiceImpl;
import Demo03_SpringIOCBasedXML.Demo02_SpringIOCBeanObjectsManagement.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo01_ThreeWaysToCreateBeanObjects {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("Demo05_bean.xml");

        // ①.使用默认构造函数创建对象
        IAccountService accountService01 = ac.getBean("accountService01", AccountServiceImpl.class);
        accountService01.saveAccount();

        // ②.使用工厂类中的普通方法创建对象
        IAccountService accountService02 = ac.getBean("accountService02", AccountServiceImpl.class);
        accountService02.saveAccount();

        // ③.使用工厂类中的静态方法创建对象
        IAccountService accountService03 = ac.getBean("accountService03", AccountServiceImpl.class);
        accountService03.saveAccount();

    }
}
