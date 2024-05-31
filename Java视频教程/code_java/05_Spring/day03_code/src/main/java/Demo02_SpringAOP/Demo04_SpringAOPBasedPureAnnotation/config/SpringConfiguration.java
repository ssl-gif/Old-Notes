package Demo02_SpringAOP.Demo04_SpringAOPBasedPureAnnotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("Demo02_SpringAOP.Demo04_SpringAOPBasedPureAnnotation")
@EnableAspectJAutoProxy
public class SpringConfiguration {
}
