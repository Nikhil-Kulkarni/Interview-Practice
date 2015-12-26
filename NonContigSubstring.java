public class NonContigSubstring {
    public static void main(String[] args) {
        System.out.println(numSubs("catapult", "", "cat", 0));
    }

    public static int numSubs(String str, String prefix, String sub, int index) {
        if (prefix.length() == sub.length()) {
            return 1;
        }
        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == sub.charAt(index)) {
                total += numSubs(str.substring(i), prefix + str.charAt(i), sub, index + 1);
            }
        }
        return total;
    }

    public static int numSubsDP(String str, String sub) {
        int[][] grid = new int[str.length() + 1][sub.length() + 1];

    }
}
