import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    private Search search = new Search();

    @Test
    void interpolationSearch() {
        int[] arr = new int[]{16, 17, 18, 19, 20, 11, 12, 13, 14, 15, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5};
        int actual = search.interpolationSearch(arr, 17);
        int actual1 = search.interpolationSearch(arr, 1);
        assertEquals(16, actual);
        assertEquals(0, actual1);
    }
}