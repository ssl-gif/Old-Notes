package Demo02_IOCConceptAndRole.Demo02_ProgramCouplingCase02.Demo00_MVCProgram.dao;

// 账户的持久层接口实现类
public class AccountDaoImpl implements IAccountDao {

    @Override
    public void saveAccount() {
        System.out.println("保存账户");
    }

}
