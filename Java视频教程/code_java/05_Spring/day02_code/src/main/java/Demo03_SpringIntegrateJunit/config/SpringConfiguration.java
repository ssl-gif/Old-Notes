package Demo03_SpringIntegrateJunit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("Demo03_SpringIntegrateJunit")
@Import(JDBCConfig.class)
@PropertySource("classpath:Demo07_JDBCConfig.properties")
public class SpringConfiguration {
}
