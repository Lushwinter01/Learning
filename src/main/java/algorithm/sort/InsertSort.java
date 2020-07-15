package algorithm.sort;

/**
 * @author LushWinter (ahbbhywmd@163.com)
 * @Description
 * @create 2020-03-07
 */
public class InsertSort {
    // 1、时间复杂度：O(n2)  2、空间复杂度：O(1)  3、稳定排序  4、原地排序
    public static int[] insertSort(int arr[]) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int tmp = arr[i];
            int k = i - 1;
            while(k >= 0 && arr[k] > tmp) {
                k--;
            }

            for (int j = i; j > k+1; j--) {
              arr[j] = arr[j-1];
            }

            arr[k+1] = tmp;
        }
        return arr;
    }

    public static void main(String args[]) {
        int[] arr = {4,1,6,0,7,9,8,9};
        int[] ret = insertSort(arr);
        for (int i = 0; i < ret.length; i++) {
            System.out.print(ret[i]);
            System.out.print(",");
        }
    }
}
