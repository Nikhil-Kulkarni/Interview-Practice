//  Given a string find all possible permutations
import java.util.*;
public class PermutationsII {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        permute("abc", list, "");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void permute(String str, ArrayList<String> list, String prefix) {
        if (str.length() == 0) {
            list.add(prefix);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permute(str.substring(0, i) + str.substring(i + 1), list, prefix + str.charAt(i));
        }
    }
}
