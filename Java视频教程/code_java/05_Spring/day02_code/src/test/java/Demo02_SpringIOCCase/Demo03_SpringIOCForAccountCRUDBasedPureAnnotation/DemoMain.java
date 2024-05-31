package Demo02_SpringIOCCase.Demo03_SpringIOCForAccountCRUDBasedPureAnnotation;

import Demo02_SpringIOCCase.Demo03_SpringIOCForAccountCRUDBasedPureAnnotation.config.SpringConfiguration;
import Demo02_SpringIOCCase.Demo03_SpringIOCForAccountCRUDBasedPureAnnotation.domain.Account;
import Demo02_SpringIOCCase.Demo03_SpringIOCForAccountCRUDBasedPureAnnotation.service.AccountServiceImpl;
import Demo02_SpringIOCCase.Demo03_SpringIOCForAccountCRUDBasedPureAnnotation.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class DemoMain {

    @Test
    public void testFindAllAccount() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService accountService = ac.getBean("accountService", AccountServiceImpl.class);
        List<Account> accountList = accountService.findAllAccount();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindAccountById() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService accountService = ac.getBean("accountService", AccountServiceImpl.class);
        Account account = accountService.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSaveAccount() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService accountService = ac.getBean("accountService", AccountServiceImpl.class);
        Account account = new Account();
        account.setName("save account");
        account.setMoney(1000F);
        accountService.saveAccount(account);
    }

    @Test
    public void testUpdateAccount() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService accountService = ac.getBean("accountService", AccountServiceImpl.class);
        Account account = new Account();
        account.setId(4);
        account.setName("update account");
        account.setMoney(2000F);
        accountService.updateAccount(account);
    }

    @Test
    public void testDeleteAccount() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService accountService = ac.getBean("accountService", AccountServiceImpl.class);
        accountService.deleteAccount(4);
    }


}
