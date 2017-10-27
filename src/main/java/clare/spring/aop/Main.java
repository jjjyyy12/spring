package clare.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *  
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        
        //@Pointcut("@annotation(clare.spring.aop.AopAction)")
        AnnotationService annotationService = context.getBean(AnnotationService.class);
        annotationService.add1();
        annotationService.add2();
        annotationService.add3();
        
        // @Before("execution(* clare.spring.aop.MethodService.*(..))")
        MethodService methodService = context.getBean(MethodService.class);
        methodService.add();
        
        // @Pointcut("execution(public * clare.spring.aop.ExecutionService.*(..))")
        ExecutionService executionService = context.getBean(ExecutionService.class);
        executionService.eadd1();
        
        context.close();
    }
}