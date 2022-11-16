public class SearchInRange {
    public static void main(String[] args) {
        String name = "kavish";
        char target = 's';
        System.out.println(linearRange(name, target, 2,4));
    }
    static boolean linearRange(String str, char target ,int start, int end) {
        if (str.length() == 0) return false;

        for (int i = start; i <= end; i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }
}
