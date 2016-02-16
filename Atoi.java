// Implement atoi to convert a string to an integer.
// Input : "9 2704"
// Output : 9
// If int overflows, return INT_MAX if positive and INT_MIN if negative
// Do not use library function

public int atoi(String a) {
    int i = 0;
    long result = 0;
    int multFactor = 10;
    int negative = 1;

    while (a.charAt(i) == ' ') {
        i++;
    }
    if (!(a.charAt(i) == '-') && !Character.isDigit(a.charAt(i)) && !(a.charAt(i) == '+')) {
        return 0;
    }
    if (a.charAt(i) == '-') {
        negative = -1;
        i++;
    }
    if (a.charAt(i) == '+') {
        i++;
    }
    while (i < a.length() && a.charAt(i) != ' ' && Character.isDigit(a.charAt(i))) {
        result = (result * multFactor) + ((int)(a.charAt(i) - '0'));
        if (result > Integer.MAX_VALUE && negative == 1) {
            return Integer.MAX_VALUE;
        }
        if (result > Integer.MAX_VALUE && negative == -1) {
            return Integer.MIN_VALUE;
        }
        i++;
        multFactor = multFactor * 10;
    }
    return ((int)result) * negative;
}
