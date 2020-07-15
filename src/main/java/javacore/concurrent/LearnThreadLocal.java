package javacore.concurrent;

/**
 * @author LushWinter (ahbbhywmd@163.com)
 * @Description
 * @create 2020-03-10
 */
public class LearnThreadLocal {


    public static int f(int n){
        if(n<=3){
            return 1;
        }else{
            return f(n-2)+f(n-4)+1;
        }
    }

    public static void main(String args[]) {
        System.out.println(f(8));
    }
}
