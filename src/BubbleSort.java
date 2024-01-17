import java.util.List;

public class BubbleSort {
    public static <T extends Comparable<T>> void sort(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size() - i; j++) {
                T small = list.get(j - 1);
                T big = list.get(j);
                if (small.compareTo(big) > 0) {
                    list.set(j - 1, big);
                    list.set(j, small);
                }
            }
            System.out.printf("%d회전: %s\n", i + 1, list);
        }
    }
}
