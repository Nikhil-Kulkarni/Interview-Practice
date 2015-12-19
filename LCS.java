public class LCS {
    public static void main(String[] args) {
        String str = "ABCDGH";
        String sub = "AEDFHR";
        System.out.println(lcsDP(str, sub));
    }

    public static int lcs(String str, String sub) {
        if (str.length() == 0 || sub.length() == 0) {
            return 0;
        } else if (str.charAt(str.length() - 1) == sub.charAt(sub.length() - 1)) {
            return 1 + lcs(str.substring(0, str.length() - 1), sub.substring(0, sub.length() - 1));
        } else {
            return Math.max(lcs(str.substring(0, str.length() - 1), sub), lcs(str, sub.substring(0, sub.length() - 1)));
        }
    }

    public static String lcsDP(String str, String sub) {
        int[][] matrix = new int[str.length() + 1][sub.length() + 1];
        matrix[0][0] = 0;
        for (int i = 1; i <= str.length(); i++) {
            for (int j = 1; j <= sub.length(); j++) {
                if (str.charAt(i-1) == sub.charAt(j-1)) {
                    matrix[i][j] = 1 + matrix[i - 1][j - 1];
                } else {
                    matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
                }
            }
        }
        StringBuilder lcs = new StringBuilder();
        int i = matrix.length - 1;
        int j = matrix[0].length - 1;
        while (i > 0 && j > 0) {
            if (str.charAt(i -1) == sub.charAt(j - 1)) {
                lcs.append(str.charAt(i - 1));
                i = i - 1;
                j = j - 1;
            } else {
                if (matrix[i][j - 1] > matrix[i - 1][j]) {
                    j = j - 1;
                } else {
                    i = i - 1;
                }
            }
        }
        return lcs.reverse().toString();
    }
}
