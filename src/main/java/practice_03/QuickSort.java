package practice_03;

import java.util.Arrays;

public class QuickSort implements Sortable {
    @Override
    public int[] sort(int[] array) {
        return Arrays.stream(array).sorted().toArray();
    }
}
