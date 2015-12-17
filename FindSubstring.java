// Give two strings, find if the first is a substring of the second
// Booyer-Moore Algorithm
public boolean findSubstring(String pattern, String text) {
    int[] lastTable = buildLastTable(pattern);
    int i = 0;
    while (i < text.length() - pattern.length() + 1) {
        int textIndex = pattern.length() + i - 1;
        boolean mismatch = false;
        for (int patternIndex = pattern.length() - 1; patternIndex >= 0; patternIndex--, textIndex--) {
            if (pattern.charAt(patternIndex) != text.charAt(textIndex)) {
                mismatch = true;
                int index = lastTable[text.charAt(textIndex)];
                if (index != -1 && index < patternIndex) {
                    i += patternIndex - index;
                }
                else if (index != -1 && index > patternIndex) {
                    i += 1;
                }
                else {
                    // index == -1
                    i += textIndex + 1;
                }
                patternIndex = -1;
            }
        }
        if (!mismatch) {
            return true;
        }
    }
    return false;
}

public int[] buildLastTable(String pattern) {
    int[] lastTable = new int[128];
    for (int i = 0; i < lastTable.length; i++) {
        lastTable[i] = -1;
    }
    for (int j = 0; j < lastTable.length; j++) {
        lastTable[pattern.charAt(j)] = j;
    }
    return lastTable;
}
