package algorithm.sort;

/**
 * @author LushWinter (ahbbhywmd@163.com)
 * @Description
 * @create 2020-03-07
 */
public class BubbleSort {
    // 1、时间复杂度：O(n2)  2、空间复杂度：O(1)  3、稳定排序  4、原地排序
    public static int[] bubbleSort(int arr[]) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for(int j = 0; j < length - i -1; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        int[] arr = {4,1,6,0,7,9,8,9};
        int[] ret = bubbleSort(arr);
        for (int i = 0; i < ret.length; i++) {
            System.out.print(ret[i]);
            System.out.print(",");
        }
    }
}
