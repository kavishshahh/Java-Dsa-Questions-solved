public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,7,83,321,768};
        int target = 83;
        System.out.println(Ceiling(arr,target));
    }

    static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[arr.length-1]) {
                return -1;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
