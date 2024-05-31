package Demo03_SpringIOCBasedXML.Demo01_SpringIOCCoreContainerInterfaceUsage.controller;

import Demo03_SpringIOCBasedXML.Demo01_SpringIOCCoreContainerInterfaceUsage.service.AccountServiceImpl;
import Demo03_SpringIOCBasedXML.Demo01_SpringIOCCoreContainerInterfaceUsage.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Demo01_ApplicationContext {
    public static void main(String[] args) {

        // ①.使用ClassPathXmlApplicationContext实现类，来获取SpringIOC的核心容器对象
        ApplicationContext ac01 = new ClassPathXmlApplicationContext("Demo04_bean.xml");
        IAccountService accountService01 = ac01.getBean("accountService", AccountServiceImpl.class);
        accountService01.saveAccount();

        // ②.使用FileSystemXmlApplicationContext实现类，来获取SpringIOC的核心容器对象
        ApplicationContext ac02 = new FileSystemXmlApplicationContext("D:\\Files\\Notes\\Java视频教程\\code_java\\05_Spring\\day01_code\\src\\main\\resources\\Demo04_bean.xml");
        IAccountService accountService02 = ac02.getBean("accountService", AccountServiceImpl.class);
        accountService02.saveAccount();

    }
}
