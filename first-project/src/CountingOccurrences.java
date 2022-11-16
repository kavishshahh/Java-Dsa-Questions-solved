import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;

        while (n > 0) {
            int remainder = n % 10;
            if (remainder == 3) {
                count++;
            }
            n = n/10;
        }
        System.out.println("Number of times " + 3 + " has been repeated is: " + count);
    }
}
