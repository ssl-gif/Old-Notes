package Demo02_SpringAOP.Demo05_SpringAOPForTransactionControl;

import Demo02_SpringAOP.Demo05_SpringAOPForTransactionControl.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:Demo06_bean.xml")
public class DemoMain {

    @Autowired
    private IAccountService accountService;

    @Test
    public void testTransfer() {
        accountService.transfer("aaa", "bbb", 500F);
    }

}
