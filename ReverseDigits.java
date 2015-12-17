// Reverse the digits of an integer
// If the result overflows return 0
// 123 -> 321
// -123 -> -321

public int reverseDigits(int n) {
    int multFactor = 10;
    long result = 0;
    int negative = 1;
    if (n < 0) {
        n *= -1;
        negative = -1;
    }
    while (n != 0) {
        result *= multFactor;
        result += n % 10;
        if (result > Integer.MAX_VALUE) {
            return 0;
        }
        n /= 10;
    }
    return ((int)result) * negative;
}
