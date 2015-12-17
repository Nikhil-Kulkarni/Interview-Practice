// Write a program to generate all possible lowercase and uppercase combination {'AB',‘Ab’,'aB' and 'ab'}

public ArrayList<String> generateCases(String str) {
    int setSize = Math.pow(2, str);
    ArrayList<String> list = new ArrayList<String>();
    for (int counter = 0; counter < setSize; count++) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (counter & 1 << j) {
                str.append(str.charAt(i).toUpperCase());
            } else {
                str.append(str.charAt(i).toLowerCase());
            }
        }
        list.add(str);
    }
    return list;
}
