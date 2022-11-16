public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,7,83,321,768};
        int target = 1;
        System.out.println(FloorNum(arr,target));
    }
    static int FloorNum(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (start == end) {
                return arr[start-1];
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return arr[end];
    }
}
