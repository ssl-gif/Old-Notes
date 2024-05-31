package Demo01_TransactionAndDynamicProxy.Demo01_TransferCaseWithTransaction.dao;

import Demo01_TransactionAndDynamicProxy.Demo01_TransferCaseWithTransaction.domain.Account;
import Demo01_TransactionAndDynamicProxy.Demo01_TransferCaseWithTransaction.utils.ConnectionUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class AccountDaoImpl implements IAccountDao {

    private QueryRunner runner;

    private ConnectionUtils connectionUtils;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    @Override
    public List<Account> findAccountByName(String name) {
        try {
            return runner.query(connectionUtils.getThreadConnection(), "select * from account where name = ?;", new BeanListHandler<>(Account.class), name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateAccount(Account account) {
        try {
            runner.update(connectionUtils.getThreadConnection(), "update account set name = ?, money = ? where id = ?", account.getName(), account.getMoney(), account.getId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
