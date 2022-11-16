public class SearchInArray {
    public static void main(String[] args) {
        int[] numbs = {23, 45, 1, 19, 2, 67, 89, -11};
        int target  = 19;
        int ans = linearSearch(numbs,target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index<arr.length; index++) {
            int element = arr[index];
            if (element == target) return index;
        }

        return -1;
    }
}