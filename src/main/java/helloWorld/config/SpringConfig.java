package helloWorld.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //作为配置类，替代xml
@ComponentScan(basePackages = {"helloWorld"})//配置扫描包
public class SpringConfig {

}
