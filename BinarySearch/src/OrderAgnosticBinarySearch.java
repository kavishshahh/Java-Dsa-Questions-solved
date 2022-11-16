// when we don't know if array is sorted in  ascending or descending ,we use order Agnostic Binary search

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arr = {7,67,69,90,105,150,300,800,900};
        int target = 300;
        int ans = OrderAgnostic(arr,target);
        System.out.println(ans);
    }

    static int OrderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        // check if ascending or descending
        boolean isAsc = arr[start] < arr[end];



        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
