// Given two string, determine if they are permutations of each other
// Ex. nikhil, khilni -- true
// Ex. abcdef, accdef -- false
// O(2n)

public boolean isPermuation(String a, String b) {
    int[] map = new int[128];
    if (a.length() != b.length()) {
        return false;
    }
    for (int i = 0; i < a.length(); i++) {
        map[a.charAt[i]]++;
    }

    for (int j = 0; j < b.length(); j++) {
        map[b.charAt[j]]--;
        if (map[b.charAt[j]] < 0) {
            return false;
        }
    }
    return true;
}
