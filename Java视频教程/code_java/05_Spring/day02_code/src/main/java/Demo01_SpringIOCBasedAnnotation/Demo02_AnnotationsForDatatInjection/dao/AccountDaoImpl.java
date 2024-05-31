package Demo01_SpringIOCBasedAnnotation.Demo02_AnnotationsForDatatInjection.dao;

import org.springframework.stereotype.Component;

@Component("accountDao")
public class AccountDaoImpl implements IAccountDao {

    @Override
    public void saveAccount() {
        System.out.println("保存账户---accountDao");
    }

}
