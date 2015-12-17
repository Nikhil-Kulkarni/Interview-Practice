// Given a positive integer, return its corresponding column title as appear in an Excel sheet.
// 1 -> A
// 3 -> C
// 26 -> Z
// 27 -> AA
// 28 -> AB

public String intToColumn(int col) {
    StringBuilder str = new StringBuilder();
    while (col != 0) {
        if (col > 25 && col % 26 == 0) {
            str.append('Z');
        } else {
            str.append(col % 26 - 1 + 'A');
        }
        col = (col - 1) / 26;
    }
    return str.toString();
}
