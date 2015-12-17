// Print all permutations of combinations of characters from a string array

public void permute(String[] words, int depth, String permutation) {
    if (permutation.length == words.length) {
        System.out.println(permutation);
    }
    for (int i = 0; i < words.length; i++) {
        permute(words, depth + 1, permutation + words[depth].charAt(i));
    }
}
