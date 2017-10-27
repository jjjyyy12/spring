package clare.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring中的事件发送与处理案例
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        MsgPublish msgPublish = context.getBean(MsgPublish.class);
        msgPublish.publish("Hello jy !");
        msgPublish.publish("Hello jy !");
        msgPublish.publish("Hello jy !");
        context.close();
    }
}
