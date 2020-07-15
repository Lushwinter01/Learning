package algorithm.sort;

/**
 * @author LushWinter (ahbbhywmd@163.com)
 * @Description
 * @create 2020-03-07
 */
public class SelectSort {
    // 1、时间复杂度：O(n2)  2、空间复杂度：O(1)  3、非稳定排序  4、原地排序
    public static int[] selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
           return arr;
        }

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
        return arr;
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 6, 0, 7, 9, 8, 9};
        int[] ret = selectSort(arr);
        for (int i = 0; i < ret.length; i++) {
            System.out.print(ret[i]);
            System.out.print(",");
        }
    }
}
