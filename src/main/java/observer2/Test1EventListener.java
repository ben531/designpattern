package observer2;

import com.alibaba.fastjson.JSONObject;

import java.util.EventObject;

public class Test1EventListener extends AbstractEventListener {
    public Test1EventListener(int order) {
        super(order);
    }

    @Override
    public void onEvent(Event event) {
        System.out.println("事件监听器1执行");
        // 获取事件持有的对象
        EventObject eventObject = event.getEventObject();
        System.out.println(JSONObject.toJSONString(eventObject));

        // 执行事件1的业务逻辑
    }
}
