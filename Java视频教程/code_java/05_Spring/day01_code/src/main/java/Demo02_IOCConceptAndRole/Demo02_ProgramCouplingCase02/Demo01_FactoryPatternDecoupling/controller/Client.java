package Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo01_FactoryPatternDecoupling.controller;

import Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo01_FactoryPatternDecoupling.BeanFactory;
import Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo01_FactoryPatternDecoupling.service.AccountServiceImpl;
import Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo01_FactoryPatternDecoupling.service.IAccountService;

// 模拟一个表现层，用于调用业务层
public class Client {
    public static void main(String[] args) {

        IAccountService accountService = (AccountServiceImpl) BeanFactory.getBean("accountService");
        accountService.saveAccount();

    }
}
