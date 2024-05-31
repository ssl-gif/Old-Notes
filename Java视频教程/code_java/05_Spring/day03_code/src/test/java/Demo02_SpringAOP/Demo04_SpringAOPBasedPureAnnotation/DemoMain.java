package Demo02_SpringAOP.Demo04_SpringAOPBasedPureAnnotation;

import Demo02_SpringAOP.Demo04_SpringAOPBasedPureAnnotation.config.SpringConfiguration;
import Demo02_SpringAOP.Demo04_SpringAOPBasedPureAnnotation.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
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
