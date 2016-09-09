// Print all permutations of combinations of characters from a string array

public class PermuteMultipleStrings {
    public static void main(String[] args) {
        String[] words = {"abc", "def", "ghi"};
        permute(words, 0, "");
    }

    public static void permute(String[] words, int depth, String permutation) {
        if (permutation.length() == words.length) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < words.length; i++) {
            permute(words, depth + 1, permutation + words[depth].charAt(i));
        }
    }
}
