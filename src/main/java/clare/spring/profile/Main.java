package clare.spring.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
* profile注解,ProfileConfig 可以模拟生产和开发环境的初始化
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.getEnvironment().setActiveProfiles("product");
        context.getEnvironment().setActiveProfiles("develop");
        context.register(ProfileConfig.class);
        context.refresh();

        ProfileBean bean = context.getBean(ProfileBean.class);
        System.out.println(bean.getContent());

 
        
        context.close();
    }
}
