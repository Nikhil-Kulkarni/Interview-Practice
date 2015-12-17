// Print all possible words from phone digits

public void permute(int[] number, String output, int current, HashMap<Integer, String> map) {
    if (output.length() == number.length || current == number.length) {
        System.out.println(output);
        return;
    }
    for (int i = 0; i < map.get(number[current]).length(); i++) {
        output += map.get(number[current]).charAt(i);
        permute(number, output, current + 1, map);
    }
}

public void permuteInit(int[] number) {

}
