package Demo01_TransactionAndDynamicProxy.Demo02_DynamicProxyForTransactionControl.Demo03_DynamicProxyForTransactionControl.utils;

import java.sql.SQLException;

// 事务管理的工具类
public class TransactionManager {

    private ConnectionUtils connectionUtils;

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    // 开启事务
    public void startTransaction() {
        try {
            connectionUtils.getThreadConnection().setAutoCommit(false);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 提交事务
    public void commitTransaction() {
        try {
            connectionUtils.getThreadConnection().commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 回滚事务
    public void rollbackTransaction() {
        try {
            connectionUtils.getThreadConnection().rollback();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 释放资源
    public void release() {
        try {
            connectionUtils.getThreadConnection().close(); // ①.关闭当前线程的数据库连接
            connectionUtils.removeConnection();            // ②.把数据库连接和线程解绑
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}