package Demo02_SpringAOP.Demo03_SpringAOPBasedAnnotation;

import Demo02_SpringAOP.Demo03_SpringAOPBasedAnnotation.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:Demo05_bean.xml")
public class DemoMain {

    @Autowired
    private IAccountService accountService;

    @Test
    public void testSaveAccount() {
        accountService.saveAccount();
    }

    @Test
    public void testUpdateAccount() {
        accountService.updateAccount(1);
    }

    @Test
    public void testDeleteAccount() {
        int i = accountService.deleteAccount();
        System.out.println(i);
    }

}
