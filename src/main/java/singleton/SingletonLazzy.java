package singleton;

public class SingletonLazzy {
	private static SingletonLazzy singleton = null;

	private SingletonLazzy() {

	}

	public static SingletonLazzy getSingleton() {
		synchronized (SingletonLazzy.class) {
			if (singleton == null) {
				singleton = new SingletonLazzy();
			}
		}
		return singleton;
	}

}