package clare.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class MsgListener implements ApplicationListener<MsgEvent> {
    public void onApplicationEvent(MsgEvent msgEvent) {
        System.out.println("我收到MsgEvent的事件了:"+msgEvent.getMsg());
    }
}
