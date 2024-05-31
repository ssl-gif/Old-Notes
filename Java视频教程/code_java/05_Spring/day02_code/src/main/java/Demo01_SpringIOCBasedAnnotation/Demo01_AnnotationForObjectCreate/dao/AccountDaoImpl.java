package Demo01_SpringIOCBasedAnnotation.Demo01_AnnotationForObjectCreate.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Component;

// @Component("accountDao")
@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {

    @Override
    public void saveAccount() {
        System.out.println("保存账户");
    }

}
