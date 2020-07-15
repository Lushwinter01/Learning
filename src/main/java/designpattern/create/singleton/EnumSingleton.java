package designpattern.create.singleton;

/**
 * @author LushWinter (ahbbhywmd@163.com)
 * @Description
 * @create 2020-03-07
 */
public enum EnumSingleton {
    singleton;

    public EnumSingleton getInstance() {
        return singleton;
    }
}
