// Longest without repeats
import java.util.*;
public class SubstringUnique {
    public static void main(String[] args) {
        System.out.println(uniqueSub("abcabcdefdasblkjl"));
    }

    public static String uniqueSub(String str) {
        String substring = "";
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
                String sub = str.substring(left, i);
                if (sub.length() > substring.length()) {
                    substring = sub;
                }
                while (map.get(c) > 1) {
                    char temp = str.charAt(left);
                    if (map.get(temp) > 1) {
                        map.put(temp, map.get(temp) - 1);
                    } else {
                        map.remove(temp);
                    }
                    left++;
                }
            } else {
                map.put(c, 1);
            }
        }
        return substring;
    }
}
