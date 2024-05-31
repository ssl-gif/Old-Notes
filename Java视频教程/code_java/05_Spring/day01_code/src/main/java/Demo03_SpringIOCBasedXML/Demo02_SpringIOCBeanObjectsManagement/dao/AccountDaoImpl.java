package Demo03_SpringIOCBasedXML.Demo02_SpringIOCBeanObjectsManagement.dao;

// 账户的持久层实现类
public class AccountDaoImpl implements IAccountDao {

    @Override
    public void saveAccount() {
        System.out.println("保存账户");
    }

}
