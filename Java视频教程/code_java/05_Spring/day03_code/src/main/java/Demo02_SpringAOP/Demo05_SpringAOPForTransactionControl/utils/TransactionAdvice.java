package Demo02_SpringAOP.Demo05_SpringAOPForTransactionControl.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TransactionAdvice {

    private TransactionManager transactionManager;

    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    @Pointcut("execution(* Demo02_SpringAOP.Demo05_SpringAOPForTransactionControl.service.*.*(..))")
    private void pointcut() {
    }

    @Around("pointcut()")
    public Object aroundPrintLog(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            transactionManager.startTransaction();
            Object[] args = proceedingJoinPoint.getArgs();
            Object result = proceedingJoinPoint.proceed(args);
            transactionManager.commitTransaction();
            return result;
        } catch (Throwable e) {
            transactionManager.rollbackTransaction();
            throw new RuntimeException(e);
        } finally {
            transactionManager.release();
        }
    }

}
