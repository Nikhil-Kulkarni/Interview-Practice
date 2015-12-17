// Given two binary strings, add them and return them as a String
// '10001' + '101' = '10110'

public String addBinary(String a, String b) {
    StringBuilder result = new StringBuilder();
    if (b.length() > a.length()) {
        String temp = a;
        a = b;
        b = temp;
    }
    int carry = 0;
    int j = b.length() - 1;
    for (int i = a.length() - 1; i >= 0; i--, j--) {
        int m = 0;
        int n = 0;
        m = a.charAt(i) - '0';
        if (j >= 0) {
            n = b.charAt(j) - '0';
        }
        result.append((carry + m + n) % 2);
        carry = (carry + m + n) / 2;
    }
    if (carry != 0) {
        result.append(carry);
    }
    return result.reverse().toString();
}
