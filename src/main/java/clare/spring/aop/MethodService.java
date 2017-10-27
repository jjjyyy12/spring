package clare.spring.aop;

import org.springframework.stereotype.Service;
/*
 * 4.使用方法规则被拦截

 * */
@Service
public class MethodService {
    public void add() {
        System.out.println("method-add()");
    }
}