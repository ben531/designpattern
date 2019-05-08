package observer;

import java.util.Observable;

public class News extends Observable {
	private String news;

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
		// 发送改变
		setChanged();
		// 推送给客户端
		notifyObservers();
	}
	
}
