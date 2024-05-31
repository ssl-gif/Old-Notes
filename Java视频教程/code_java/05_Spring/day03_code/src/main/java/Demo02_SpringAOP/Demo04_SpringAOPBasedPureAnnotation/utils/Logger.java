package Demo02_SpringAOP.Demo04_SpringAOPBasedPureAnnotation.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// 用于记录日志的工具类，它里面提供了公共的代码
@Component
@Aspect
public class Logger {

    @Pointcut("execution(* Demo02_SpringAOP.Demo04_SpringAOPBasedPureAnnotation.service.*.*(..))")
    private void pointcut(){}

    // 前置通知
//    @Before("pointcut()")
    public void beforePrintLog() {
        System.out.println("前置通知-Logger类中的beforePrintLog方法开始记录日志了。。。");
    }

    // 后置通知
//    @AfterReturning("pointcut()")
    public void afterReturningPrintLog() {
        System.out.println("后置通知-Logger类中的afterReturningPrintLog方法开始记录日志了。。。");
    }

    // 异常通知
//    @AfterThrowing("pointcut()")
    public void afterThrowingPrintLog() {
        System.out.println("异常通知-Logger类中的afterThrowingPrintLog方法开始记录日志了。。。");
    }

    // 最终通知
//    @After("pointcut()")
    public void afterPrintLog() {
        System.out.println("最终通知-Logger类中的afterPrintLog方法开始记录日志了。。。");
    }

    // 环绕通知
    @Around("pointcut()")
    public Object aroundPrintLog(ProceedingJoinPoint proceedingJoinPoint) {
        try {

            System.out.println("前置通知-Logger类中的beforePrintLog方法开始记录日志了。。。");

            Object[] args = proceedingJoinPoint.getArgs();
            Object result = proceedingJoinPoint.proceed(args); // 调用业务层的方法

            System.out.println("后置通知-Logger类中的afterReturningPrintLog方法开始记录日志了。。。");

            return result;
        } catch (Throwable e) {
            System.out.println("异常通知-Logger类中的afterThrowingPrintLog方法开始记录日志了。。。");
            throw new RuntimeException(e);
        } finally {
            System.out.println("最终通知-Logger类中的afterPrintLog方法开始记录日志了。。。");
        }
    }

}
