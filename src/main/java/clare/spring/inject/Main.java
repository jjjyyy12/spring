package clare.spring.inject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*
 * 注入使用
 * */
public class Main {
	 public static void main(String[] args) {
	        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
	        UseFunctionService bean = context.getBean(UseFunctionService.class);
	        System.out.println(bean.sayHello("clare.spring.inject"));
	        context.close();
	    }
}
