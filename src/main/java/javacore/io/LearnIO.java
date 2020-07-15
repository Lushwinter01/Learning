package javacore.io;

import java.io.*;

/**
 * @author LushWinter (ahbbhywmd@163.com)
 * @Description
 * @create 2020-03-09
 */
public class LearnIO {
    public static void main(String args[]) throws IOException {
        File file = new File("testio.txt");
        // FileInputStream fis = new FileInputStream(file);
//        int result;
//        while ((result = fis.read()) != -1) {
//            System.out.println(result);
//        }
//        byte[] bytes = new byte[1024];
//        int count;
//        while ((count = fis.read(bytes)) != -1) {
//            System.out.println(count);
//            String s = new String(bytes, 0, count);
//            System.out.println(s);
//
//        }
//        FileOutputStream fos = new FileOutputStream(file);
//        fos.write("生当做人杰，死亦为鬼雄".getBytes());
//        fos.close();

        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(new File("test.txt"));
        byte[] b = new byte[1024];
        int count;
        while((count = fis.read(b)) != -1) {
            fos.write(b,0, count);
        }
        fis.close();
        fos.close();








    }
}
