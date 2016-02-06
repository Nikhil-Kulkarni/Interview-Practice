public class LongestPalindromicString {
    public static void main(String[] args) {
        System.out.println(lps("nikhilikhin"));
    }

    public static String lps(String str) {
        String longestSubstring = "";
        for (int i = 1; i < str.length(); i++) {
            String temp = expand(str, i - 1, i);
            if (temp.length() > longestSubstring.length()) {
                longestSubstring = temp;
            }
            temp = expand(str, i, i);
            if (temp.length() > longestSubstring.length()) {
                longestSubstring = temp;
            }
        }
        return longestSubstring;
    }

    public static String expand(String str, int low, int high) {
        while (low >= 0 && high < str.length()) {
            if (str.charAt(low) != str.charAt(high)) {
                break;
            } else {
                low--;
                high++;
            }
        }
        return str.substring(low + 1, high);
    }
}
