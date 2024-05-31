package Demo01_TransactionAndDynamicProxy.Demo02_DynamicProxyForTransactionControl.Demo02_DynamicProxyBasedSubclass;

import Demo01_TransactionAndDynamicProxy.Demo02_DynamicProxyForTransactionControl.Demo01_DynamicProxyBasedInterface.Producer;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.junit.Test;

import java.lang.reflect.Method;

public class DemoMain {

    @Test
    public void testProxy() {

        // 创建真实对象
        Producer producer = new Producer();

        // 生成代理对象
        Producer producerProxy = (Producer) Enhancer.create(producer.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                Object o = method.invoke(producer, args);
                return o;
            }
        });

        // 代理对象调用方法
        String s = producerProxy.saleProduct(1000F);
        System.out.println(s);

    }

}
