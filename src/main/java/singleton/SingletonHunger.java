package singleton;

public class SingletonHunger {
	private static SingletonHunger singleton = new SingletonHunger();

	private SingletonHunger() {

	}
	
	public static SingletonHunger getSingleton() {
		return singleton;
	}
}
