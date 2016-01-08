import java.util.*;
public class SubstringKUnique {
    // Longest substring with k unique characters
    public static void main(String[] args) {
        System.out.println(longestSub("aabcdefffggawoi", 3));
    }

    public static String longestSub(String str, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        String substring = "";
        int left = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
            if (map.size() == k + 1) {
                String sub = str.substring(left, i);
                if (sub.length() > maxLen) {
                    maxLen = sub.length();
                    substring = sub;
                }
                while (map.size() != k) {
                    char temp = str.charAt(left);
                    if (map.get(temp) > 1) {
                        map.put(temp, map.get(temp) - 1);
                    } else {
                        map.remove(temp);
                    }
                    left++;
                }
            }
        }
        return substring;
    }
}
