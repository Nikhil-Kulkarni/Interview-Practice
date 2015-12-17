// Given two words (start and end), and a dictionary, find the length of shortest
// transformation sequence from start to end, such that only one letter can be changed
// at a time and each intermediate word must exist in the dictionary. For example, given:
// start = "hit"
// end = "cog"
// dict = ["hot","dot","dog","lot","log"]
// "hit" -> "hot" -> "dot" -> "dog" -> "cog"
import java.util.*;
public class WordLadder {
    public static void main(String[] args) {
        String start = "hit";
        String end = "cog";
        HashSet<String> set = new HashSet<>();
        set.add("hot");
        set.add("dot");
        set.add("dog");
        set.add("lot");
        set.add("log");
        System.out.println(shortestTransform(start, end, set));
    }

    public static int shortestTransform(String start, String end, HashSet<String> dict) {
        if (start.equals(end)) {
            return 1;
        }
        int min = dict.size();
        for (int i = 0; i < start.length(); i++) {
            char[] t = start.toCharArray();
            char temp = t[i];
            for (char c = 'a'; c <= 'z'; c++) {
                t[i] = c;
                String newStart = new String(t);
                if (dict.contains(newStart)) {
                    dict.remove(newStart);
                    int subMin = 1 + shortestTransform(newStart, end, dict);
                    if (subMin < min) {
                        min = subMin;
                    }
                }
            }
            t[i] = temp;
        }
        return min;
    }
}
