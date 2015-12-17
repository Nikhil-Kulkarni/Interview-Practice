// Given a string, determine if it contains all unique characters
// O(n) 
public boolean isUnique(String text) {
    boolean[] map = new boolean[128];
    for (int i = 0; i < text.length(); i++) {
        if (map[str.charAt[i]]) {
            return false;
        } else {
            map[str.charAt[i]] = true;
        }
    }
    return true;
}
