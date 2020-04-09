package observer;

public class ObserverTest {
	public static void main(String[] args) {
		Service n1 = new Service();
		ClientX observer1 = new ClientX();
		observer1.openPushMsg(n1);
		n1.setNews("现在时间:" + System.currentTimeMillis());
		n1.setNews("现在时间:" + System.currentTimeMillis());
	}
}
