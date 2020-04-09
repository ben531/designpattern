package observer2;

import java.io.Serializable;
import java.util.EventObject;

/**
 * 事件接口
 */
public interface Event extends Serializable {
    /**
     * 获取时间持有的对象
     * @return
     */
    EventObject getEventObject();

    /**
     * 设置事件持有的数据对象
     * @param eventObject
     */
    void setEventObject(EventObject eventObject);
}
