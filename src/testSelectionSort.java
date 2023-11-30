import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class testSelectionSort {

    @Test
    public void testPositive() {
        int[] arr = { 8, 9, 7, 10, 2 };
        int[] sortedArr = { 2, 7, 8, 9, 10 };
        SelectionSort selectionSort = new SelectionSort();
        int[] result = selectionSort.basicSelectionSort(arr);
        assertArrayEquals(sortedArr, result);
    }

    @Test
    public void testNegative() {
        int[] arr = { -5, -2, -8, -1, -7 };
        int[] sortedArr = { -8, -7, -5, -2, -1 };
        SelectionSort selectionSort = new SelectionSort();
        int[] result = selectionSort.basicSelectionSort(arr);
        assertArrayEquals(sortedArr, result);
    }

    @Test
    public void testMix() {
        int[] arr = { 4, -3, 0, 8, -1 };
        int[] sortedArr = { -3, -1, 0, 4, 8 };
        SelectionSort selectionSort = new SelectionSort();
        int[] result = selectionSort.basicSelectionSort(arr);
        assertArrayEquals(sortedArr, result);
    }

    @Test
    public void testDuplicates() {
        int[] arr = { 5, 2, 8, 2, 7, 5 };
        int[] sortedArr = { 2, 2, 5, 5, 7, 8 };
        SelectionSort selectionSort = new SelectionSort();
        int[] result = selectionSort.basicSelectionSort(arr);
        assertArrayEquals(sortedArr, result);
    }
}
