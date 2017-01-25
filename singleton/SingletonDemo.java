package singleton;

public class SingletonDemo {
	public static void main(String[] args) {
		
		//	illegal construct
	    //	Compile Time Error: The constructor SingleObject() is not visible
	    //	SingleObject object = new SingleObject();
		
		Singleton instance = Singleton.getInstance();
		
		instance.showMessage();
	}
}
