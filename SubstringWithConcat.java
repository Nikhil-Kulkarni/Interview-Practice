import java.util.*;
// You are given a string, s, and a list of words, words, that are all of the same length.
// Find all starting indices of substring(s) in s that is a concatenation of each word in
// words exactly once and without any intervening characters.
// "foobarthefoothebarthebarbarfoo", ["foo, bar, the"]
public class SubstringWithConcat {
    public static void main(String[] args) {
        String str = "foobarthefoothebarthebarbarfoo";
        String[] words = {"foo" , "bar" , "the"};
        ArrayList<Integer> list = findIndices(str, words);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static ArrayList<Integer> findIndices(String str, String[] words) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            } else {
                map.put(words[i], 1);
            }
        }
        int len = words[0].length();
        for (int j = 0; j < len; j++) {
            int left = j;
            int count = 0;
            HashMap<String, Integer> currMap = new HashMap<>();
            for (int i = j; i < str.length() - len + 1; i += len) {
                String sub = str.substring(i, i + len);
                if (map.containsKey(sub)) {
                    if (currMap.containsKey(sub)) {
                        currMap.put(sub, currMap.get(sub) + 1);
                    } else {
                        currMap.put(sub, 1);
                    }
                    count++;
                    while (currMap.get(sub) > map.get(sub)) {
                        String temp = str.substring(left, left + len);
                        currMap.put(temp, currMap.get(temp) - 1);
                        left = left + len;
                        count--;
                    }
                    if (count == words.length) {
                        list.add(left);
                        String temp = str.substring(left, left + len);
                        currMap.put(temp, currMap.get(temp) - 1);
                        count--;
                        left = left + len;
                    }
                } else {
                    count = 0;
                    left = i + len;
                    map.clear();
                }
            }
        }
        return list;
    }
}
