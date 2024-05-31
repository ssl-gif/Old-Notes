package Demo03_SpringIOCBasedXML.Demo00_SpringIOCStarterProgramBasedXML.controller;

import Demo03_SpringIOCBasedXML.Demo00_SpringIOCStarterProgramBasedXML.service.AccountServiceImpl;
import Demo03_SpringIOCBasedXML.Demo00_SpringIOCStarterProgramBasedXML.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 模拟一个表现层，用于调用业务层
public class Client {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("Demo03_bean.xml");
        IAccountService accountService01 = (AccountServiceImpl) ac.getBean("accountService");
        IAccountService accountService02 = ac.getBean("accountService", AccountServiceImpl.class);
        accountService01.saveAccount();
        accountService02.saveAccount();

    }
}
