package designpattern.create.singleton;

/**
 * @author LushWinter (ahbbhywmd@163.com)
 * @Description
 * @create 2020-03-07
 */
public class SyncSingleton {
    private static SyncSingleton singleton;

    private SyncSingleton() {

    }

    public synchronized static SyncSingleton getInstance() {
        if (singleton == null) {
            singleton = new SyncSingleton();
        }
        return singleton;
    }

}
