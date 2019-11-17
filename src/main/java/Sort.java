public class Sort {

    public void insertSort(int[] arr) {
        int number;
        int temp;
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            temp = arr[i];
            number = i;
            while (number > 0 && arr[number - 1] >= temp) {
                arr[number] = arr[number - 1];
                number--;
            }
            arr[number] = temp;
        }
    }
}