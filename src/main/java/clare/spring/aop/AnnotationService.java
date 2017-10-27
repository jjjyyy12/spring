package clare.spring.aop;

import org.springframework.stereotype.Service;

/**
 *  使用注解被拦截
 */
@Service
public class AnnotationService {
	@AopAction1(name = "add1",age=1)
    public void add1() {
        System.out.println("正文add-1");
    }
	@AopAction2(AopMethod1="add2's AopMethod1",AopMethod2="add2's AopMethod2",AopMethod3=1)
    public void add2() {
        System.out.println("正文add-2");
    }

    @AopAction1(name = "add3",age=3)
    public void add3() {
        System.out.println("正文add-3");

    }

}
