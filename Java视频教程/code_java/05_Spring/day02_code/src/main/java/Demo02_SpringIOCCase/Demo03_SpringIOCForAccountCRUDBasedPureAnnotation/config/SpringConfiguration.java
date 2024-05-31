package Demo02_SpringIOCCase.Demo03_SpringIOCForAccountCRUDBasedPureAnnotation.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@ComponentScan("Demo02_SpringIOCCase.Demo03_SpringIOCForAccountCRUDBasedPureAnnotation")
public class SpringConfiguration {

    @Bean(name = "runner")
    @Scope("prototype")
    public QueryRunner createQueryRunner(DataSource dataSource) {
        return new QueryRunner(dataSource);
    }

    @Bean(name = "dataSource")
    public DataSource createDataSource() {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        try {
            ds.setDriverClass("com.mysql.jdbc.Driver");
            ds.setJdbcUrl("jdbc:mysql://localhost:3306/05_Spring");
            ds.setUser("root");
            ds.setPassword("root");
        } catch (PropertyVetoException e) {
            throw new RuntimeException(e);
        }
        return ds;
    }

}
