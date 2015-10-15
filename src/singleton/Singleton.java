package singleton;

/**
 * Created by eder on 14/10/15.
 */
public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton geInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    }

}
