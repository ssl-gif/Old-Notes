package Demo01_SpringIOCBasedAnnotation.Demo03_AnnotationsForChangeScope.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("accountDao")
@Scope("prototype")
public class AccountDaoImpl implements IAccountDao {

    @Override
    public void saveAccount() {
        System.out.println("保存账户");
    }

}
