package investigate.java.core;

/**
 * Here is example of creating thread safe singleton in Java using static factory method. 
 * Only disadvantage of this implementing Singleton patter using static field is that this is not a lazy initialization
 *  and Singleton is initialized even before any clients call there getInstance() method.
 * */
public class SingletonLazy{
    private static final SingletonLazy INSTANCE = new SingletonLazy();
 
    private SingletonLazy(){ }

    public static SingletonLazy getInstance(){
        return INSTANCE;
    }
    public void show(){
        System.out.println("Singleon using static initialization in Java");
    }
}





