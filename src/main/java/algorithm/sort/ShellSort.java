package algorithm.sort;

/**
 * @author LushWinter (ahbbhywmd@163.com)
 * @Description
 * @create 2020-03-07
 */
public class ShellSort {
    // 1、时间复杂度：O(nlogn)  2、空间复杂度：O(1)  3、非稳定排序  4、原地排序
    public static int[] shellSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        int n = arr.length;
        // 分组
        for (int h = n/2; h > 0; h /= 2) {
            // 对各个局部进行插入排序
            for (int i = h; i < n; i++) {
                // i 插入到分组正确的位置上
                insert(arr, h, i);
            }
        }
        return arr;
    }

    private static void insert(int[] arr, int h, int i) {
        int tmp = arr[i];
        int k;
        for (k = i-h; k >= 0 && tmp < arr[k]; k -= h) {
            arr[k+h] = arr[k];
        }
        arr[k+h] = tmp;
    }

    public static void main(String args[]) {
        int[] arr = {1, 6, 0, 7, 9, 8, 9, 5};
        int[] ret = shellSort(arr);
        for (int i = 0; i < ret.length; i++) {
            System.out.print(ret[i]);
            System.out.print(",");
        }
    }
}
