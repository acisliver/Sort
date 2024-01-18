import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                int small = arr[j - 1];
                int big = arr[j];
                if (small > big) {
                    arr[j - 1] = big;
                    arr[j] = small;
                }
            }
            System.out.printf("%d회전: %s\n", i + 1, Arrays.toString(arr));
        }
    }
}
