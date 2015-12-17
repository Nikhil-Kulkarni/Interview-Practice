// Given a string s, determine the length of the last word in the string
// Try not to use java library functions like 'split'
// Ex. "Hello World" should return 5

public int lengthOfLast(String s) {
    int end = s.length() - 1;
    int count = 0;
    if (s.length() == 0) {
        return -1;
    }
    if (s.charAt(end) == ' ') {
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
    }
    while (end >= 0 && s.charAt(end) != ' ') {
        count++;
        end--;
    }
    return count;
}
