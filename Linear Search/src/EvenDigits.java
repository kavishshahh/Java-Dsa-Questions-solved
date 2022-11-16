public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean hasEvenDigits(int num) {

        if (num < 0) {
            num = num * -1;
        }

        int count = 0;

        while(num > 0) {
            count++;
            num /= 10;
        }
        return count % 2 == 0;
    }
}
