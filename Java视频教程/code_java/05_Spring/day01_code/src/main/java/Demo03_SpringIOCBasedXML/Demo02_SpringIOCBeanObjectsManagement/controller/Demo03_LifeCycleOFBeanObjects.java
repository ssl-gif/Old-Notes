package Demo03_SpringIOCBasedXML.Demo02_SpringIOCBeanObjectsManagement.controller;

import Demo03_SpringIOCBasedXML.Demo02_SpringIOCBeanObjectsManagement.service.AccountServiceImpl;
import Demo03_SpringIOCBasedXML.Demo02_SpringIOCBeanObjectsManagement.service.IAccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Demo03_LifeCycleOFBeanObjects {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Demo07_bean.xml");
        IAccountService accountService = ac.getBean("accountService", AccountServiceImpl.class);
        accountService.saveAccount();

        /*
        Question：这里为什么要执行ac.close()？
        Answer：
            因为必须要先销毁accountService对象，才会调用销毁方法destroy()。但是由于单例对象的生命周期与核心容器相同，所以此时需要
        先调用close()方法来销毁容器，然后accountService对象也会随之销毁。
            并且在ApplicationContext接口中是没有close()方法的，所以想调用close()方法来销毁容器，只能使用ClassPathXmlApplicationContext
        实现类来接收核心容器对象。
        */
        ac.close();

    }
}
