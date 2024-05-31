package Demo01_SpringIOCBasedAnnotation.Demo02_AnnotationsForDatatInjection.dao;

import org.springframework.stereotype.Component;

@Component("accountDao02")
public class AccountDaoImpl_02 implements IAccountDao {

    @Override
    public void saveAccount() {
        System.out.println("保存账户---accountDao02");
    }

}
