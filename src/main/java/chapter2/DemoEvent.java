package chapter2;

import org.springframework.context.ApplicationEvent;

/**
 * created by xdCao on 2017/10/21
 */

public class DemoEvent extends ApplicationEvent {

    private static final long serialVersionUID=1l;
    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
