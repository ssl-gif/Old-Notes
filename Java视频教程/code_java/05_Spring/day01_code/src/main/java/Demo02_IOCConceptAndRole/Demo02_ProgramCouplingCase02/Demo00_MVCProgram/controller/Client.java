package Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo00_MVCProgram.controller;

import Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo00_MVCProgram.service.IAccountService;
import Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo00_MVCProgram.service.AccountServiceImpl;

// 模拟一个表现层，用于调用业务层
public class Client {
    public static void main(String[] args) {

        IAccountService accountService = new AccountServiceImpl();
        accountService.saveAccount();

    }
}
