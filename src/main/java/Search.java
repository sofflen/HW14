public class Search {

    public int interpolationSearch(int[] arr, int x) {
        new Sort().insertSort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (arr[left] <= x && arr[right] >= x) {
            int mid = left + ((x - arr[left]) * (right - left)) / (arr[right] - arr[left]);

            if (arr[mid] < x)
                left = mid + 1;
            else if (arr[mid] > x)
                right = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
