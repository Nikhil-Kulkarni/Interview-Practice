public class ShortestPalindrome {
    public static void main(String[] args) {
        System.out.println(shortestPalindrome("aacecaaa"));
    }

    public static String shortestPalindrome(String str) {
        String result = "";
        for (int i = str.length() / 2; i >= 1; i--) {
            if ((result = scan(str, i - 1, i)) != null) {
                return result;
            }
            if ((result = scan(str, i, i)) != null) {
                return result;
            }
        }
        return result;
    }

    public static String scan(String str, int low, int high) {
        while (low >= 0 && high < str.length()) {
            if (str.charAt(low) != str.charAt(high)) {
                break;
            }
            low--;
            high++;
        }
        if (low <= 0) {
            StringBuilder temp = new StringBuilder(str.substring(high));
            temp.reverse();
            temp.append(str);
            return temp.toString();
        }
        return null;
    }
}
