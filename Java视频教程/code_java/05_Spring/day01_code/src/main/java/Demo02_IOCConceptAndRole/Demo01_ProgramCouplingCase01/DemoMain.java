package Demo02_IOCConceptAndRole.Demo01_ProgramCouplingCase01;

import java.sql.*;

public class DemoMain {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // 1.注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName("com.mysql.jdbc.Driver");

        // 2.获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/05_spring", "root", "root");

        // 3.获取操作数据库的预处理对象
        PreparedStatement preparedStatement = connection.prepareStatement("select * from account;");

        // 4.执行sql得到结果集
        ResultSet resultSet = preparedStatement.executeQuery();

        //5.遍历结果集
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }

        // 6.释放资源
        resultSet.close();
        preparedStatement.close();
        connection.close();

    }
}
