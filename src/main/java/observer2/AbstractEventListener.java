package observer2;

public class AbstractEventListener implements EventListener {

    private int order;

    public AbstractEventListener(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    @Override
    public void onEvent(Event event) {

    }
}
