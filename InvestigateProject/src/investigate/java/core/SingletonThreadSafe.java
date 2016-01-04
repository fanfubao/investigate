package investigate.java.core;

/**
 * Using Enum to create Singleton is by far most simple and effective way to create thread-safe Singleton in Java, 
 * as thread-safety guarantee is provided by Java programming language itself. You don't need to bother about thread-safety issue. 
 * Since Enum instances are by default final in Java, it also provides safety against multiple instance due to serialization.
 * 
 * You can access this Singleton as Singleton.INSTANCE and call any method like below 
 * SingletonThreadSafe.INSTANCE.show();
 * 
 * */

public enum SingletonThreadSafe {
	INSTANCE; 
    public void show(){
        System.out.println("Singleton using Enum in Java");
    }

}
