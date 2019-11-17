import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    private Sort sort = new Sort();

    @Test
    void insertSort_positives() {
        int[] arr = new int[]{5, 3, 1, 4, 0, 15, 7};
        int[] sortArr = new int[]{0, 1, 3, 4, 5, 7, 15};
        sort.insertSort(arr);
        assertArrayEquals(sortArr, arr);
    }

    @Test
    void insertSort_negatives() {
        int[] arr = new int[]{-5, -3, 0, -1, -4, -15, -7};
        int[] sortArr = new int[]{-15, -7, -5, -4, -3, -1, 0};
        sort.insertSort(arr);
        assertArrayEquals(sortArr, arr);
    }

}