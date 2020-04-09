package observer2;

import java.util.List;

/**
 * 事件广播器
 */
public class OrderEventMulticaster {
    private List<AbstractEventListener> listeners;

    public OrderEventMulticaster(List<AbstractEventListener> listeners) {
        this.listeners = listeners;
    }

    /**
     * 广播事件
     */
    public void multicastEvent(Event event) {
        // 按照设置的顺序执行事件监听器
        for (AbstractEventListener listener : listeners) {
            listener.onEvent(event);
        }
    }

}
