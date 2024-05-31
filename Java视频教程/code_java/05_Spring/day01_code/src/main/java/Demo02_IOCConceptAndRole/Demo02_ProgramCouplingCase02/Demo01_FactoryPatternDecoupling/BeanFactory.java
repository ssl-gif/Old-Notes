package Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo01_FactoryPatternDecoupling;

import java.io.InputStream;
import java.util.Properties;

// 读取配置文件、创建和获取对象的工厂类
public class BeanFactory {

    private static Properties props;

    // 使用静态代码块读取配置文件
    static {
        try {
            props = new Properties();
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("Demo01_bean.properties");
            props.load(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 创建和获取对象的方法
    public static Object getBean(String beanName) {
        Object bean = null;
        try {
            String beanPath = props.getProperty(beanName);
            bean = Class.forName(beanPath).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }

}
