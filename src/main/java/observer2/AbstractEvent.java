package observer2;

import java.util.EventObject;

public class AbstractEvent implements Event {

    private long timestamp;
    private EventObject eventObject;

    public AbstractEvent(EventObject eventObject) {
        this.eventObject = eventObject;
    }

    @Override
    public EventObject getEventObject() {
        return this.eventObject;
    }

    @Override
    public void setEventObject(EventObject eventObject) {
        this.eventObject = eventObject;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

}
