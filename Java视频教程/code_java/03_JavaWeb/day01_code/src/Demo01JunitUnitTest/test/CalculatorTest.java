package Demo01JunitUnitTest.test;

import Demo01JunitUnitTest.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    // 初始化的方法：用于资源申请，所有测试方法在执行之前都会先执行该方法
    @Before
    public void init() {
        System.out.println("init...");
    }


    // 释放资源的方法：用于资源释放，所有测试方法执行完后都会自动执行该方法
    @After
    public void close() {
        System.out.println("close...");
    }

    // 测试add方法
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 20);
        Assert.assertEquals(30, result);
    }

    // 测试sub方法
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int result = calculator.sub(10, 20);
        Assert.assertEquals(0, result);
    }

}





