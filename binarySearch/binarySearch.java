public class binarySearch {
    public static int Search(int arr[],int target) {
        int start = 0;
        int end = arr.length - 1;

            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[start] < arr[end]) {
                    if (target > arr[mid]) {
                        start = mid + 1;
                    } else if (target < arr[mid]) {
                        end = mid - 1;
                    } else
                        return mid;
                }
                else {
                    if (target > arr[mid]) {
                        end=mid-1;
                    } else if (target < arr[mid]) {
                        start = mid+ 1;
                    } else
                        return mid;
                }
            }
    return -1;
    }

}
