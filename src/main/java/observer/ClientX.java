package observer;

import java.util.Observable;
import java.util.Observer;

public class ClientX implements Observer {
	/**
	 * 打开推送功能
	 * 
	 * @param observable
	 *            被观察者对象（这里是新闻推送端）
	 */
	public void openPushMsg(Observable observable) {
		// 添加到观察者列表
		observable.addObserver(this);
	}

	/**
	 * 实现接口重新的方法 有新消息推送来时，会被调用
	 */
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Service) {
			Service news = (Service) o;
			System.out.println("最新消息: " + news.getNews());
		}
	}

	/**
	 * 关闭推送功能
	 * 
	 * @param observable
	 *            被观察者对象（这里是新闻推送端）
	 */
	public void closePushMsg(Observable observable) {
		// 从观察者列表移除
		observable.deleteObserver(this);
	}
}
