package clare.spring.aop;

import org.springframework.stereotype.Service;

/**
 *  
 */
@Service
public class ExecutionService {
	@AopAction1(name = "eadd1",age=1)
    public void eadd1() {
        System.out.println("正文eadd-1");
    }

    public void eadd2() {
        System.out.println("正文eadd-2");
    }

    @AopAction1(name = "eadd3",age=3)
    public void eadd3() {
        System.out.println("正文eadd-3");
    }

}
