package Demo02_SpringIOCCase.Demo01_SpringIOCForAccountCRUDBasedXML;

import Demo02_SpringIOCCase.Demo01_SpringIOCForAccountCRUDBasedXML.domain.Account;
import Demo02_SpringIOCCase.Demo01_SpringIOCForAccountCRUDBasedXML.service.AccountServiceImpl;
import Demo02_SpringIOCCase.Demo01_SpringIOCForAccountCRUDBasedXML.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DemoMain {

    @Test
    public void testFindAllAccount() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Demo05_bean.xml");
        IAccountService accountService = ac.getBean("accountService", AccountServiceImpl.class);
        List<Account> accountList = accountService.findAllAccount();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindAccountById() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Demo05_bean.xml");
        IAccountService accountService = ac.getBean("accountService", AccountServiceImpl.class);
        Account account = accountService.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSaveAccount() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Demo05_bean.xml");
        IAccountService accountService = ac.getBean("accountService", AccountServiceImpl.class);
        Account account = new Account();
        account.setName("save account");
        account.setMoney(1000F);
        accountService.saveAccount(account);
    }

    @Test
    public void testUpdateAccount() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Demo05_bean.xml");
        IAccountService accountService = ac.getBean("accountService", AccountServiceImpl.class);
        Account account = new Account();
        account.setId(4);
        account.setName("update account");
        account.setMoney(2000F);
        accountService.updateAccount(account);
    }

    @Test
    public void testDeleteAccount() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Demo05_bean.xml");
        IAccountService accountService = ac.getBean("accountService", AccountServiceImpl.class);
        accountService.deleteAccount(4);
    }


}
