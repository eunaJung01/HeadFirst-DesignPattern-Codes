package Chapter_05.dcl;

public class SingletonClient {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getDescription());
	}

}
