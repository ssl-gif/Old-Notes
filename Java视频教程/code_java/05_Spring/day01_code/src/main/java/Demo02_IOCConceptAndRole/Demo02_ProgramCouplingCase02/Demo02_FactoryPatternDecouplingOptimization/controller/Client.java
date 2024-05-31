package Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo02_FactoryPatternDecouplingOptimization.controller;

import Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo02_FactoryPatternDecouplingOptimization.BeanFactory;
import Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo02_FactoryPatternDecouplingOptimization.service.IAccountService;
import Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo02_FactoryPatternDecouplingOptimization.service.AccountServiceImpl;

// 模拟一个表现层，用于调用业务层
public class Client {
    public static void main(String[] args) {

        IAccountService accountService = (AccountServiceImpl) BeanFactory.getBean("accountService");
        accountService.saveAccount();

    }
}
