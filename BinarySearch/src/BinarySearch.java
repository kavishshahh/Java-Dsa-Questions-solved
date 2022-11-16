public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {7,67,69,90,105,150,300,800,900};
        int target = 300;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    // return the index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        // mid = start + (end-start) /2
        // mid = (2start + end - start)/2
        //mid = start + end / 2

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
