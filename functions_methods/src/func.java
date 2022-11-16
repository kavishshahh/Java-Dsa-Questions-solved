import java.util.Arrays;
import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.next().trim();

        greet(x);
    }

    static void greet(String ...str) {
        String y = Arrays.toString(str);
        System.out.println("Hello" + y);
    }

}