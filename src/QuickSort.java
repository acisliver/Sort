import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int left, int right) {
        int part = partition(arr, left, right);
        if (left < part - 1) {
            quickSort(arr, left, part - 1);
        }
        if (right > part) {
            quickSort(arr, part, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int mid = (left + right) >>> 1;
        int pivot = arr[mid];
        System.out.printf("pivot: %d\n", pivot);
        while (left <= right) {
            while (arr[left] < pivot) {
                left += 1;
            }
            while (arr[right] > pivot) {
                right -= 1;
            }
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left += 1;
                right -= 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        return left;
    }
}
