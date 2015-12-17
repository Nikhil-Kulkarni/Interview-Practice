// Find the sum of two integers represented as strings, return the sum as string, i.e "123" and "456" would return "579".   

public String addString(String a, String b) {
    StringBuilder str = new StringBuilder();
    int carry = 0;
    if (b.length() > a.length()) {
        String temp = a;
        a = b;
        b = temp;
    }
    int m = a.length() - 1;
    int n = b.length() - 1;

    for (; m >= 0; m--, n--) {
        int x = a.charAt(m) - '0';
        int y = 0;
        if (n >= 0) {
            y = b.charAt(n);
        }
        str.append((carry + x + y) % 10);
        carry = (carry + x + y) / 10;
    }
    if (carry != 0) {
        str.append(carry);
    }
    return str.reverse().toString();
}
