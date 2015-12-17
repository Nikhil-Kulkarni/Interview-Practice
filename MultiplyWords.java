// Given a list of words, find the greatest product between words that do not
// share any characters

public class MultiplyWords {
    public static void main(String[] args) {
        String[] words = {"ABC", "CBAS", "DEWQA", "ZA", "XYZ"};
        System.out.println(multiply(words));
    }

    public static int multiply(String[] words) {
        int max = 0;
        for (int j = 0; j < words.length - 1; j++) {
            String curr = words[j];
            for (int i = j + 1; i < words.length; i++) {
                String comp = words[i];
                if (unique(comp, curr)) {
                    if ((curr.length() * comp.length()) > max) {
                        max = curr.length() * comp.length();
                    }
                }
            }
        }
        return max;
    }

    public static boolean unique(String a, String b) {
        int[] map = new int[256];
        for (int i = 0; i < a.length(); i++) {
            map[a.charAt(i)]++;
        }
        for (int i = 0; i < b.length(); i++) {
            if (map[b.charAt(i)] > 0) {
                return false;
            }
        }
        return true;
    }
}
