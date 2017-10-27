package clare.spring.groupanno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring 组合注解与元注解
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        DemoBean bean = context.getBean(DemoBean.class);
        bean.output();
        context.close();
    }
}
