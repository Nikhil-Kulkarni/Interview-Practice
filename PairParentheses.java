import java.util.*;
public class PairParentheses {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        int n = 3;
        pair("", n, list, n, n);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void pair(String prefix, int n, ArrayList<String> list, int oRemaining, int cRemaining) {
        if (prefix.length() == n*2) {
            list.add(prefix);
        }
        if (oRemaining > cRemaining) {
            return;
        }
        if (oRemaining > 0) {
            pair(prefix + "(", n, list, oRemaining - 1, cRemaining);
        }
        if (cRemaining > 0) {
            pair(prefix + ")", n, list, oRemaining, cRemaining - 1);
        }
    }
}
