// Given a string (1d array), find all patterns (may or may not be continuous)
// Ex. abcghadkb => 'ab' is a pattern since a follows b twice
public class LCSII {
    public static void main(String[] args) {
        String a = "abcghlawsb"; // "ab" is pattern
        String b = "aabbaa";     // "aa" is pattern
        String max = "";
        for (int i = 0; i < a.length(); i++) {
            String result = lcs(a.substring(0, i), a.substring(i));
            if (result.length() > max.length()) {
                max = result;
            }
        }
        System.out.println(max);
    }

    public static String lcs(String str, String sub) {
        int[][] grid = new int[str.length() + 1][sub.length() + 1];
        grid[0][0] = 0;
        for (int i = 1; i <= str.length(); i++) {
            for (int j = 1; j <= sub.length(); j++) {
                if (str.charAt(i - 1) == sub.charAt(j - 1)) {
                    grid[i][j] = 1 + grid[i - 1][j - 1];
                } else {
                    grid[i][j] = Math.max(grid[i - 1][j], grid[i][j - 1]);
                }
            }
        }
        int i = grid.length - 1;
        int j = grid[0].length - 1;
        StringBuilder pattern = new StringBuilder();
        while (i > 0 && j > 0) {
            if (str.charAt(i - 1) == sub.charAt(j - 1)) {
                pattern.append(str.charAt(i - 1));
                i = i - 1;
                j = j - 1;
            } else {
                if (grid[i - 1][j] > grid[i][j - 1]) {
                    i = i - 1;
                } else {
                    j = j - 1;
                }
            }
        }
        return pattern.reverse().toString();
    }
}
