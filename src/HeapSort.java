import java.util.Arrays;

public class HeapSort {
    public static void sort(int[] arr) {
        int n = arr.length;

        // (n / 2 - 1)
        // heapify 시작 위치
        // 마지막 레벨 이전 레벨의 마지막 노드 인덱스
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.printf("heap: %s\n", Arrays.toString(arr));
            // 최대값을 배열 맨 뒤로 이동
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            System.out.printf("swap: %s\n", Arrays.toString(arr));
            // 배열 맨 뒤를 제외하고 다시 heapify
            heapify(arr, i, 0);
        }
        System.out.println(Arrays.toString(arr));
    }

    // parent 노드가 자식 노드와 heap 관계를 유지하는지 확인
    private static void heapify(int[] arr, int n, int parent) {
        int max = parent;
        int left = 2 * parent + 1;
        int right = 2 * parent + 2;

        if (left < n && arr[left] > arr[max]) {
            max = left;
        }

        if (right < n && arr[right] > arr[max]) {
            max = right;
        }

        // heap을 만족하는지 확인 후 만족하지 않는다면 swap
        // 이때 swap으로 인해 영향을 받은 서브 트리도 heap을 만족하는지 확인을 해야함
        // 이를 위해 재귀로 heapfiy 호출
        if (max != parent) {
            int temp = arr[max];
            arr[max] = arr[parent];
            arr[parent] = temp;
            heapify(arr, n, max);  // 자식으로 내려간 부모 노드를 부모 노드로하는 서브트리 힙 확인
        }
    }
}
