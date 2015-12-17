// Assume you have a method isSubstring which checks if one work is a substring of another.
// Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring.
// Ex. waterbottle is a rotation of erbottlewat

public boolean isRotation(String s1, String s2) {
    if (s1.length() != s2.length()) {
        return false;
    }
    s1 = s1 + s1;
    return isSubstring(s1, s2);
}
