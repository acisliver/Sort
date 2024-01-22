import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeSort {
    public static void sort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        // 같은 경우는 하나의 요소만 존재하기 때문에 분할 정복할 필요가 없음
        // left > right일 경우는 없음
        if (left < right) {
            // 재귀 호출로 정렬할 배열을 계속해서 절반으로 나눔
            int mid = (left + right) >>> 1;
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid + 1, right);
            merge(arr, temp, left, mid, right);
            System.out.printf("l: %d, r: %d\n", left, right);
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        // 정렬할 요소 복사
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        // arr는 mid를 기준으로 각각 정렬되어 있음
        int part1 = left;
        int part2 = mid + 1;
        int idx = left;
        while (part1 <= mid && part2 <= right) {
            if (temp[part1] <= temp[part2]) {
                arr[idx] = temp[part1];
                part1 += 1;
            } else {
                arr[idx] = temp[part2];
                part2 += 1;
            }
            idx += 1;
        }

        // 왼쪽 부분의 남은 요소를 오른쪽 끝에 배치
        // 오른쪽 부분이 남은 경우 이미 제자리에 있는 것이므로 배치할 필요 없음
        while (part1 <= mid) {
            arr[idx] = temp[part1];
            part1 += 1;
            idx += 1;
        }
    }

}
