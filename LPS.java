// Finding the longest palindromic substring is a classic problem of coding interview
// O(n^3) solution is to check every substring

// Better solution is O(n^2)
public String lps(String str) {
    if (str.length() <= 1) {
        return str;
    }
    String longest = str.substring(0, 1);
    for (int i = 0; i < str.length(); i++) {
        String temp = calculateSubstring(str, i, i);
        if (temp.length() > longest.length()) {
            longest = temp;
        }

        String temp = calculateSubstring(str, i, i+1);
        if (temp.length() > longest.length()) {
            longest = temp;
        }
    }
    return temp;
}

public String calculateSubstring(String str, int begin, int end) {
    while (begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)) {
        begin--;
        end++;
    }
    return str.substring(begin + 1, end);
}
