package Demo01_TransactionAndDynamicProxy.Demo02_DynamicProxyForTransactionControl.Demo03_DynamicProxyForTransactionControl.utils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

// 数据库连接的工具类：从数据源中获取一个连接，并实现和线程的绑定
public class ConnectionUtils {

    private ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // 获取当前线程上的数据库连接
    public Connection getThreadConnection() {
        try {
            Connection conn = threadLocal.get();
            if (conn == null) {
                conn = dataSource.getConnection();
                threadLocal.set(conn);
            }
            return conn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 把数据库连接和线程解绑
    public void removeConnection() {
        threadLocal.remove();
    }

}
