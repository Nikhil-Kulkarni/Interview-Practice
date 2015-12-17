// Given an array of strings, find the Longest common prefix
// [abcw, abcdef, abcalkj, abcwe] => 'abc'

// Slightly less efficient solution
public String lcp(String [] arr) {
    int minLen = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i].length() < minLen) {
            minLen = arr[i].length();
        }
    }
    for (int j = 0; j < minLen; j++) {
        char prev = arr[0].charAt(j);
        for (int k = 0; k < arr.length; k++) {
            if (arr[k].charAt(j) != prev) {
                return arr[k].substring(0, j);
            }
            prev = arr[k].charAt(j);
        }
    }
    return arr[0].substring(0, minLen);
}

// Better solution
public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
        return "";
    }
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++) {
        int index = 0;
        String curr = strs[i];
        while (index < curr.length() && index < prefix.length()) {
            if (curr.charAt(index) != prefix.charAt(index)) {
                prefix = curr.substring(0, index);
                break;
            }
            index++;
        }
        if (index == curr.length() && index < prefix.length()) {
            prefix = curr;
        }
    }
    return prefix;
}
