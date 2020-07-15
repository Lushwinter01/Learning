package practice;

/**
 * @author LushWinter (ahbbhywmd@163.com)
 * @Description
 * @create 2020-04-09
 */
public class DuplicateNum {
    public static void printDCS(int num) {
        // 以当前数据为中心向左向右每次步长为1进行查找和判断
        int left = num - 1;
        int right = num + 1;
        boolean isFind = false;
        while(true) {
            // 向左查询
            if(left > 10) {
                if (isDCS(left)) {
                    System.out.println(left);
                    isFind = true;
                } else {
                    left--;
                }
            }

            // 向右查询
            if (isDCS(right)) {
                System.out.println(right);
                isFind = true;
            } else {
                right++;
            }

            if (isFind) {
                break;
            }
        }
    }

    public static boolean isDCS(int num){
        String s = String.valueOf(num);
        int i = 0;
        int j = s.length() -1;
        while (j > i) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public static void main(String args[]) {
        printDCS(103);
        int f = 9;
        System.out.println("ddd"+9);
    }


}
