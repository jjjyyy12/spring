package clare.spring.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 *  Spring 条件注解@Conditional

@Conditional注解有点类似于@Profile注解，只不过比起@Profile更灵活。使用@Conditional注解我们可以根据条件更加灵活的创建Bean。我们来看一个案例。假设我想获取一个查看当前目录的命令，在Windows下该命令为dir，在Linux下该命令为ls，当程序运行在Windows下时返回dir，当程序运行在Linux下时返回ls。我们来看看这个怎么实现。
 */
@Configuration
public class MyConfig {
    @Bean
    @Conditional(WindowsCondition.class)
    public IListService windowListService() {
        return new WindowsListService();
    }
    @Bean
    @Conditional(LinuxCondition.class)
    public IListService linuxListService() {
        return new LinuxListService();
    }
}