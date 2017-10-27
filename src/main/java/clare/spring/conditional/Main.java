package clare.spring.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *  Spring 条件注解使用案例
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        IListService bean = context.getBean(IListService.class);
        System.out.println(bean.showListCmd());
        context.close();
    }
}
