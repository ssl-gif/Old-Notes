package Demo03_SpringIOCBasedXML.Demo01_SpringIOCCoreContainerInterfaceUsage.controller;

import Demo03_SpringIOCBasedXML.Demo01_SpringIOCCoreContainerInterfaceUsage.service.AccountServiceImpl;
import Demo03_SpringIOCBasedXML.Demo01_SpringIOCCoreContainerInterfaceUsage.service.IAccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Demo02_BeanFactory {
    public static void main(String[] args) {

        // ①.使用ClassPathResource实现类加载配置文件为Resource对象，来获取SpringIOC的核心容器对象
        Resource resource01 = new ClassPathResource("Demo04_bean.xml");
        BeanFactory factory01 = new XmlBeanFactory(resource01);
        IAccountService accountService01 = factory01.getBean("accountService", AccountServiceImpl.class);
        accountService01.saveAccount();

        // ②.使用FileSystemResource实现类加载配置文件为Resource对象，来获取SpringIOC的核心容器对象
        Resource resource02 = new FileSystemResource("D:\\Files\\Notes\\Java视频教程\\code_java\\05_Spring\\day01_code\\src\\main\\resources\\Demo04_bean.xml");
        BeanFactory factory02 = new XmlBeanFactory(resource02);
        IAccountService accountService02 = factory02.getBean("accountService", AccountServiceImpl.class);
        accountService02.saveAccount();

    }
}
