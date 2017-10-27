package clare.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 */

public class MsgEvent extends ApplicationEvent
{

	private static final long serialVersionUID = -5939676213903657625L;
 
	private String msg;

    public MsgEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
