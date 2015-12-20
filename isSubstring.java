public List<Integer> kmp(CharSequence pattern, CharSequence text) {

    if (pattern == null || text == null || pattern == "") {
        throw new IllegalArgumentException("Invalid input");
    }
    List<Integer> list = new ArrayList<Integer>();
    int n = text.length();
    int m = pattern.length();
    System.out.println(n);
    if (m == 0) {
        return list;
    }
    int[] fail = buildFailureTable(pattern);
    int j = 0;
    int k = 0;
    while (j < n) {
        if (text.charAt(j) == pattern.charAt(k)) {
            if (k == m - 1) {
                list.add(j - m + 1);
                k = 0;
            }
            j++;
            k++;
        } else if (k > 0) {
            k = fail[k - 1];
        } else {
            j++;
        }
    }
    return list;
}

@Override
public int[] buildFailureTable(CharSequence pattern) {
    if (pattern == null) {
        throw new IllegalArgumentException("Invalid input");
    }
    int m = pattern.length();
    int[] fail = new int[m];
    int j = 1;
    int k = 0;
    while (j < m) {
        if (pattern.charAt(j) == pattern.charAt(k)) {
            fail[j] = k + 1;
            j++;
            k++;
        } else if (k > 0) {
            k = fail[k - 1];
        } else {
            j++;
        }
    }
    return fail;
}

@Override
public List<Integer> boyerMoore(CharSequence pattern, CharSequence text) {
    if (pattern == null | text == null || pattern.length() == 0) {
        throw new IllegalArgumentException("Invalid input");
    }

    List<Integer> list = new ArrayList<>();
    int[] lastTable = buildLastTable(pattern);
    int i = 0;
    while (i < text.length() - pattern.length() + 1) {
        boolean mismatch = false;
        int textIndex = i + pattern.length() - 1;
        for (int patternIndex = pattern.length() - 1;
                patternIndex >= 0; patternIndex--, textIndex--) {
            char p = pattern.charAt(patternIndex);
            char t = text.charAt(textIndex);
            if (p != t) {
                mismatch = true;
                int temp = -1;
                if (lastTable[t] != -1) {
                    temp = lastTable[t];
                }

                if (temp != -1 && temp < patternIndex) {
                    i += patternIndex - temp;
                } else if (temp != -1) {
                    i += 1;
                } else {
                    i = textIndex + 1;
                }
                patternIndex = -1;
            }
        }
        if (!mismatch) {
            list.add(i);
            i++;
        }
    }
    return list;
}

@Override
public int[] buildLastTable(CharSequence pattern) {
    if (pattern == null) {
        throw new IllegalArgumentException("Invalid input");
    }
    int[] table = new int[Character.MAX_VALUE + 1];
    for (int i = 0; i < table.length; i++) {
        table[i] = -1;
    }
    for (int i = 0; i < pattern.length(); i++) {
        table[pattern.charAt(i)] = i;
    }
    return table;
}
