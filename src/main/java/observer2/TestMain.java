package observer2;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestMain {
    public static void main(String[] args) {
        // 定义三个监听器
        List<AbstractEventListener> listeners = new ArrayList<AbstractEventListener>() {
            {
                add(new Test1EventListener(2));
                add(new Test2EventListener(1));
                add(new Test3EventListener(3));
            }
        };

        // 根据order做排序
        listeners = listeners.stream().sorted(Comparator.comparing(AbstractEventListener::getOrder)).collect(Collectors.toList());

        // 定义广播器
        EventMulticaster eventMulticaster = new EventMulticaster(listeners);

        // 定义eventObject


    }
}
