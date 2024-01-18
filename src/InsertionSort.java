import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int inserted = arr[i];
            int j;
            // 정렬된 부분 탐색
            // 만약 배열이 이미 정렬되어있다면 해당 반복문에서 1번만 반복함
            for (j = i - 1; j >= 0; j--) {
                // inserted보다 작은 값을 만나면 j + 1번 위치에 삽입
                if (arr[j] < inserted) {
                    break;
                }
                arr[j + 1] = arr[j];    // 정렬된 부분을 오른쪽으로 한 칸씩 이동
            }
            arr[j + 1] = inserted;
            System.out.printf("%d회전: %s\n", i, Arrays.toString(arr));
        }
    }
}
