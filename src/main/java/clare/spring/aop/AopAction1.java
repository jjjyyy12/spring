package clare.spring.aop;


import java.lang.annotation.*;

/**
 * 这就是一个普通的注解，@Target一行表示该注解将作用在方法上，@Retention一行表示该注解将一直保存到运行时，@Documented表示该注解将保存在javadoc中。
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AopAction1 {
    String name();
    int age();
}
