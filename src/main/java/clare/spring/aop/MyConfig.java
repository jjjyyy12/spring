package clare.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*
 * @EnableAspectJAutoProxy表示开启Spring对AspectJ代理的支持。
 */
@Configuration
@ComponentScan("clare.spring.aop")
@EnableAspectJAutoProxy
public class MyConfig {

}
