import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        Collections.shuffle(list);
        int[] arr = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(arr));

//        System.out.println("Bubble");
//        BubbleSort.sort(list);

        arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Insertion");
        InsertionSort.sort(arr);
    }
}
