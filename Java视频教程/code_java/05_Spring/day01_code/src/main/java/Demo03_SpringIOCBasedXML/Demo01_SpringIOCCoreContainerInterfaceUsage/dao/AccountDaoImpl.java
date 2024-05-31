package Demo03_SpringIOCBasedXML.Demo01_SpringIOCCoreContainerInterfaceUsage.dao;

// 账户的持久层实现类
public class AccountDaoImpl implements IAccountDao {

    @Override
    public void saveAccount() {
        System.out.println("保存账户");
    }

}
