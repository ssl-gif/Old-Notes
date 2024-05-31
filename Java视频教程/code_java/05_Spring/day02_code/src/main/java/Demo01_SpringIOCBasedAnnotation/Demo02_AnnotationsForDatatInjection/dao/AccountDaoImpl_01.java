package Demo01_SpringIOCBasedAnnotation.Demo02_AnnotationsForDatatInjection.dao;

import org.springframework.stereotype.Component;

@Component("accountDao01")
public class AccountDaoImpl_01 implements IAccountDao {

    @Override
    public void saveAccount() {
        System.out.println("保存账户---accountDao01");
    }

}
