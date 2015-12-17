// Given a string, determine if you can produce a palindrome with it
// abbac => true
// aaabba => true
// aabba => false

public boolean canMakePalindrome(String str) {
    // Assumming ASCII
    int[] arr = new int[128];
    for (int i = 0; i < str.length(); i++) {
        arr[str.charAt(i)]++;
    }
    for (int j = 0; j < arr.length; j++) {
        int oddCount = 0;
        if (arr[j] % 2 != 0) {
            oddCount++;
        }
    }
    if (str.length() % 2 == 0 && oddCount == 0) {
        return true;
    }
    if (str.length() % 2 != 0 && oddCount == 1) {
        return true;
    }
    return false;
}
