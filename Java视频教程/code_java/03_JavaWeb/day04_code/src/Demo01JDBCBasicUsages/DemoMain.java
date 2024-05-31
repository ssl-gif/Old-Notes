package Demo01JDBCBasicUsages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// JDBC快速入门程序：
public class DemoMain {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        /*
        1.导入数据库驱动jar包：(第三方类库的使用方法与其类似)
            ①.复制mysql-connector-java-5.1.37-bin.jar包到lib目录下
            ②.右键 --> Add As Library 将其添加成库，就可以使用jar包里面的内容了
         */

        // 2.注册数据库驱动
        Class.forName("com.mysql.jdbc.Driver");

        // 3.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

        // 4.定义sql语句
        String sql = "update account set balance = 2000 where id = 1";

        // 5.获取执行sql语句的对象
        Statement stmt = conn.createStatement();

        // 6.执行sql语句并接收返回结果
        int count = stmt.executeUpdate(sql);

        // 7.处理sql语句的返回结果
        System.out.println(count);

        // 8.释放资源
        stmt.close();
        conn.close();
    }
}
