package Demo03_SpringIOCBasedXML.Demo02_SpringIOCBeanObjectsManagement.controller;

import Demo03_SpringIOCBasedXML.Demo02_SpringIOCBeanObjectsManagement.service.AccountServiceImpl;
import Demo03_SpringIOCBasedXML.Demo02_SpringIOCBeanObjectsManagement.service.IAccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Demo02_ScopeOFBeanObjects {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("Demo06_bean.xml");

        // 使用ApplicationContext获取单例对象，为立即加载
        IAccountService accountService01 = ac.getBean("accountService01", AccountServiceImpl.class);
        IAccountService accountService02 = ac.getBean("accountService01", AccountServiceImpl.class);
        System.out.println(accountService01 == accountService02); // true，说明accountService01是单例对象

        // 使用ApplicationContext获取多例对象，为延迟加载
        IAccountService accountService03 = ac.getBean("accountService02", AccountServiceImpl.class);
        IAccountService accountService04 = ac.getBean("accountService02", AccountServiceImpl.class);
        System.out.println(accountService03 == accountService04); // false，说明accountService02是多例对象



        Resource resource = new ClassPathResource("Demo06_bean.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        // 使用BeanFactory获取单例对象，为延迟加载
        IAccountService accountService05 = factory.getBean("accountService01", AccountServiceImpl.class);
        IAccountService accountService06 = factory.getBean("accountService01", AccountServiceImpl.class);
        System.out.println(accountService05 == accountService06); // true，说明accountService01是单例对象

        // 使用BeanFactory获取多例对象，为延迟加载
        IAccountService accountService07 = factory.getBean("accountService02", AccountServiceImpl.class);
        IAccountService accountService08 = factory.getBean("accountService02", AccountServiceImpl.class);
        System.out.println(accountService07 == accountService08); // false，说明accountService02是多例对象

    }
}
