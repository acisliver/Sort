import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        Collections.shuffle(list);
        System.out.println(list);

        BubbleSort.sort(list);
        System.out.printf("Bubble\n%s\n", list);
    }
}
