package Demo01_SpringIOCBasedAnnotation.Demo04_AnnotationsForLifeCycle.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("accountDao")
public class AccountDaoImpl implements IAccountDao {

    @Override
    public void saveAccount() {
        System.out.println("保存账户");
    }

}
