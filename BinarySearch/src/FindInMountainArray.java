
// 1095 leetcode submission left

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr,target));

    }
    static int search(int[] arr, int target){
        int peak = peak(arr, target);
        int firstTry = OrderAgnostic(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        }
        return OrderAgnostic(arr, target, peak + 1, arr.length - 1);
    }

    static int peak(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int OrderAgnostic(int[] arr, int target, int start, int end) {

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
