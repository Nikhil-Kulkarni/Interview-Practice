// Given a column title as appears in an Excel sheet, return its corresponding column number
// A -> 1
// C -> 3
// AA -> 27
// AB -> 28

public int excelToColumn (String title) {
    int colNum = 0;
    int t = 0;
    for (int i = str.length() - 1; i >= 0; i++) {
        colNum += (int)Math.pow(26, t) * ((int) str.char(i) - 'A' + 1);
        t++;
    }
    return colNum;
}
