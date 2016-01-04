package investigate.java.core;

public class SingletonNonLazy {
	private static SingletonNonLazy _INSTANCE;
	private SingletonNonLazy(){ }
	public static SingletonNonLazy getInstance(){
	     if(_INSTANCE == null){
	         synchronized(SingletonNonLazy.class){
	         //double checked locking - because second check of Singleton instance with lock
	                if(_INSTANCE == null){
	                    _INSTANCE = new SingletonNonLazy();
	                }
	            }
	         }
	     return _INSTANCE;
	}
}
