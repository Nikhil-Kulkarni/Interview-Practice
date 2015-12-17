// Given a list of at least 4 elements, find the highest, second highest, lowest, and second lowest elements
// [1, 7,4, 2, 9] => 9, 7, 1, 2

public int[] findElements(int[] arr) {
    int highest = Integer.MIN_VALUE;
    int secondHighest = Integer.MIN_VALUE;
    int lowest = Integer.MAX_VALUE;
    int secondLowest = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > highest) {
            highest = arr[i];
        }
        if (arr[i] > secondHighest && arr[i] < highest) {
            secondHighest = arr[i];
        }
        if (arr[i] < lowest) {
            lowest = arr[i];
        }
        if (arr[i] < secondLowest && arr[i] > lowest) {
            secondLowest = arr[i];
        }
    }
    return new int {highest, secondHighest, lowest, secondLowest};
}
