public class RichestWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3,4},
                {3,2,1}
        };
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int x : ints) {
                sum += x;
                if (sum > ans) {
                    ans = sum;
                }
            }
        }
        return ans;
    }
}
