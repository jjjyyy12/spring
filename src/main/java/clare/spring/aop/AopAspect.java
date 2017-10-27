package clare.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 编写切面,核心类
 */
@Aspect
@Component
public class AopAspect {
    @Pointcut("@annotation(clare.spring.aop.AopAction1)")
    public void annotationPointCut() {
    }

    //after表示先执行方法，后拦截，before表示先拦截，后执行方法
//    @Before("annotationPointCut()")
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        AopAction1 action1 = method.getAnnotation(AopAction1.class);
        System.out.println("注解式拦截AopAction1,after:"+action1.name()+"_"+action1.age());
        System.out.println("----------------------------------------------------------------end");
    }
    @Before("annotationPointCut()")
    public void Before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        AopAction1 action = method.getAnnotation(AopAction1.class);
        System.out.println("----------------------------------------------------------------begin");
        System.out.println("注解式拦截AopAction1,before:"+action.name()+"_"+action.age());
    }
    @Pointcut("@annotation(clare.spring.aop.AopAction2)")
    public void annotationPointCut2() {
    }
    @Before("annotationPointCut2()")
    public void Before2(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        AopAction2 action = method.getAnnotation(AopAction2.class);
        System.out.println("----------------------------------------------------------------begin");
        System.out.println("注解式拦截AopAction2,before:"+action.AopMethod1()+"_"+action.AopMethod2()+"_"+action.AopMethod3());
    }
    @After("annotationPointCut2()")
    public void after2(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        AopAction2 action = method.getAnnotation(AopAction2.class);
        System.out.println("注解式拦截AopAction2,after:"+action.AopMethod1()+"_"+action.AopMethod2()+"_"+action.AopMethod3());
        System.out.println("----------------------------------------------------------------end");
    }
    /**
     * 第一个星号表示返回类型，×表示所有类型，注意第一个星号和包名之间有空格
     * 后面的星号表示任意字符
     * 两个点表示任意个参数
     *
     * 参考  http://www.cnblogs.com/yansum/p/5898412.html
     * @param joinPoint
     */
    @Before("execution(* clare.spring.aop.MethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("----------------------------------------------------------------begin");
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截MethodService,@Before(\"execution(* clare.spring.aop.MethodService.*(..))\")："+method.getName());
    }
    
    
    
    
    @Pointcut("execution(public * clare.spring.aop.ExecutionService.*(..))")
    public void executionPointCut() {
    }
    
    @Before("executionPointCut()")
    public void servicebefore() {
        System.out.println("----------------------------------------------------------------begin");
        System.out.println(" 方法规则拦截 before,@Pointcut(\"execution(public * clare.spring.aop.ExecutionService.*(..))\")");
    }
    @After("executionPointCut()")
    public void serviceafter() {
        System.out.println(" 方法规则拦截after,@Pointcut(\"execution(public * clare.spring.aop.ExecutionService.*(..))\")");
    } 
    
    @AfterReturning("execution(public * clare.spring.aop.ExecutionService.*(..))")
    public void afterReterning() {
    	 System.out.println(" 方法规则拦截afterReterning");
    	 System.out.println("----------------------------------------------------------------end");
    }
}
