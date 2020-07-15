package designpattern.create.singleton;

/**
 * @author LushWinter (ahbbhywmd@163.com)
 * @Description
 * @create 2020-03-07
 */
public class InnerClassSingleton {
    private static InnerClassSingleton singleton;

    private InnerClassSingleton() {

    }

    public static InnerClassSingleton getInstance() {
        return InnerClass.singleton;
    }

    private static class InnerClass {
        private static final InnerClassSingleton  singleton = new InnerClassSingleton();

    }

    public static void main(String args[]) {
        InnerClassSingleton singleton1 =  InnerClassSingleton.getInstance();
        InnerClassSingleton singleton2 =  InnerClassSingleton.getInstance();
        System.out.println(singleton1 == singleton2);

    }

    public Object readResovle() {
            return InnerClass.singleton;
    }

}
