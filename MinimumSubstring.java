// Minimum substring containing t1, t2, t3

public class MinimumSubstring {
    public static void main(String[] args) {
        System.out.println(minimumSub("wbdwdbqcatdbwgwbcd", "w", "db", "cat"));
    }

    public static String minimumSub(String str, String t1, String t2, String t3) {
        int[] pos_t1 = find(str, t1);
        int[] pos_t2 = find(str, t2);
        int[] pos_t3 = find(str, t3);
        String substring = "";
        int maxLen = str.length();
        int[] slidingWindow = new int[3];
        for (int i = 0; i < str.length(); i++) {
            if (pos_t1[i] == 1) {
                slidingWindow[0] = i;
            }
            if (pos_t2[i] == 1) {
                slidingWindow[1] = i;
            }
            if (pos_t3[i] == 1) {
                slidingWindow[2] = i;
            }
            if (slidingWindow[0] != 0 && slidingWindow[1] != 0 && slidingWindow[2] != 0) {
                int minIndex = Math.min(slidingWindow[0], Math.min(slidingWindow[1], slidingWindow[2]));
                int maxIndex = Math.max(slidingWindow[0] + t1.length(), Math.max(slidingWindow[1] + t2.length(), slidingWindow[2] + t3.length()));
                int length = maxIndex - minIndex;
                if (length < maxLen) {
                    substring = str.substring(minIndex, maxIndex);
                    maxLen = length;
                }
            }
        }
        return substring;
    }

    public static int[] find(String str, String t) {
        int[] pos = new int[str.length()];
        for (int i = 0; i < t.length(); i++) {
            for (int j = i; j < str.length() - t.length() + 1; j += t.length()) {
                String sub = str.substring(j, j + t.length());
                if (sub.equals(t)) {
                    pos[j] = 1;
                }
            }
        }
        return pos;
    }
}
