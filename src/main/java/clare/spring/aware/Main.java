package clare.spring.aware;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring Aware使用案例 让Bean对工厂有知觉
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        AwareService bean = context.getBean(AwareService.class);
        bean.output();
        context.close();
    }
}