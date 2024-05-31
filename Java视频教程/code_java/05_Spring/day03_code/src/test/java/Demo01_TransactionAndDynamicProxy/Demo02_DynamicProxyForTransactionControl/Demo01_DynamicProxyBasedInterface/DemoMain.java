package Demo01_TransactionAndDynamicProxy.Demo02_DynamicProxyForTransactionControl.Demo01_DynamicProxyBasedInterface;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DemoMain {

    @Test
    public void testProxy() {

        // 创建真实对象
        Producer producer = new Producer();

        // 生成代理对象
        IProducer producerProxy = (IProducer) Proxy.newProxyInstance(producer.getClass().getClassLoader(), producer.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object o = method.invoke(producer, args);
                return o;
            }
        });

        // 代理对象调用方法
        String s = producerProxy.saleProduct(1000F);
        System.out.println(s);

    }

}
