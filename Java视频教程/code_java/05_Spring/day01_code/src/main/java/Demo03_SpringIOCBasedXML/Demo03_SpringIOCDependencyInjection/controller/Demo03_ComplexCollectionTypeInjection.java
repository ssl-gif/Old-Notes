package Demo03_SpringIOCBasedXML.Demo03_SpringIOCDependencyInjection.controller;

import Demo03_SpringIOCBasedXML.Demo03_SpringIOCDependencyInjection.service.AccountServiceImpl_03;
import Demo03_SpringIOCBasedXML.Demo03_SpringIOCDependencyInjection.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo03_ComplexCollectionTypeInjection {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("Demo10_bean.xml");

        // 复杂类型、集合类型的数据注入
        IAccountService accountService = ac.getBean("accountService", AccountServiceImpl_03.class);
        accountService.saveAccount();
    }
}
