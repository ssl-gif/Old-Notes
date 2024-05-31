package Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo02_FactoryPatternDecouplingOptimization;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

// 读取配置文件、创建和获取对象的工厂类
public class BeanFactory {

    private static Properties props;

    private static Map<String, Object> beans;

    // 使用静态代码块读取配置文件，并将创建的对象存入Map中
    static {
        try {
            props = new Properties();
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("Demo02_bean.properties");
            props.load(in);
            beans = new HashMap<String, Object>();
            Enumeration keys = props.keys();
            while (keys.hasMoreElements()) {
                String key = keys.nextElement().toString();
                String beanPath = props.getProperty(key);
                Object value = Class.forName(beanPath).newInstance();
                beans.put(key, value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 从Map中获取对象的方法
    public static Object getBean(String beanName) {
        return beans.get(beanName);
    }

}
