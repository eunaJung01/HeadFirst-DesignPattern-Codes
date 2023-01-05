package Chapter_5.statical_initiate;

public class SingletonClient {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getDescription());
	}

}
